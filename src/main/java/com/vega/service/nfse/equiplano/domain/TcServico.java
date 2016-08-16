//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa a estrutura do servi�o
 * 
 * <p>Classe Java de tcServico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrServicoItem" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="nrServicoSubItem" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="vlServico" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="vlAliquota" type="{http://www.equiplano.com.br/esnfs/tipos}tsPercentual"/>
 *         &lt;element name="deducao" type="{http://www.equiplano.com.br/esnfs/tipos}tcDeducao" minOccurs="0"/>
 *         &lt;element name="vlBaseCalculo" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="vlIssServico" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="dsDiscriminacaoServico" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsDiscriminacaoServico"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcServico", propOrder = {
    "nrServicoItem",
    "nrServicoSubItem",
    "vlServico",
    "vlAliquota",
    "deducao",
    "vlBaseCalculo",
    "vlIssServico",
    "dsDiscriminacaoServico"
})
public class TcServico {

    @XmlElement(required = true)
    protected BigInteger nrServicoItem;
    @XmlElement(required = true)
    protected BigInteger nrServicoSubItem;
    @XmlElement(required = true)
    protected BigDecimal vlServico;
    @XmlElement(required = true)
    protected BigDecimal vlAliquota;
    protected TcDeducao deducao;
    @XmlElement(required = true)
    protected BigDecimal vlBaseCalculo;
    @XmlElement(required = true)
    protected BigDecimal vlIssServico;
    @XmlElement(required = true)
    protected String dsDiscriminacaoServico;

    /**
     * Obt�m o valor da propriedade nrServicoItem.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrServicoItem() {
        return nrServicoItem;
    }

    /**
     * Define o valor da propriedade nrServicoItem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrServicoItem(BigInteger value) {
        this.nrServicoItem = value;
    }

    /**
     * Obt�m o valor da propriedade nrServicoSubItem.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrServicoSubItem() {
        return nrServicoSubItem;
    }

    /**
     * Define o valor da propriedade nrServicoSubItem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrServicoSubItem(BigInteger value) {
        this.nrServicoSubItem = value;
    }

    /**
     * Obt�m o valor da propriedade vlServico.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlServico() {
        return vlServico;
    }

    /**
     * Define o valor da propriedade vlServico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlServico(BigDecimal value) {
        this.vlServico = value;
    }

    /**
     * Obt�m o valor da propriedade vlAliquota.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlAliquota() {
        return vlAliquota;
    }

    /**
     * Define o valor da propriedade vlAliquota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlAliquota(BigDecimal value) {
        this.vlAliquota = value;
    }

    /**
     * Obt�m o valor da propriedade deducao.
     * 
     * @return
     *     possible object is
     *     {@link TcDeducao }
     *     
     */
    public TcDeducao getDeducao() {
        return deducao;
    }

    /**
     * Define o valor da propriedade deducao.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDeducao }
     *     
     */
    public void setDeducao(TcDeducao value) {
        this.deducao = value;
    }

    /**
     * Obt�m o valor da propriedade vlBaseCalculo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlBaseCalculo() {
        return vlBaseCalculo;
    }

    /**
     * Define o valor da propriedade vlBaseCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlBaseCalculo(BigDecimal value) {
        this.vlBaseCalculo = value;
    }

    /**
     * Obt�m o valor da propriedade vlIssServico.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlIssServico() {
        return vlIssServico;
    }

    /**
     * Define o valor da propriedade vlIssServico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlIssServico(BigDecimal value) {
        this.vlIssServico = value;
    }

    /**
     * Obt�m o valor da propriedade dsDiscriminacaoServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsDiscriminacaoServico() {
        return dsDiscriminacaoServico;
    }

    /**
     * Define o valor da propriedade dsDiscriminacaoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsDiscriminacaoServico(String value) {
        this.dsDiscriminacaoServico = value;
    }

}
