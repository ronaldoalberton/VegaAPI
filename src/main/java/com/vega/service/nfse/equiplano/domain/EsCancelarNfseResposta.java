//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="sucesso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="dtCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;/sequence>
 *         &lt;element name="mensagemRetorno" type="{http://www.equiplano.com.br/esnfs/tipos}tcMensagemRetorno"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sucesso",
    "dtCancelamento",
    "mensagemRetorno"
})
@XmlRootElement(name = "esCancelarNfseResposta", namespace = "http://www.equiplano.com.br/esnfs")
public class EsCancelarNfseResposta {

    protected Boolean sucesso;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtCancelamento;
    protected TcMensagemRetorno mensagemRetorno;

    /**
     * Obt�m o valor da propriedade sucesso.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSucesso() {
        return sucesso;
    }

    /**
     * Define o valor da propriedade sucesso.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSucesso(Boolean value) {
        this.sucesso = value;
    }

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
     * Obt�m o valor da propriedade mensagemRetorno.
     * 
     * @return
     *     possible object is
     *     {@link TcMensagemRetorno }
     *     
     */
    public TcMensagemRetorno getMensagemRetorno() {
        return mensagemRetorno;
    }

    /**
     * Define o valor da propriedade mensagemRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link TcMensagemRetorno }
     *     
     */
    public void setMensagemRetorno(TcMensagemRetorno value) {
        this.mensagemRetorno = value;
    }

}
