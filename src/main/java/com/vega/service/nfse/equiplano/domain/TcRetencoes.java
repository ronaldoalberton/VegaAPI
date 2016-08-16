//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa a estrutura das reten��es
 * 
 * <p>Classe Java de tcRetencoes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcRetencoes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vlCofins" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor" minOccurs="0"/>
 *         &lt;element name="vlCsll" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor" minOccurs="0"/>
 *         &lt;element name="vlInss" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor" minOccurs="0"/>
 *         &lt;element name="vlIrrf" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor" minOccurs="0"/>
 *         &lt;element name="vlPis" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor" minOccurs="0"/>
 *         &lt;element name="vlIss" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor" minOccurs="0"/>
 *         &lt;element name="vlAliquotaCofins" type="{http://www.equiplano.com.br/esnfs/tipos}tsPercentual" minOccurs="0"/>
 *         &lt;element name="vlAliquotaCsll" type="{http://www.equiplano.com.br/esnfs/tipos}tsPercentual" minOccurs="0"/>
 *         &lt;element name="vlAliquotaInss" type="{http://www.equiplano.com.br/esnfs/tipos}tsPercentual" minOccurs="0"/>
 *         &lt;element name="vlAliquotaIrrf" type="{http://www.equiplano.com.br/esnfs/tipos}tsPercentual" minOccurs="0"/>
 *         &lt;element name="vlAliquotaPis" type="{http://www.equiplano.com.br/esnfs/tipos}tsPercentual" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcRetencoes", propOrder = {
    "vlCofins",
    "vlCsll",
    "vlInss",
    "vlIrrf",
    "vlPis",
    "vlIss",
    "vlAliquotaCofins",
    "vlAliquotaCsll",
    "vlAliquotaInss",
    "vlAliquotaIrrf",
    "vlAliquotaPis"
})
public class TcRetencoes {

    protected BigDecimal vlCofins;
    protected BigDecimal vlCsll;
    protected BigDecimal vlInss;
    protected BigDecimal vlIrrf;
    protected BigDecimal vlPis;
    protected BigDecimal vlIss;
    protected BigDecimal vlAliquotaCofins;
    protected BigDecimal vlAliquotaCsll;
    protected BigDecimal vlAliquotaInss;
    protected BigDecimal vlAliquotaIrrf;
    protected BigDecimal vlAliquotaPis;

    /**
     * Obt�m o valor da propriedade vlCofins.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    /**
     * Define o valor da propriedade vlCofins.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlCofins(BigDecimal value) {
        this.vlCofins = value;
    }

    /**
     * Obt�m o valor da propriedade vlCsll.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlCsll() {
        return vlCsll;
    }

    /**
     * Define o valor da propriedade vlCsll.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlCsll(BigDecimal value) {
        this.vlCsll = value;
    }

    /**
     * Obt�m o valor da propriedade vlInss.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlInss() {
        return vlInss;
    }

    /**
     * Define o valor da propriedade vlInss.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlInss(BigDecimal value) {
        this.vlInss = value;
    }

    /**
     * Obt�m o valor da propriedade vlIrrf.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlIrrf() {
        return vlIrrf;
    }

    /**
     * Define o valor da propriedade vlIrrf.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlIrrf(BigDecimal value) {
        this.vlIrrf = value;
    }

    /**
     * Obt�m o valor da propriedade vlPis.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlPis() {
        return vlPis;
    }

    /**
     * Define o valor da propriedade vlPis.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlPis(BigDecimal value) {
        this.vlPis = value;
    }

    /**
     * Obt�m o valor da propriedade vlIss.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlIss() {
        return vlIss;
    }

    /**
     * Define o valor da propriedade vlIss.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlIss(BigDecimal value) {
        this.vlIss = value;
    }

    /**
     * Obt�m o valor da propriedade vlAliquotaCofins.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlAliquotaCofins() {
        return vlAliquotaCofins;
    }

    /**
     * Define o valor da propriedade vlAliquotaCofins.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlAliquotaCofins(BigDecimal value) {
        this.vlAliquotaCofins = value;
    }

    /**
     * Obt�m o valor da propriedade vlAliquotaCsll.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlAliquotaCsll() {
        return vlAliquotaCsll;
    }

    /**
     * Define o valor da propriedade vlAliquotaCsll.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlAliquotaCsll(BigDecimal value) {
        this.vlAliquotaCsll = value;
    }

    /**
     * Obt�m o valor da propriedade vlAliquotaInss.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlAliquotaInss() {
        return vlAliquotaInss;
    }

    /**
     * Define o valor da propriedade vlAliquotaInss.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlAliquotaInss(BigDecimal value) {
        this.vlAliquotaInss = value;
    }

    /**
     * Obt�m o valor da propriedade vlAliquotaIrrf.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlAliquotaIrrf() {
        return vlAliquotaIrrf;
    }

    /**
     * Define o valor da propriedade vlAliquotaIrrf.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlAliquotaIrrf(BigDecimal value) {
        this.vlAliquotaIrrf = value;
    }

    /**
     * Obt�m o valor da propriedade vlAliquotaPis.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlAliquotaPis() {
        return vlAliquotaPis;
    }

    /**
     * Define o valor da propriedade vlAliquotaPis.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlAliquotaPis(BigDecimal value) {
        this.vlAliquotaPis = value;
    }

}
