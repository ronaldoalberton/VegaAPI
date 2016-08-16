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
 * Representa a estrutura do Erro/Alerta
 * 
 * <p>Classe Java de tcErroAlerta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcErroAlerta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdMensagem" type="{http://www.equiplano.com.br/esnfs/tipos}tsCdMensagemAlerta"/>
 *         &lt;element name="dsMensagem" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsMensagemAlerta"/>
 *         &lt;element name="dsCorrecao" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsMensagemAlerta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcErroAlerta", propOrder = {
    "cdMensagem",
    "dsMensagem",
    "dsCorrecao"
})
public class TcErroAlerta {

    @XmlElement(required = true)
    protected String cdMensagem;
    @XmlElement(required = true)
    protected String dsMensagem;
    protected String dsCorrecao;

    /**
     * Obt�m o valor da propriedade cdMensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdMensagem() {
        return cdMensagem;
    }

    /**
     * Define o valor da propriedade cdMensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdMensagem(String value) {
        this.cdMensagem = value;
    }

    /**
     * Obt�m o valor da propriedade dsMensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsMensagem() {
        return dsMensagem;
    }

    /**
     * Define o valor da propriedade dsMensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsMensagem(String value) {
        this.dsMensagem = value;
    }

    /**
     * Obt�m o valor da propriedade dsCorrecao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsCorrecao() {
        return dsCorrecao;
    }

    /**
     * Define o valor da propriedade dsCorrecao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsCorrecao(String value) {
        this.dsCorrecao = value;
    }

}
