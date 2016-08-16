//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2016.07.30 �s 11:06:32 PM BRT 
//

package com.vega.service.nfse.equiplano.domain;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="listaNfse">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="nfse" type="{http://www.equiplano.com.br/esnfs/tipos}tcNfse" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
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
    "listaNfse",
    "mensagemRetorno"
})
@XmlRootElement(name = "esConsultarLoteRpsResposta", namespace = "http://www.equiplano.com.br/esnfs")
public class EsConsultarLoteRpsResposta {

    protected EsConsultarLoteRpsResposta.ListaNfse listaNfse;
    protected TcMensagemRetorno mensagemRetorno;

    /**
     * Obt�m o valor da propriedade listaNfse.
     * 
     * @return
     *     possible object is
     *     {@link EsConsultarLoteRpsResposta.ListaNfse }
     *     
     */
    public EsConsultarLoteRpsResposta.ListaNfse getListaNfse() {
        return listaNfse;
    }

    /**
     * Define o valor da propriedade listaNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link EsConsultarLoteRpsResposta.ListaNfse }
     *     
     */
    public void setListaNfse(EsConsultarLoteRpsResposta.ListaNfse value) {
        this.listaNfse = value;
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
     *         &lt;element name="nfse" type="{http://www.equiplano.com.br/esnfs/tipos}tcNfse" maxOccurs="unbounded"/>
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
        "nfse"
    })
    public static class ListaNfse {

        @XmlElement(required = true)
        protected List<TcNfse> nfse;

        /**
         * Gets the value of the nfse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nfse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNfse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TcNfse }
         * 
         * 
         */
        public List<TcNfse> getNfse() {
            if (nfse == null) {
                nfse = new ArrayList<TcNfse>();
            }
            return this.nfse;
        }

    }

}
