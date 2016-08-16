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
 * Representa a estrutura do protocolo
 * 
 * <p>Classe Java de tcProtocoloIntegracao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcProtocoloIntegracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrProtocolo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dtProtocolo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dsProtocolo" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsProtocolo" minOccurs="0"/>
 *         &lt;element name="isOk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcProtocoloIntegracao", propOrder = {
    "nrProtocolo",
    "dtProtocolo",
    "dsProtocolo",
    "isOk"
})
public class TcProtocoloIntegracao {

    @XmlElement(required = true)
    protected BigInteger nrProtocolo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtProtocolo;
    protected String dsProtocolo;
    protected Boolean isOk;

    /**
     * Obt�m o valor da propriedade nrProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrProtocolo() {
        return nrProtocolo;
    }

    /**
     * Define o valor da propriedade nrProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrProtocolo(BigInteger value) {
        this.nrProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade dtProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtProtocolo() {
        return dtProtocolo;
    }

    /**
     * Define o valor da propriedade dtProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtProtocolo(XMLGregorianCalendar value) {
        this.dtProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade dsProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsProtocolo() {
        return dsProtocolo;
    }

    /**
     * Define o valor da propriedade dsProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsProtocolo(String value) {
        this.dsProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade isOk.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOk() {
        return isOk;
    }

    /**
     * Define o valor da propriedade isOk.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOk(Boolean value) {
        this.isOk = value;
    }

}
