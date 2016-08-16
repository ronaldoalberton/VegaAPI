//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representa a estrutura da Nota Fiscal de Servi�os Eletr�nica
 * 
 * <p>Classe Java de tcNfseSemCancelamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcNfseSemCancelamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrNfs" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="cdAutenticacao" type="{http://www.equiplano.com.br/esnfs/tipos}tsCdAutenticacao"/>
 *         &lt;element name="dtEmissaoNfs" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nrRps" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="nrEmissorRps" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dtEmissaoRps" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dsLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcNfseSemCancelamento", propOrder = {
    "nrNfse",
    "cdAutenticacao",
    "dtEmissaoNfs",
    "nrRps",
    "nrEmissorRps",
    "dtEmissaoRps",
    "dsLink"
})
public class TcNfse {

	@XmlElement(required = true)
    protected BigInteger nrNfse;
    @XmlElement(required = true)
    protected String cdAutenticacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtEmissaoNfs;
    protected BigInteger nrRps;
    protected BigInteger nrEmissorRps;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtEmissaoRps;
    protected String dsLink;

    /**
     * Obt�m o valor da propriedade nrNfs.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrNfse() {
        return nrNfse;
    }

    /**
     * Define o valor da propriedade nrNfs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrNfse(BigInteger value) {
        this.nrNfse = value;
    }

    /**
     * Obt�m o valor da propriedade cdAutenticacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAutenticacao() {
        return cdAutenticacao;
    }

    /**
     * Define o valor da propriedade cdAutenticacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAutenticacao(String value) {
        this.cdAutenticacao = value;
    }

    /**
     * Obt�m o valor da propriedade dtEmissaoNfs.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEmissaoNfs() {
        return dtEmissaoNfs;
    }

    /**
     * Define o valor da propriedade dtEmissaoNfs.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEmissaoNfs(XMLGregorianCalendar value) {
        this.dtEmissaoNfs = value;
    }

    /**
     * Obt�m o valor da propriedade nrRps.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrRps() {
        return nrRps;
    }

    /**
     * Define o valor da propriedade nrRps.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrRps(BigInteger value) {
        this.nrRps = value;
    }

    /**
     * Obt�m o valor da propriedade nrEmissorRps.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrEmissorRps() {
        return nrEmissorRps;
    }

    /**
     * Define o valor da propriedade nrEmissorRps.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrEmissorRps(BigInteger value) {
        this.nrEmissorRps = value;
    }

    /**
     * Obt�m o valor da propriedade dtEmissaoRps.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEmissaoRps() {
        return dtEmissaoRps;
    }

    /**
     * Define o valor da propriedade dtEmissaoRps.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEmissaoRps(XMLGregorianCalendar value) {
        this.dtEmissaoRps = value;
    }

    /**
     * Obt�m o valor da propriedade dsLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsLink() {
        return dsLink;
    }

    /**
     * Define o valor da propriedade dsLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsLink(String value) {
        this.dsLink = value;
    }
}
