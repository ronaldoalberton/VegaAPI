//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.09.21 �s 06:16:00 PM BRT 
//


package com.vega.service.nfse.equiplano.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="prestador" type="{http://www.equiplano.com.br/esnfs/tipos}tcIdentificacaoPrestador"/>
 *         &lt;choice>
 *           &lt;element name="nrLoteRps" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="nrProtocolo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "prestador",
    "nrLoteRps",
    "nrProtocolo",
    "signature"
})
@XmlRootElement(name = "esConsultarSituacaoLoteRpsEnvio", namespace = "http://www.equiplano.com.br/esnfs")
public class ConsultarSituacaoLoteRpsEnvio {

    @XmlElement(required = true)
    protected TcIdentificacaoPrestador prestador;
    protected int nrLoteRps;
    protected int nrProtocolo;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obt�m o valor da propriedade prestador.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public TcIdentificacaoPrestador getPrestador() {
        return prestador;
    }

    /**
     * Define o valor da propriedade prestador.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public void setPrestador(TcIdentificacaoPrestador value) {
        this.prestador = value;
    }

    /**
     * Obt�m o valor da propriedade nrLoteRps.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getNrLoteRps() {
        return nrLoteRps;
    }

    /**
     * Define o valor da propriedade nrLoteRps.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setNrLoteRps(int value) {
        this.nrLoteRps = value;
    }

    /**
     * Obt�m o valor da propriedade nrProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getNrProtocolo() {
        return nrProtocolo;
    }

    /**
     * Define o valor da propriedade nrProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setNrProtocolo(int value) {
        this.nrProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
