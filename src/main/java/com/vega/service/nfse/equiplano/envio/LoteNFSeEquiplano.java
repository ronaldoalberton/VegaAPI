/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.nfse.equiplano.envio;

import com.vega.service.nfse.equiplano.domain.*;
import com.vega.service.nfse.generic.ILoteNFSe;
import com.vega.service.nfse.model.NotaFiscalItensView;
import com.vega.service.nfse.model.NotaFiscalView;
import com.vega.service.util.VegaException;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Ronaldo
 */
public class LoteNFSeEquiplano implements ILoteNFSe{

    @Override
    public String criaArquivoEnvioLote(NotaFiscalView notaFiscalView) throws VegaException {

        /*Cria as classes utilizadas*/
        EnviarLoteRpsEnvio enviarLoteRpsEnvio = new EnviarLoteRpsEnvio();
        EnviarLoteRpsEnvio.Lote lote = new EnviarLoteRpsEnvio.Lote();
        EnviarLoteRpsEnvio.Lote.ListaRps listaRps = new EnviarLoteRpsEnvio.Lote.ListaRps();
        TcRps tcRps = new TcRps();
        TcRps.ListaServicos listaServicos = new TcRps.ListaServicos();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        /*Informações do RPS*/
        tcRps.setTpTributacao(notaFiscalView.getTipoTributacaoIss().intValue());
        tcRps.setNrRps(notaFiscalView.getNroRps());
        tcRps.setNrEmissorRps(new BigInteger(notaFiscalView.getSerieNota()));
        tcRps.setDtEmissaoRps(dateFormat.format(notaFiscalView.getDataEmissao()));
        tcRps.setStRps(1);
        tcRps.setIsIssRetido((notaFiscalView.getValorRetIss().doubleValue() > 0.00) ? 1 : 2);
        tcRps.setVlTotalRps(notaFiscalView.getValorTotal());
        tcRps.setVlLiquidoRps(notaFiscalView.getValorLiquido());

        /*Informações do Tomador do Serviço*/
        TcDocumento tcDocumento = new TcDocumento();
        tcDocumento.setNrDocumento(notaFiscalView.getCnpjCpfCliente());
        if ( tcDocumento.getNrDocumento().length() == 14 ){
            tcDocumento.setTpDocumento(2);
        }else{
            tcDocumento.setTpDocumento(2);
        }
        TcTomador tcTomador = new TcTomador();
        tcTomador.setDocumento(tcDocumento);
        tcTomador.setNmTomador(notaFiscalView.getIdCliente()+"-"+ notaFiscalView.getNomeCliente());
        if ( (notaFiscalView.getEmailCliente() != null) && (notaFiscalView.getEmailCliente().trim().length() > 0 ) ){
            tcTomador.setDsEmail(notaFiscalView.getEmailCliente());
        }else{
            tcTomador.setDsEmail(notaFiscalView.getEmailContatoCliente());
        }
        tcTomador.setNrInscricaoEstadual(notaFiscalView.getIECliente());
        tcTomador.setDsEndereco(notaFiscalView.getEnderecoCliente());
        tcTomador.setNrEndereco(notaFiscalView.getNumeroCliente());
        tcTomador.setDsComplemento(notaFiscalView.getComplementoCliente());
        tcTomador.setNmBairro(notaFiscalView.getBairroCliente());
        tcTomador.setNrCidadeIbge(notaFiscalView.getCodigoIbgeCliente());
        tcTomador.setNmUf(notaFiscalView.getUFCliente());
        tcTomador.setNmPais("Brasil");
        tcTomador.setNrCep(notaFiscalView.getCEPCliente().toString());
        tcTomador.setNrTelefone(notaFiscalView.getFoneCliente());

        tcRps.setTomador(tcTomador);

        /*Informação dos serviços */
        for ( NotaFiscalItensView notaFiscalItem : notaFiscalView.getNotaFiscalItens() ) {

            TcServico tcServico = new TcServico();

            String classServico = notaFiscalItem.getClassificacao();

            int posFistDot = classServico.indexOf(".");
            int posLastDot = classServico.indexOf(".", posFistDot + 1);
            int nrServicoItem = Integer.valueOf(classServico.substring(0, posFistDot));
            int nrServicoSubItem = Integer.valueOf(classServico.substring(posFistDot + 1, posLastDot));

            tcServico.setNrServicoItem(new BigInteger(String.valueOf(nrServicoItem)));
            tcServico.setNrServicoSubItem(new BigInteger(String.valueOf(nrServicoSubItem)));
            tcServico.setVlServico(notaFiscalItem.getValorServico());
            tcServico.setVlAliquota(notaFiscalItem.getAliquotaIss());

            if ( notaFiscalItem.getValorDesconto().floatValue() > 0.00 ){
                TcDeducao tcDeducao = new TcDeducao();
                tcDeducao.setVlDeducao(notaFiscalItem.getValorDesconto());
                tcDeducao.setDsJustificativaDeducao("Desconto sobre o serviço");
                tcServico.setDeducao(tcDeducao);
            }
            tcServico.setVlBaseCalculo(notaFiscalItem.getBaseCalculoIss());
            tcServico.setVlIssServico(notaFiscalItem.getValorIss());

            String descricaoServico = null;
            descricaoServico = "Qtde.: "+String.valueOf(notaFiscalItem.getQuantidade())+
                                " Vlr. Unit.: "+String.valueOf(notaFiscalItem.getValorUnitario());
            descricaoServico = descricaoServico + "\n" + notaFiscalItem.getDescricaoServico();

            boolean ultimoServico = ((notaFiscalView.getNotaFiscalItens().indexOf(notaFiscalItem)+1) == notaFiscalView.getNotaFiscalItens().size());

            if ( (ultimoServico) && (notaFiscalItem.getObsDigitada() != null) ){
                tcServico.setDsDiscriminacaoServico(descricaoServico+"\n"+"."+"\n"+"."+"\n"+notaFiscalItem.getObsDigitada());
            }else{
                tcServico.setDsDiscriminacaoServico(descricaoServico);
            }

            listaServicos.getServico().add(tcServico);

        }

        //Adiciona a lista de serviços ao RPS
        tcRps.setListaServicos(listaServicos);

        /*Retenções da nota fiscal*/
        TcRetencoes tcRetencoes = new TcRetencoes();
        if ( notaFiscalView.getValorRetCofins().floatValue() > 0.00 ){
            tcRetencoes.setVlCofins(notaFiscalView.getValorRetCofins());
        }
        if ( notaFiscalView.getValorRetCsll().floatValue() > 0.00 ){
            tcRetencoes.setVlCsll(notaFiscalView.getValorRetCsll());
        }
        if ( notaFiscalView.getValorRetInss().floatValue() > 0.00 ){
            tcRetencoes.setVlInss(notaFiscalView.getValorRetInss());
        }
        if ( notaFiscalView.getValorRetIrrf().floatValue() > 0.00 ){
            tcRetencoes.setVlIrrf(notaFiscalView.getValorRetIrrf());
        }
        if ( notaFiscalView.getValorRetPis().floatValue() > 0.00 ){
            tcRetencoes.setVlPis(notaFiscalView.getValorRetPis());
        }
        if ( notaFiscalView.getValorRetIss().floatValue() > 0.00 ){
            tcRetencoes.setVlIss(notaFiscalView.getValorRetIss());
        }
        if ( notaFiscalView.getAliqRetCofins().floatValue() > 0.00 ){
            tcRetencoes.setVlAliquotaCofins(notaFiscalView.getAliqRetCofins());
        }
        if ( notaFiscalView.getAliqRetCsll().floatValue() > 0.00 ){
            tcRetencoes.setVlAliquotaCsll(notaFiscalView.getAliqRetCsll());
        }
        if ( notaFiscalView.getAliqRetInss().floatValue() > 0.00 ){
            tcRetencoes.setVlAliquotaInss(notaFiscalView.getAliqRetInss());
        }
        if ( notaFiscalView.getAliqRetIrrf().floatValue() > 0.00 ){
            tcRetencoes.setVlAliquotaIrrf(notaFiscalView.getAliqRetIrrf());
        }
        if ( notaFiscalView.getAliqRetPis().floatValue() > 0.00 ){
            tcRetencoes.setVlAliquotaPis(notaFiscalView.getAliqRetPis());
        }
        tcRps.setRetencoes(tcRetencoes);

        /*Adiciona o rps na lista de RPSs*/
        listaRps.getRps().add(tcRps);

        /*Dados do Prestador*/
        TcPrestador tcPrestador = new TcPrestador();
        tcPrestador.setIdEntidade(notaFiscalView.getCodigoMunicipioNFSe());
        tcPrestador.setIsOptanteSimplesNacional(notaFiscalView.getRegimeTributarioEmpresa());
        tcPrestador.setNrCnpj(notaFiscalView.getCnpjEmpresa());
        tcPrestador.setNrInscricaoMunicipal(notaFiscalView.getIMEmpresa());

        /*Adiciona o prestador no lote*/
        lote.setPrestador(tcPrestador);

        lote.setNrLote(notaFiscalView.getNroLoteNFSe().intValue());
        lote.setNrVersaoXml(Integer.valueOf(notaFiscalView.getVersaoXML()));
        lote.setQtRps(1);

        /*Adiciona a lista de RPS no lote*/
        lote.setListaRps(listaRps);

        /*Adiciona o lote na mensagem de envio*/
        enviarLoteRpsEnvio.setLote(lote);

        return enviarLoteRpsEnvio.toXML();
    }
    

    @Override
    public String criaArquivoCancelamentoNFSe(NotaFiscalView notaFiscalView) throws VegaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String criaArquivoConsultaNFSe(NotaFiscalView notaFiscalView) throws VegaException {

        EsConsultarLoteRpsEnvio esConsultarLoteRpsEnvio = new EsConsultarLoteRpsEnvio();
        TcIdentificacaoPrestador tcIdentificacaoPrestador = new TcIdentificacaoPrestador();

        tcIdentificacaoPrestador.setNrInscricaoMunicipal(notaFiscalView.getIMEmpresa());
        tcIdentificacaoPrestador.setCnpj(notaFiscalView.getCnpjEmpresa());
        tcIdentificacaoPrestador.setIdEntidade(notaFiscalView.getCodigoMunicipioNFSe());

        esConsultarLoteRpsEnvio.setPrestador(tcIdentificacaoPrestador);
        esConsultarLoteRpsEnvio.setNrLoteRps(notaFiscalView.getNroLoteNFSe());

        return esConsultarLoteRpsEnvio.toXML();

    }

    
}
