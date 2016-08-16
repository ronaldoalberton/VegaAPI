//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representa a estrutura de recibo provis�rio de servi�os (Rps)
 * 
 * <p>Classe Java de tcRps complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcRps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrRps" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="nrEmissorRps" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dtEmissaoRps" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="stRps" type="{http://www.equiplano.com.br/esnfs/tipos}tsStRps"/>
 *         &lt;element name="tpTributacao" type="{http://www.equiplano.com.br/esnfs/tipos}tsTpTributacao"/>
 *         &lt;element name="nrCidadeIbgeServico" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isIssRetido" type="{http://www.equiplano.com.br/esnfs/tipos}tsSimNao"/>
 *         &lt;element name="tomador" type="{http://www.equiplano.com.br/esnfs/tipos}tcTomador" minOccurs="0"/>
 *         &lt;element name="listaServicos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="servico" type="{http://www.equiplano.com.br/esnfs/tipos}tcServico" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vlTotalRps" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="vlLiquidoRps" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="retencoes" type="{http://www.equiplano.com.br/esnfs/tipos}tcRetencoes" minOccurs="0"/>
 *         &lt;element name="dsImpostos" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsImpostos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcRps", propOrder = {
    "nrRps",
    "nrEmissorRps",
    "dtEmissaoRps",
    "stRps",
    "tpTributacao",
    "nrCidadeIbgeServico",
    "isIssRetido",
    "tomador",
    "listaServicos",
    "vlTotalRps",
    "vlLiquidoRps",
    "retencoes",
    "dsImpostos"
})
public class TcRps {

    @XmlElement(required = true)
    protected BigInteger nrRps;
    @XmlElement(required = true)
    protected BigInteger nrEmissorRps;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected String dtEmissaoRps;
    protected int stRps;
    protected int tpTributacao;
    protected BigInteger nrCidadeIbgeServico;
    protected int isIssRetido;
    protected TcTomador tomador;
    @XmlElement(required = true)
    protected TcRps.ListaServicos listaServicos;
    @XmlElement(required = true)
    protected BigDecimal vlTotalRps;
    @XmlElement(required = true)
    protected BigDecimal vlLiquidoRps;
    protected TcRetencoes retencoes;
    protected String dsImpostos;

    /**
     * Obt�m o valor da propriedade nrRps.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrRps() {
        return nrRps;
    }

    /**
     * Define o valor da propriedade nrRps.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrRps(BigInteger value) {
        this.nrRps = value;
    }

    /**
     * Obt�m o valor da propriedade nrEmissorRps.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrEmissorRps() {
        return nrEmissorRps;
    }

    /**
     * Define o valor da propriedade nrEmissorRps.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrEmissorRps(BigInteger value) {
        this.nrEmissorRps = value;
    }

    /**
     * Obt�m o valor da propriedade dtEmissaoRps.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDtEmissaoRps() {
        return dtEmissaoRps;
    }

    /**
     * Define o valor da propriedade dtEmissaoRps.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEmissaoRps(String value) {
        this.dtEmissaoRps = value;
    }

    /**
     * Obt�m o valor da propriedade stRps.
     * 
     */
    public int getStRps() {
        return stRps;
    }

    /**
     * Define o valor da propriedade stRps.
     * 
     */
    public void setStRps(int value) {
        this.stRps = value;
    }

    /**
     * Obt�m o valor da propriedade tpTributacao.
     * 
     */
    public int getTpTributacao() {
        return tpTributacao;
    }

    /**
     * Define o valor da propriedade tpTributacao.
     * 
     */
    public void setTpTributacao(int value) {
        this.tpTributacao = value;
    }

    /**
     * Obt�m o valor da propriedade nrCidadeIbgeServico.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrCidadeIbgeServico() {
        return nrCidadeIbgeServico;
    }

    /**
     * Define o valor da propriedade nrCidadeIbgeServico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrCidadeIbgeServico(BigInteger value) {
        this.nrCidadeIbgeServico = value;
    }

    /**
     * Obt�m o valor da propriedade isIssRetido.
     * 
     */
    public int getIsIssRetido() {
        return isIssRetido;
    }

    /**
     * Define o valor da propriedade isIssRetido.
     * 
     */
    public void setIsIssRetido(int value) {
        this.isIssRetido = value;
    }

    /**
     * Obt�m o valor da propriedade tomador.
     * 
     * @return
     *     possible object is
     *     {@link TcTomador }
     *     
     */
    public TcTomador getTomador() {
        return tomador;
    }

    /**
     * Define o valor da propriedade tomador.
     * 
     * @param value
     *     allowed object is
     *     {@link TcTomador }
     *     
     */
    public void setTomador(TcTomador value) {
        this.tomador = value;
    }

    /**
     * Obt�m o valor da propriedade listaServicos.
     * 
     * @return
     *     possible object is
     *     {@link TcRps.ListaServicos }
     *     
     */
    public TcRps.ListaServicos getListaServicos() {
        return listaServicos;
    }

    /**
     * Define o valor da propriedade listaServicos.
     * 
     * @param value
     *     allowed object is
     *     {@link TcRps.ListaServicos }
     *     
     */
    public void setListaServicos(TcRps.ListaServicos value) {
        this.listaServicos = value;
    }

    /**
     * Obt�m o valor da propriedade vlTotalRps.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlTotalRps() {
        return vlTotalRps;
    }

    /**
     * Define o valor da propriedade vlTotalRps.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlTotalRps(BigDecimal value) {
        this.vlTotalRps = value;
    }

    /**
     * Obt�m o valor da propriedade vlLiquidoRps.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlLiquidoRps() {
        return vlLiquidoRps;
    }

    /**
     * Define o valor da propriedade vlLiquidoRps.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlLiquidoRps(BigDecimal value) {
        this.vlLiquidoRps = value;
    }

    /**
     * Obt�m o valor da propriedade retencoes.
     * 
     * @return
     *     possible object is
     *     {@link TcRetencoes }
     *     
     */
    public TcRetencoes getRetencoes() {
        return retencoes;
    }

    /**
     * Define o valor da propriedade retencoes.
     * 
     * @param value
     *     allowed object is
     *     {@link TcRetencoes }
     *     
     */
    public void setRetencoes(TcRetencoes value) {
        this.retencoes = value;
    }

    /**
     * Obt�m o valor da propriedade dsImpostos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsImpostos() {
        return dsImpostos;
    }

    /**
     * Define o valor da propriedade dsImpostos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsImpostos(String value) {
        this.dsImpostos = value;
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
     *         &lt;element name="servico" type="{http://www.equiplano.com.br/esnfs/tipos}tcServico" maxOccurs="unbounded"/>
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
        "servico"
    })
    public static class ListaServicos {

        @XmlElement(required = true)
        protected List<TcServico> servico;

        /**
         * Gets the value of the servico property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the servico property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServico().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TcServico }
         * 
         * 
         */
        public List<TcServico> getServico() {
            if (servico == null) {
                servico = new ArrayList<TcServico>();
            }
            return this.servico;
        }

    }

}
