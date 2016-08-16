//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.09.14 �s 11:35:15 PM BRT 
//


package com.vega.service.nfse.equiplano.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;choice>
 *         &lt;element name="protocolo" type="{http://www.equiplano.com.br/esnfs/tipos}tcProtocolo"/>
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
    "protocolo",
    "mensagemRetorno"
})
@XmlRootElement(name = "esEnviarLoteRpsResposta", namespace = "http://www.equiplano.com.br/esnfs")
public class EnviarLoteRpsResposta {

    protected TcProtocolo protocolo;
    protected TcMensagemRetorno mensagemRetorno;

    /**
     * Obt�m o valor da propriedade protocolo.
     * 
     * @return
     *     possible object is
     *     {@link TcProtocolo }
     *     
     */
    public TcProtocolo getProtocolo() {
        return protocolo;
    }

    /**
     * Define o valor da propriedade protocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link TcProtocolo }
     *     
     */
    public void setProtocolo(TcProtocolo value) {
        this.protocolo = value;
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
