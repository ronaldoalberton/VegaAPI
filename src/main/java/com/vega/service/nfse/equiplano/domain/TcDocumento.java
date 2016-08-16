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
import javax.xml.bind.annotation.XmlType;


/**
 * Representa a estrutura do documento
 * 
 * <p>Classe Java de tcDocumento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrDocumento" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrDocumento"/>
 *         &lt;element name="tpDocumento" type="{http://www.equiplano.com.br/esnfs/tipos}tsTpDocumento"/>
 *         &lt;element name="dsDocumentoEstrangeiro" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsDocumentoEstrangeiro" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcDocumento", propOrder = {
    "nrDocumento",
    "tpDocumento",
    "dsDocumentoEstrangeiro"
})
public class TcDocumento {

    @XmlElement(required = true)
    protected String nrDocumento;
    protected int tpDocumento;
    protected String dsDocumentoEstrangeiro;

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
     * Obt�m o valor da propriedade tpDocumento.
     * 
     */
    public int getTpDocumento() {
        return tpDocumento;
    }

    /**
     * Define o valor da propriedade tpDocumento.
     * 
     */
    public void setTpDocumento(int value) {
        this.tpDocumento = value;
    }

    /**
     * Obt�m o valor da propriedade dsDocumentoEstrangeiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsDocumentoEstrangeiro() {
        return dsDocumentoEstrangeiro;
    }

    /**
     * Define o valor da propriedade dsDocumentoEstrangeiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsDocumentoEstrangeiro(String value) {
        this.dsDocumentoEstrangeiro = value;
    }

}
