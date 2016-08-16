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
 * Representa a estrutura para importa��o dos servi�oes de uma empresa (Utilizada somente na integra��o STM/ESNFS) Servi�o
 * 
 * <p>Classe Java de tcServicoIntegracao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcServicoIntegracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrItem" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="nrSubItem" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="isInformarDeducao" type="{http://www.equiplano.com.br/esnfs/tipos}tsSimNao" minOccurs="0"/>
 *         &lt;element name="isTomadorObrigatorio" type="{http://www.equiplano.com.br/esnfs/tipos}tsSimNao" minOccurs="0"/>
 *         &lt;element name="vlAliquota" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcServicoIntegracao", propOrder = {
    "nrItem",
    "nrSubItem",
    "isInformarDeducao",
    "isTomadorObrigatorio",
    "vlAliquota"
})
public class TcServicoIntegracao {

    @XmlElement(required = true)
    protected BigInteger nrItem;
    @XmlElement(required = true)
    protected BigInteger nrSubItem;
    protected Integer isInformarDeducao;
    protected Integer isTomadorObrigatorio;
    protected BigDecimal vlAliquota;

    /**
     * Obt�m o valor da propriedade nrItem.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrItem() {
        return nrItem;
    }

    /**
     * Define o valor da propriedade nrItem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrItem(BigInteger value) {
        this.nrItem = value;
    }

    /**
     * Obt�m o valor da propriedade nrSubItem.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrSubItem() {
        return nrSubItem;
    }

    /**
     * Define o valor da propriedade nrSubItem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrSubItem(BigInteger value) {
        this.nrSubItem = value;
    }

    /**
     * Obt�m o valor da propriedade isInformarDeducao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsInformarDeducao() {
        return isInformarDeducao;
    }

    /**
     * Define o valor da propriedade isInformarDeducao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsInformarDeducao(Integer value) {
        this.isInformarDeducao = value;
    }

    /**
     * Obt�m o valor da propriedade isTomadorObrigatorio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsTomadorObrigatorio() {
        return isTomadorObrigatorio;
    }

    /**
     * Define o valor da propriedade isTomadorObrigatorio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsTomadorObrigatorio(Integer value) {
        this.isTomadorObrigatorio = value;
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

}
