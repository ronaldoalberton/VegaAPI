/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.nfse.equiplano.envio;

import com.vega.service.configuration.HibernateUtil;
import com.vega.service.nfse.equiplano.domain.*;
import com.vega.service.nfse.equiplano.servicos.EnfsLocator;
import com.vega.service.nfse.equiplano.servicos.EnfsSoap11BindingStub;
import com.vega.service.nfse.generic.*;
import com.vega.service.nfse.model.MovNFSe;
import com.vega.service.nfse.model.MovNotaFiscal;
import com.vega.service.nfse.model.NotaFiscalView;
import com.vega.service.util.VegaException;

import java.rmi.RemoteException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import javax.xml.rpc.ServiceException;

/**
 *
 * @author Ronaldo
 */
public class EnvioNFSeEquiplano implements IEnvioNFSe{

    @Override
    public String consultarNFSe(NotaFiscalView notaFiscalView) throws VegaException {

        String msgEnvio = null;
        String msgRetorno = null;

        LoteNFSeEquiplano loteNFSeEquiplano = new LoteNFSeEquiplano();

        msgEnvio =  loteNFSeEquiplano.criaArquivoConsultaNFSe(notaFiscalView);

        msgEnvio = Normalizer.normalize(msgEnvio, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        msgEnvio = msgEnvio.replaceAll("ns3:", "es:");
        msgEnvio = msgEnvio.replaceAll(":ns3", ":es");

        try {
            Assinador assinador = new Assinador(notaFiscalView.getCaminhoCertificado()+"\\"+ notaFiscalView.getCertificadoDigital(), notaFiscalView.getSenhaCertificado());
            msgEnvio = assinador.assinar(msgEnvio, "es:esConsultarLoteRpsEnvio", false);
        } catch (Exception e) {
            throw new VegaException(e.getMessage());
        }

        EsConsultarLoteRpsResposta esConsultarLoteRpsResposta = null;
        try {
            msgRetorno = getBindingStub(notaFiscalView).esConsultarLoteRps(notaFiscalView.getVersaoXML(),msgEnvio);
            esConsultarLoteRpsResposta = (EsConsultarLoteRpsResposta) JAXBConverter.transform(EsConsultarLoteRpsResposta.class,msgRetorno);
        } catch (RemoteException e) {
            throw new VegaException(e.getMessage());
        }

        MovNFSe movNFSe = new MovNFSe();

        if ( (esConsultarLoteRpsResposta.getListaNfse() != null ) && ( esConsultarLoteRpsResposta.getListaNfse().getNfse().size() > 0) ) {

            movNFSe.setCodigoAutenticacao(esConsultarLoteRpsResposta.getListaNfse().getNfse().get(0).getCdAutenticacao());
            movNFSe.setStatus(TypeNFSe.StatusNFSe.CONFIRMADO);

            MovNotaFiscal movNotaFiscal = new MovNotaFiscal();
            movNotaFiscal.setIdNotaFiscal(notaFiscalView.getIdNotaFiscal());
            movNotaFiscal.setNroNotaFiscal(esConsultarLoteRpsResposta.getListaNfse().getNfse().get(0).getNrNfse());

            List<Object> objects = new ArrayList<Object>();
            objects.add(movNFSe);
            objects.add(movNotaFiscal);

            HibernateUtil.saveOrUpdate(objects);

        }else{

            movNFSe.setStatus(TypeNFSe.StatusNFSe.FALHA);

            List<TcErroAlerta> tcErrosAlertas = new ArrayList<TcErroAlerta>();
            tcErrosAlertas.addAll(esConsultarLoteRpsResposta.getMensagemRetorno().getListaAlertas().getAlerta());
            tcErrosAlertas.addAll(esConsultarLoteRpsResposta.getMensagemRetorno().getListaErros().getErro());

            StringBuffer stringBuffer = new StringBuffer();

            for (TcErroAlerta erroAlerta : tcErrosAlertas ){
                stringBuffer.append(erroAlerta.getCdMensagem()).append("-");
                stringBuffer.append(erroAlerta.getDsMensagem());
                if ( erroAlerta.getDsCorrecao() != null ){
                    stringBuffer.append("\n");
                    stringBuffer.append(erroAlerta.getDsCorrecao());
                }
                stringBuffer.append("\n");
                if ( (erroAlerta.getCdMensagem().equals("1604")) || (erroAlerta.getDsMensagem().indexOf("aguardando processamento") > 0) ) {
                    movNFSe.setStatus(TypeNFSe.StatusNFSe.AGUARDANDO);
                }
            }

            HibernateUtil.saveOrUpdate(movNFSe);
        }

        return movNFSe.getStatus().toString();

    }

    @Override
    public String enviarLoteNFSe(NotaFiscalView notaFiscalView) throws VegaException {

        String msgEnvio = null;
        String msgRetorno = null;

        LoteNFSeEquiplano loteNFSeEquiplano = new LoteNFSeEquiplano();

        msgEnvio =  loteNFSeEquiplano.criaArquivoEnvioLote(notaFiscalView);

        msgEnvio = Normalizer.normalize(msgEnvio, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        msgEnvio = msgEnvio.replaceAll("ns3:", "es:");
        msgEnvio = msgEnvio.replaceAll(":ns3", ":es");

        try {
            Assinador assinador = new Assinador(notaFiscalView.getCaminhoCertificado()+"\\"+ notaFiscalView.getCertificadoDigital(), notaFiscalView.getSenhaCertificado());
            msgEnvio = assinador.assinar(msgEnvio, "es:enviarLoteRpsEnvio", false);
        } catch (Exception e) {
            throw new VegaException(e.getMessage());
        }

        EnviarLoteRpsResposta enviarLoteRpsResposta = null;
    	try {
            msgRetorno = getBindingStub(notaFiscalView).esRecepcionarLoteRps(notaFiscalView.getVersaoXML(),msgEnvio);
            enviarLoteRpsResposta = (EnviarLoteRpsResposta) JAXBConverter.transform(EnviarLoteRpsResposta.class,msgRetorno);
        } catch (RemoteException e) {
            throw new VegaException(e.getMessage());		
        }

        MovNFSe movNFSe = new MovNFSe();
        movNFSe.setIdNotaFiscal(notaFiscalView.getIdNotaFiscal());
        movNFSe.setAmbienteNFSe(notaFiscalView.getAmbienteNFSe());
        movNFSe.setCodigoAutenticacao(null);
        movNFSe.setProtocoloRecebimento(null);
        movNFSe.setXml(msgEnvio);

        if ( enviarLoteRpsResposta.getProtocolo() != null ){

            movNFSe.setProtocoloRecebimento(enviarLoteRpsResposta.getProtocolo().getNrProtocolo().toString());
            movNFSe.setStatus(TypeNFSe.StatusNFSe.AGUARDANDO);
            movNFSe.setMsg(movNFSe.getProtocoloRecebimento());

        }else {

            movNFSe.setStatus(TypeNFSe.StatusNFSe.FALHA);

            List<TcErroAlerta> tcErrosAlertas = new ArrayList<TcErroAlerta>();
            tcErrosAlertas.addAll(enviarLoteRpsResposta.getMensagemRetorno().getListaAlertas().getAlerta());
            tcErrosAlertas.addAll(enviarLoteRpsResposta.getMensagemRetorno().getListaErros().getErro());

            StringBuffer stringBuffer = new StringBuffer();

            for (TcErroAlerta erroAlerta : tcErrosAlertas ){
                stringBuffer.append(erroAlerta.getCdMensagem()).append("-");
                stringBuffer.append(erroAlerta.getDsMensagem());
                if ( erroAlerta.getDsCorrecao() != null ){
                    stringBuffer.append("\n");
                    stringBuffer.append(erroAlerta.getDsCorrecao());
                }
                stringBuffer.append("\n");
            }

            movNFSe.setMsg(stringBuffer.toString());
        }

        HibernateUtil.saveOrUpdate(movNFSe);

        if ( movNFSe.getStatus() == TypeNFSe.StatusNFSe.AGUARDANDO ){

        }

        return movNFSe.getStatus().toString();
    }

    @Override
    public String cancelarNFSe(NotaFiscalView notaFiscalView) throws VegaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String downloadFileNFSe(NotaFiscalView notaFiscalView) throws VegaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getURLWebService(NotaFiscalView notaFiscalView) throws VegaException {
        if ( notaFiscalView.getAmbienteNFSe() == 1  ){
            return "https://www.esnfs.com.br:8444/enfsws/services/Enfs.EnfsHttpsSoap11Endpoint/";
        }else{
            return "https://www.esnfs.com.br:9444/homologacaows/services/Enfs.EnfsHttpsSoap11Endpoint/";
        }
    }

    private EnfsSoap11BindingStub getBindingStub(NotaFiscalView notaFiscalView) throws VegaException {

        EnfsLocator enfsLocator = new EnfsLocator();
        enfsLocator.setEnfsHttpsSoap11EndpointEndpointAddress(this.getURLWebService(notaFiscalView));
        EnfsSoap11BindingStub enfsSoap11BindingStub;

        try {
            enfsSoap11BindingStub = (EnfsSoap11BindingStub) enfsLocator.getEnfsHttpsSoap11Endpoint();
        } catch (ServiceException e) {
            throw new VegaException(e.getMessage());
        }

        return enfsSoap11BindingStub;

    }

}
