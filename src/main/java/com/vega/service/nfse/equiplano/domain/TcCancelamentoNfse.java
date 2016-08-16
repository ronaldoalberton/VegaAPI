//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representa a estrutura de cancelamento da Nfse
 * 
 * <p>Classe Java de tcCancelamentoNfse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcCancelamentoNfse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dsCancelamento" type="{http://www.equiplano.com.br/esnfs/tipos}tsMotivoCancelamentoNfse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcCancelamentoNfse", propOrder = {
    "dtCancelamento",
    "dsCancelamento"
})
public class TcCancelamentoNfse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtCancelamento;
    @XmlElement(required = true)
    protected String dsCancelamento;

    /**
     * Obt�m o valor da propriedade dtCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtCancelamento() {
        return dtCancelamento;
    }

    /**
     * Define o valor da propriedade dtCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtCancelamento(XMLGregorianCalendar value) {
        this.dtCancelamento = value;
    }

    /**
     * Obt�m o valor da propriedade dsCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsCancelamento() {
        return dsCancelamento;
    }

    /**
     * Define o valor da propriedade dsCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsCancelamento(String value) {
        this.dsCancelamento = value;
    }

}
