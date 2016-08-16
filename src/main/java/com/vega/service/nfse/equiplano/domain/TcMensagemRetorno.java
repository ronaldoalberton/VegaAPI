//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa a estrutura da mensagem de retorno
 * 
 * <p>Classe Java de tcMensagemRetorno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcMensagemRetorno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaErros">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="erro" type="{http://www.equiplano.com.br/esnfs/tipos}tcErroAlerta" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listaAlertas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="alerta" type="{http://www.equiplano.com.br/esnfs/tipos}tcErroAlerta" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcMensagemRetorno", propOrder = {
    "listaErros",
    "listaAlertas"
})
public class TcMensagemRetorno {

    @XmlElement(required = true)
    protected TcMensagemRetorno.ListaErros listaErros;
    protected TcMensagemRetorno.ListaAlertas listaAlertas;

    /**
     * Obt�m o valor da propriedade listaErros.
     * 
     * @return
     *     possible object is
     *     {@link TcMensagemRetorno.ListaErros }
     *     
     */
    public TcMensagemRetorno.ListaErros getListaErros() {
        return listaErros;
    }

    /**
     * Define o valor da propriedade listaErros.
     * 
     * @param value
     *     allowed object is
     *     {@link TcMensagemRetorno.ListaErros }
     *     
     */
    public void setListaErros(TcMensagemRetorno.ListaErros value) {
        this.listaErros = value;
    }

    /**
     * Obt�m o valor da propriedade listaAlertas.
     * 
     * @return
     *     possible object is
     *     {@link TcMensagemRetorno.ListaAlertas }
     *     
     */
    public TcMensagemRetorno.ListaAlertas getListaAlertas() {
        return listaAlertas;
    }

    /**
     * Define o valor da propriedade listaAlertas.
     * 
     * @param value
     *     allowed object is
     *     {@link TcMensagemRetorno.ListaAlertas }
     *     
     */
    public void setListaAlertas(TcMensagemRetorno.ListaAlertas value) {
        this.listaAlertas = value;
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
     *         &lt;element name="alerta" type="{http://www.equiplano.com.br/esnfs/tipos}tcErroAlerta" maxOccurs="unbounded"/>
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
        "alerta"
    })
    public static class ListaAlertas {

        @XmlElement(required = true)
        protected List<TcErroAlerta> alerta;

        /**
         * Gets the value of the alerta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alerta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlerta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TcErroAlerta }
         * 
         * 
         */
        public List<TcErroAlerta> getAlerta() {
            if (alerta == null) {
                alerta = new ArrayList<TcErroAlerta>();
            }
            return this.alerta;
        }

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
     *         &lt;element name="erro" type="{http://www.equiplano.com.br/esnfs/tipos}tcErroAlerta" maxOccurs="unbounded"/>
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
        "erro"
    })
    public static class ListaErros {

        @XmlElement(required = true)
        protected List<TcErroAlerta> erro;

        /**
         * Gets the value of the erro property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the erro property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErro().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TcErroAlerta }
         * 
         * 
         */
        public List<TcErroAlerta> getErro() {
            if (erro == null) {
                erro = new ArrayList<TcErroAlerta>();
            }
            return this.erro;
        }

    }

}
