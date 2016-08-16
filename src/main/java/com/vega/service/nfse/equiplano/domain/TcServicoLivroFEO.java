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
 * Representa a estrutura do servi�o para o livro fiscal eletr�nico
 * 
 * <p>Classe Java de tcServicoLivroFEO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcServicoLivroFEO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrServicoItemLC116" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="nrServicoSubItemLC116" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dsDiscriminacaoServico" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsDiscriminacaoServico"/>
 *         &lt;element name="vlServico" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="vlAliquota" type="{http://www.equiplano.com.br/esnfs/tipos}tsPercentual"/>
 *         &lt;element name="vlDeducao" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor" minOccurs="0"/>
 *         &lt;element name="vlBaseCalculo" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="vlIssServico" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="dsJustificativaDeducao" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsJustificativaDeducao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcServicoLivroFEO", propOrder = {
    "nrServicoItemLC116",
    "nrServicoSubItemLC116",
    "dsDiscriminacaoServico",
    "vlServico",
    "vlAliquota",
    "vlDeducao",
    "vlBaseCalculo",
    "vlIssServico",
    "dsJustificativaDeducao"
})
public class TcServicoLivroFEO {

    @XmlElement(required = true)
    protected BigInteger nrServicoItemLC116;
    @XmlElement(required = true)
    protected BigInteger nrServicoSubItemLC116;
    @XmlElement(required = true)
    protected String dsDiscriminacaoServico;
    @XmlElement(required = true)
    protected BigDecimal vlServico;
    @XmlElement(required = true)
    protected BigDecimal vlAliquota;
    protected BigDecimal vlDeducao;
    @XmlElement(required = true)
    protected BigDecimal vlBaseCalculo;
    @XmlElement(required = true)
    protected BigDecimal vlIssServico;
    protected String dsJustificativaDeducao;

    /**
     * Obt�m o valor da propriedade nrServicoItemLC116.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrServicoItemLC116() {
        return nrServicoItemLC116;
    }

    /**
     * Define o valor da propriedade nrServicoItemLC116.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrServicoItemLC116(BigInteger value) {
        this.nrServicoItemLC116 = value;
    }

    /**
     * Obt�m o valor da propriedade nrServicoSubItemLC116.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrServicoSubItemLC116() {
        return nrServicoSubItemLC116;
    }

    /**
     * Define o valor da propriedade nrServicoSubItemLC116.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrServicoSubItemLC116(BigInteger value) {
        this.nrServicoSubItemLC116 = value;
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
     * Obt�m o valor da propriedade vlDeducao.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlDeducao() {
        return vlDeducao;
    }

    /**
     * Define o valor da propriedade vlDeducao.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlDeducao(BigDecimal value) {
        this.vlDeducao = value;
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
     * Obt�m o valor da propriedade dsJustificativaDeducao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsJustificativaDeducao() {
        return dsJustificativaDeducao;
    }

    /**
     * Define o valor da propriedade dsJustificativaDeducao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsJustificativaDeducao(String value) {
        this.dsJustificativaDeducao = value;
    }

}
