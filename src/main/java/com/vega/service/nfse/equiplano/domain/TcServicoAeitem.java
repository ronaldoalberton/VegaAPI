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
import javax.xml.bind.annotation.XmlType;


/**
 * Estrutura do servi�o AE item
 * 
 * <p>Classe Java de tcServicoAeitem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcServicoAeitem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrItem" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dsItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isInformarDeducao" type="{http://www.equiplano.com.br/esnfs/tipos}tsSimNao" minOccurs="0"/>
 *         &lt;element name="isTomadorObrigatorio" type="{http://www.equiplano.com.br/esnfs/tipos}tsSimNao" minOccurs="0"/>
 *         &lt;element name="tpRetencao" type="{http://www.equiplano.com.br/esnfs/tipos}tsTpRetencao" minOccurs="0"/>
 *         &lt;element name="vlAliquota" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor" minOccurs="0"/>
 *         &lt;element name="subItemList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subItem" type="{http://www.equiplano.com.br/esnfs/tipos}tcServicoAeSubItem" maxOccurs="unbounded"/>
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
@XmlType(name = "tcServicoAeitem", propOrder = {
    "nrItem",
    "dsItem",
    "isInformarDeducao",
    "isTomadorObrigatorio",
    "tpRetencao",
    "vlAliquota",
    "subItemList"
})
public class TcServicoAeitem {

    @XmlElement(required = true)
    protected BigInteger nrItem;
    protected String dsItem;
    protected Integer isInformarDeducao;
    protected Integer isTomadorObrigatorio;
    protected String tpRetencao;
    protected BigDecimal vlAliquota;
    protected TcServicoAeitem.SubItemList subItemList;

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
     * Obt�m o valor da propriedade dsItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsItem() {
        return dsItem;
    }

    /**
     * Define o valor da propriedade dsItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsItem(String value) {
        this.dsItem = value;
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
     * Obt�m o valor da propriedade tpRetencao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpRetencao() {
        return tpRetencao;
    }

    /**
     * Define o valor da propriedade tpRetencao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpRetencao(String value) {
        this.tpRetencao = value;
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
     * Obt�m o valor da propriedade subItemList.
     * 
     * @return
     *     possible object is
     *     {@link TcServicoAeitem.SubItemList }
     *     
     */
    public TcServicoAeitem.SubItemList getSubItemList() {
        return subItemList;
    }

    /**
     * Define o valor da propriedade subItemList.
     * 
     * @param value
     *     allowed object is
     *     {@link TcServicoAeitem.SubItemList }
     *     
     */
    public void setSubItemList(TcServicoAeitem.SubItemList value) {
        this.subItemList = value;
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
     *         &lt;element name="subItem" type="{http://www.equiplano.com.br/esnfs/tipos}tcServicoAeSubItem" maxOccurs="unbounded"/>
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
        "subItem"
    })
    public static class SubItemList {

        @XmlElement(required = true)
        protected List<TcServicoAeSubItem> subItem;

        /**
         * Gets the value of the subItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TcServicoAeSubItem }
         * 
         * 
         */
        public List<TcServicoAeSubItem> getSubItem() {
            if (subItem == null) {
                subItem = new ArrayList<TcServicoAeSubItem>();
            }
            return this.subItem;
        }

    }

}
