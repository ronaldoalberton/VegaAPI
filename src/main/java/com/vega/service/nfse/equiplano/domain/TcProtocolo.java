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
 * <p>Classe Java de tcProtocolo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcProtocolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrLote" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dtRecebimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nrProtocolo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcProtocolo", propOrder = {
    "nrLote",
    "dtRecebimento",
    "nrProtocolo"
})
public class TcProtocolo {

    @XmlElement(required = true)
    protected BigInteger nrLote;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRecebimento;
    @XmlElement(required = true)
    protected BigInteger nrProtocolo;

    /**
     * Obt�m o valor da propriedade nrLote.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrLote() {
        return nrLote;
    }

    /**
     * Define o valor da propriedade nrLote.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrLote(BigInteger value) {
        this.nrLote = value;
    }

    /**
     * Obt�m o valor da propriedade dtRecebimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRecebimento() {
        return dtRecebimento;
    }

    /**
     * Define o valor da propriedade dtRecebimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRecebimento(XMLGregorianCalendar value) {
        this.dtRecebimento = value;
    }

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

}
