//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Estrutura da pessoa
 * 
 * <p>Classe Java de tcPessoaHomologacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcPessoaHomologacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEntidade" type="{http://www.equiplano.com.br/esnfs/tipos}tsIdEntidade"/>
 *         &lt;element name="tpPessoa" type="{http://www.equiplano.com.br/esnfs/tipos}tsTpPessoa"/>
 *         &lt;element name="stPessoa" type="{http://www.equiplano.com.br/esnfs/tipos}tsStPessoa"/>
 *         &lt;element name="nmPessoa" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmPessoa"/>
 *         &lt;element name="nrInscricaoMunicipal" type="{http://www.equiplano.com.br/esnfs/tipos}tsInscricaoMunicipal" minOccurs="0"/>
 *         &lt;element name="nrInscricaoEstadual" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrInscricaoEstadual" minOccurs="0"/>
 *         &lt;element name="nrDocumentoContador" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrDocumentoContador" minOccurs="0"/>
 *         &lt;element name="nmFantasia" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmFantasia" minOccurs="0"/>
 *         &lt;element name="nrDocumento" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrDocumento"/>
 *         &lt;element name="nrCep" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrCep" minOccurs="0"/>
 *         &lt;element name="dsEndereco" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsEndereco"/>
 *         &lt;element name="nrEndereco" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrEndereco" minOccurs="0"/>
 *         &lt;element name="dsComplemento" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsComplemento" minOccurs="0"/>
 *         &lt;element name="nmBairro" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmBairro"/>
 *         &lt;element name="nmCidade" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmCidade"/>
 *         &lt;element name="nmUf" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmUf"/>
 *         &lt;element name="nmPais" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmPais"/>
 *         &lt;element name="nrTelefone" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrTelefone" minOccurs="0"/>
 *         &lt;element name="dsEmail" type="{http://www.equiplano.com.br/esnfs/tipos}tsEmail" minOccurs="0"/>
 *         &lt;element name="dsEnderecoWeb" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsEnderecoWeb" minOccurs="0"/>
 *         &lt;element name="dtEnquadramentoSimples" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="nmContato" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmContato" minOccurs="0"/>
 *         &lt;element name="tpOpcaoSimplesNfs" type="{http://www.equiplano.com.br/esnfs/tipos}tsSimNao"/>
 *         &lt;element name="dsEmailNfs" type="{http://www.equiplano.com.br/esnfs/tipos}tsEmail" minOccurs="0"/>
 *         &lt;element name="isReceberEMailNfsRecebida" type="{http://www.equiplano.com.br/esnfs/tipos}tsSimNao" minOccurs="0"/>
 *         &lt;element name="isEnvEMailContadorNfsEmitida" type="{http://www.equiplano.com.br/esnfs/tipos}tsSimNao" minOccurs="0"/>
 *         &lt;element name="dsFraseSeguranca" type="{http://www.equiplano.com.br/esnfs/tipos}tsFraseSeguranca" minOccurs="0"/>
 *         &lt;element name="dtEmissaoNfsSolicitacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtEmissaoNfsAutorizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="qtMediaNotasEmitidas" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isEnvioArquivoLote" type="{http://www.equiplano.com.br/esnfs/tipos}tsIsEnvioArquivoLote" minOccurs="0"/>
 *         &lt;element name="qtEmissoresRps" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isAuthorizedWebServices" type="{http://www.equiplano.com.br/esnfs/tipos}tsSimNao" minOccurs="0"/>
 *         &lt;element name="stEmissaoNfsAutorizacao" type="{http://www.equiplano.com.br/esnfs/tipos}tsStEmissaoNfsAutorizacao" minOccurs="0"/>
 *         &lt;element name="servicos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="servico" type="{http://www.equiplano.com.br/esnfs/tipos}tcServicoIntegracao" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcPessoaHomologacao", propOrder = {
    "idEntidade",
    "tpPessoa",
    "stPessoa",
    "nmPessoa",
    "nrInscricaoMunicipal",
    "nrInscricaoEstadual",
    "nrDocumentoContador",
    "nmFantasia",
    "nrDocumento",
    "nrCep",
    "dsEndereco",
    "nrEndereco",
    "dsComplemento",
    "nmBairro",
    "nmCidade",
    "nmUf",
    "nmPais",
    "nrTelefone",
    "dsEmail",
    "dsEnderecoWeb",
    "dtEnquadramentoSimples",
    "nmContato",
    "tpOpcaoSimplesNfs",
    "dsEmailNfs",
    "isReceberEMailNfsRecebida",
    "isEnvEMailContadorNfsEmitida",
    "dsFraseSeguranca",
    "dtEmissaoNfsSolicitacao",
    "dtEmissaoNfsAutorizacao",
    "qtMediaNotasEmitidas",
    "isEnvioArquivoLote",
    "qtEmissoresRps",
    "isAuthorizedWebServices",
    "stEmissaoNfsAutorizacao",
    "servicos"
})
public class TcPessoaHomologacao {

    @XmlElement(required = true)
    protected BigInteger idEntidade;
    protected int tpPessoa;
    protected int stPessoa;
    @XmlElement(required = true)
    protected String nmPessoa;
    protected String nrInscricaoMunicipal;
    protected String nrInscricaoEstadual;
    protected String nrDocumentoContador;
    protected String nmFantasia;
    @XmlElement(required = true)
    protected String nrDocumento;
    protected String nrCep;
    @XmlElement(required = true)
    protected String dsEndereco;
    protected String nrEndereco;
    protected String dsComplemento;
    @XmlElement(required = true)
    protected String nmBairro;
    @XmlElement(required = true)
    protected String nmCidade;
    @XmlElement(required = true)
    protected String nmUf;
    @XmlElement(required = true)
    protected String nmPais;
    protected String nrTelefone;
    protected String dsEmail;
    protected String dsEnderecoWeb;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtEnquadramentoSimples;
    protected String nmContato;
    protected int tpOpcaoSimplesNfs;
    protected String dsEmailNfs;
    protected Integer isReceberEMailNfsRecebida;
    protected Integer isEnvEMailContadorNfsEmitida;
    protected String dsFraseSeguranca;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtEmissaoNfsSolicitacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtEmissaoNfsAutorizacao;
    protected BigInteger qtMediaNotasEmitidas;
    protected Integer isEnvioArquivoLote;
    protected BigInteger qtEmissoresRps;
    protected Integer isAuthorizedWebServices;
    protected Integer stEmissaoNfsAutorizacao;
    protected TcPessoaHomologacao.Servicos servicos;

    /**
     * Obt�m o valor da propriedade idEntidade.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdEntidade() {
        return idEntidade;
    }

    /**
     * Define o valor da propriedade idEntidade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdEntidade(BigInteger value) {
        this.idEntidade = value;
    }

    /**
     * Obt�m o valor da propriedade tpPessoa.
     * 
     */
    public int getTpPessoa() {
        return tpPessoa;
    }

    /**
     * Define o valor da propriedade tpPessoa.
     * 
     */
    public void setTpPessoa(int value) {
        this.tpPessoa = value;
    }

    /**
     * Obt�m o valor da propriedade stPessoa.
     * 
     */
    public int getStPessoa() {
        return stPessoa;
    }

    /**
     * Define o valor da propriedade stPessoa.
     * 
     */
    public void setStPessoa(int value) {
        this.stPessoa = value;
    }

    /**
     * Obt�m o valor da propriedade nmPessoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmPessoa() {
        return nmPessoa;
    }

    /**
     * Define o valor da propriedade nmPessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmPessoa(String value) {
        this.nmPessoa = value;
    }

    /**
     * Obt�m o valor da propriedade nrInscricaoMunicipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInscricaoMunicipal() {
        return nrInscricaoMunicipal;
    }

    /**
     * Define o valor da propriedade nrInscricaoMunicipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInscricaoMunicipal(String value) {
        this.nrInscricaoMunicipal = value;
    }

    /**
     * Obt�m o valor da propriedade nrInscricaoEstadual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInscricaoEstadual() {
        return nrInscricaoEstadual;
    }

    /**
     * Define o valor da propriedade nrInscricaoEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInscricaoEstadual(String value) {
        this.nrInscricaoEstadual = value;
    }

    /**
     * Obt�m o valor da propriedade nrDocumentoContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrDocumentoContador() {
        return nrDocumentoContador;
    }

    /**
     * Define o valor da propriedade nrDocumentoContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrDocumentoContador(String value) {
        this.nrDocumentoContador = value;
    }

    /**
     * Obt�m o valor da propriedade nmFantasia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmFantasia() {
        return nmFantasia;
    }

    /**
     * Define o valor da propriedade nmFantasia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmFantasia(String value) {
        this.nmFantasia = value;
    }

    /**
     * Obt�m o valor da propriedade nrDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrDocumento() {
        return nrDocumento;
    }

    /**
     * Define o valor da propriedade nrDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrDocumento(String value) {
        this.nrDocumento = value;
    }

    /**
     * Obt�m o valor da propriedade nrCep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrCep() {
        return nrCep;
    }

    /**
     * Define o valor da propriedade nrCep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrCep(String value) {
        this.nrCep = value;
    }

    /**
     * Obt�m o valor da propriedade dsEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsEndereco() {
        return dsEndereco;
    }

    /**
     * Define o valor da propriedade dsEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsEndereco(String value) {
        this.dsEndereco = value;
    }

    /**
     * Obt�m o valor da propriedade nrEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrEndereco() {
        return nrEndereco;
    }

    /**
     * Define o valor da propriedade nrEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrEndereco(String value) {
        this.nrEndereco = value;
    }

    /**
     * Obt�m o valor da propriedade dsComplemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsComplemento() {
        return dsComplemento;
    }

    /**
     * Define o valor da propriedade dsComplemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsComplemento(String value) {
        this.dsComplemento = value;
    }

    /**
     * Obt�m o valor da propriedade nmBairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmBairro() {
        return nmBairro;
    }

    /**
     * Define o valor da propriedade nmBairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmBairro(String value) {
        this.nmBairro = value;
    }

    /**
     * Obt�m o valor da propriedade nmCidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmCidade() {
        return nmCidade;
    }

    /**
     * Define o valor da propriedade nmCidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmCidade(String value) {
        this.nmCidade = value;
    }

    /**
     * Obt�m o valor da propriedade nmUf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmUf() {
        return nmUf;
    }

    /**
     * Define o valor da propriedade nmUf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmUf(String value) {
        this.nmUf = value;
    }

    /**
     * Obt�m o valor da propriedade nmPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmPais() {
        return nmPais;
    }

    /**
     * Define o valor da propriedade nmPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmPais(String value) {
        this.nmPais = value;
    }

    /**
     * Obt�m o valor da propriedade nrTelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrTelefone() {
        return nrTelefone;
    }

    /**
     * Define o valor da propriedade nrTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrTelefone(String value) {
        this.nrTelefone = value;
    }

    /**
     * Obt�m o valor da propriedade dsEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsEmail() {
        return dsEmail;
    }

    /**
     * Define o valor da propriedade dsEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsEmail(String value) {
        this.dsEmail = value;
    }

    /**
     * Obt�m o valor da propriedade dsEnderecoWeb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsEnderecoWeb() {
        return dsEnderecoWeb;
    }

    /**
     * Define o valor da propriedade dsEnderecoWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsEnderecoWeb(String value) {
        this.dsEnderecoWeb = value;
    }

    /**
     * Obt�m o valor da propriedade dtEnquadramentoSimples.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEnquadramentoSimples() {
        return dtEnquadramentoSimples;
    }

    /**
     * Define o valor da propriedade dtEnquadramentoSimples.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEnquadramentoSimples(XMLGregorianCalendar value) {
        this.dtEnquadramentoSimples = value;
    }

    /**
     * Obt�m o valor da propriedade nmContato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmContato() {
        return nmContato;
    }

    /**
     * Define o valor da propriedade nmContato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmContato(String value) {
        this.nmContato = value;
    }

    /**
     * Obt�m o valor da propriedade tpOpcaoSimplesNfs.
     * 
     */
    public int getTpOpcaoSimplesNfs() {
        return tpOpcaoSimplesNfs;
    }

    /**
     * Define o valor da propriedade tpOpcaoSimplesNfs.
     * 
     */
    public void setTpOpcaoSimplesNfs(int value) {
        this.tpOpcaoSimplesNfs = value;
    }

    /**
     * Obt�m o valor da propriedade dsEmailNfs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsEmailNfs() {
        return dsEmailNfs;
    }

    /**
     * Define o valor da propriedade dsEmailNfs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsEmailNfs(String value) {
        this.dsEmailNfs = value;
    }

    /**
     * Obt�m o valor da propriedade isReceberEMailNfsRecebida.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsReceberEMailNfsRecebida() {
        return isReceberEMailNfsRecebida;
    }

    /**
     * Define o valor da propriedade isReceberEMailNfsRecebida.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsReceberEMailNfsRecebida(Integer value) {
        this.isReceberEMailNfsRecebida = value;
    }

    /**
     * Obt�m o valor da propriedade isEnvEMailContadorNfsEmitida.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsEnvEMailContadorNfsEmitida() {
        return isEnvEMailContadorNfsEmitida;
    }

    /**
     * Define o valor da propriedade isEnvEMailContadorNfsEmitida.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsEnvEMailContadorNfsEmitida(Integer value) {
        this.isEnvEMailContadorNfsEmitida = value;
    }

    /**
     * Obt�m o valor da propriedade dsFraseSeguranca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsFraseSeguranca() {
        return dsFraseSeguranca;
    }

    /**
     * Define o valor da propriedade dsFraseSeguranca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsFraseSeguranca(String value) {
        this.dsFraseSeguranca = value;
    }

    /**
     * Obt�m o valor da propriedade dtEmissaoNfsSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEmissaoNfsSolicitacao() {
        return dtEmissaoNfsSolicitacao;
    }

    /**
     * Define o valor da propriedade dtEmissaoNfsSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEmissaoNfsSolicitacao(XMLGregorianCalendar value) {
        this.dtEmissaoNfsSolicitacao = value;
    }

    /**
     * Obt�m o valor da propriedade dtEmissaoNfsAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEmissaoNfsAutorizacao() {
        return dtEmissaoNfsAutorizacao;
    }

    /**
     * Define o valor da propriedade dtEmissaoNfsAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEmissaoNfsAutorizacao(XMLGregorianCalendar value) {
        this.dtEmissaoNfsAutorizacao = value;
    }

    /**
     * Obt�m o valor da propriedade qtMediaNotasEmitidas.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtMediaNotasEmitidas() {
        return qtMediaNotasEmitidas;
    }

    /**
     * Define o valor da propriedade qtMediaNotasEmitidas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtMediaNotasEmitidas(BigInteger value) {
        this.qtMediaNotasEmitidas = value;
    }

    /**
     * Obt�m o valor da propriedade isEnvioArquivoLote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsEnvioArquivoLote() {
        return isEnvioArquivoLote;
    }

    /**
     * Define o valor da propriedade isEnvioArquivoLote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsEnvioArquivoLote(Integer value) {
        this.isEnvioArquivoLote = value;
    }

    /**
     * Obt�m o valor da propriedade qtEmissoresRps.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtEmissoresRps() {
        return qtEmissoresRps;
    }

    /**
     * Define o valor da propriedade qtEmissoresRps.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtEmissoresRps(BigInteger value) {
        this.qtEmissoresRps = value;
    }

    /**
     * Obt�m o valor da propriedade isAuthorizedWebServices.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsAuthorizedWebServices() {
        return isAuthorizedWebServices;
    }

    /**
     * Define o valor da propriedade isAuthorizedWebServices.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsAuthorizedWebServices(Integer value) {
        this.isAuthorizedWebServices = value;
    }

    /**
     * Obt�m o valor da propriedade stEmissaoNfsAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStEmissaoNfsAutorizacao() {
        return stEmissaoNfsAutorizacao;
    }

    /**
     * Define o valor da propriedade stEmissaoNfsAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStEmissaoNfsAutorizacao(Integer value) {
        this.stEmissaoNfsAutorizacao = value;
    }

    /**
     * Obt�m o valor da propriedade servicos.
     * 
     * @return
     *     possible object is
     *     {@link TcPessoaHomologacao.Servicos }
     *     
     */
    public TcPessoaHomologacao.Servicos getServicos() {
        return servicos;
    }

    /**
     * Define o valor da propriedade servicos.
     * 
     * @param value
     *     allowed object is
     *     {@link TcPessoaHomologacao.Servicos }
     *     
     */
    public void setServicos(TcPessoaHomologacao.Servicos value) {
        this.servicos = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="servico" type="{http://www.equiplano.com.br/esnfs/tipos}tcServicoIntegracao" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "servico"
    })
    public static class Servicos {

        protected List<TcServicoIntegracao> servico;

        /**
         * Gets the value of the servico property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the servico property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServico().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TcServicoIntegracao }
         * 
         * 
         */
        public List<TcServicoIntegracao> getServico() {
            if (servico == null) {
                servico = new ArrayList<TcServicoIntegracao>();
            }
            return this.servico;
        }

    }

}
