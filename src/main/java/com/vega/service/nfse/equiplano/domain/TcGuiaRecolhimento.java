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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representa de uma guia de recolhimento
 * 
 * <p>Classe Java de tcGuiaRecolhimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcGuiaRecolhimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prestador" type="{http://www.equiplano.com.br/esnfs/tipos}tcIdentificacaoPrestador"/>
 *         &lt;element name="nrGuia" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="stGuia" type="{http://www.equiplano.com.br/esnfs/tipos}tsStGuia"/>
 *         &lt;element name="competencia" type="{http://www.equiplano.com.br/esnfs/tipos}tcCompetencia"/>
 *         &lt;element name="dsCodigoBarra" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsCodigoBarra"/>
 *         &lt;element name="tpCodigoBarra" type="{http://www.equiplano.com.br/esnfs/tipos}tsTpCodigoBarra"/>
 *         &lt;element name="dtVencimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dtEmissaoGuia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vlMovimento" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="vlImposto" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="vlImpostoRetido" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="vlPago" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor" minOccurs="0"/>
 *         &lt;element name="dsObservacao" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsObservacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcGuiaRecolhimento", propOrder = {
    "prestador",
    "nrGuia",
    "stGuia",
    "competencia",
    "dsCodigoBarra",
    "tpCodigoBarra",
    "dtVencimento",
    "dtEmissaoGuia",
    "vlMovimento",
    "vlImposto",
    "vlImpostoRetido",
    "vlPago",
    "dsObservacao"
})
public class TcGuiaRecolhimento {

    @XmlElement(required = true)
    protected TcIdentificacaoPrestador prestador;
    @XmlElement(required = true)
    protected BigInteger nrGuia;
    protected int stGuia;
    @XmlElement(required = true)
    protected TcCompetencia competencia;
    @XmlElement(required = true)
    protected String dsCodigoBarra;
    protected int tpCodigoBarra;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtVencimento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtEmissaoGuia;
    @XmlElement(required = true)
    protected BigDecimal vlMovimento;
    @XmlElement(required = true)
    protected BigDecimal vlImposto;
    @XmlElement(required = true)
    protected BigDecimal vlImpostoRetido;
    protected BigDecimal vlPago;
    protected String dsObservacao;

    /**
     * Obt�m o valor da propriedade prestador.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public TcIdentificacaoPrestador getPrestador() {
        return prestador;
    }

    /**
     * Define o valor da propriedade prestador.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public void setPrestador(TcIdentificacaoPrestador value) {
        this.prestador = value;
    }

    /**
     * Obt�m o valor da propriedade nrGuia.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrGuia() {
        return nrGuia;
    }

    /**
     * Define o valor da propriedade nrGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrGuia(BigInteger value) {
        this.nrGuia = value;
    }

    /**
     * Obt�m o valor da propriedade stGuia.
     * 
     */
    public int getStGuia() {
        return stGuia;
    }

    /**
     * Define o valor da propriedade stGuia.
     * 
     */
    public void setStGuia(int value) {
        this.stGuia = value;
    }

    /**
     * Obt�m o valor da propriedade competencia.
     * 
     * @return
     *     possible object is
     *     {@link TcCompetencia }
     *     
     */
    public TcCompetencia getCompetencia() {
        return competencia;
    }

    /**
     * Define o valor da propriedade competencia.
     * 
     * @param value
     *     allowed object is
     *     {@link TcCompetencia }
     *     
     */
    public void setCompetencia(TcCompetencia value) {
        this.competencia = value;
    }

    /**
     * Obt�m o valor da propriedade dsCodigoBarra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsCodigoBarra() {
        return dsCodigoBarra;
    }

    /**
     * Define o valor da propriedade dsCodigoBarra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsCodigoBarra(String value) {
        this.dsCodigoBarra = value;
    }

    /**
     * Obt�m o valor da propriedade tpCodigoBarra.
     * 
     */
    public int getTpCodigoBarra() {
        return tpCodigoBarra;
    }

    /**
     * Define o valor da propriedade tpCodigoBarra.
     * 
     */
    public void setTpCodigoBarra(int value) {
        this.tpCodigoBarra = value;
    }

    /**
     * Obt�m o valor da propriedade dtVencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtVencimento() {
        return dtVencimento;
    }

    /**
     * Define o valor da propriedade dtVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtVencimento(XMLGregorianCalendar value) {
        this.dtVencimento = value;
    }

    /**
     * Obt�m o valor da propriedade dtEmissaoGuia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEmissaoGuia() {
        return dtEmissaoGuia;
    }

    /**
     * Define o valor da propriedade dtEmissaoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEmissaoGuia(XMLGregorianCalendar value) {
        this.dtEmissaoGuia = value;
    }

    /**
     * Obt�m o valor da propriedade vlMovimento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlMovimento() {
        return vlMovimento;
    }

    /**
     * Define o valor da propriedade vlMovimento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlMovimento(BigDecimal value) {
        this.vlMovimento = value;
    }

    /**
     * Obt�m o valor da propriedade vlImposto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlImposto() {
        return vlImposto;
    }

    /**
     * Define o valor da propriedade vlImposto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlImposto(BigDecimal value) {
        this.vlImposto = value;
    }

    /**
     * Obt�m o valor da propriedade vlImpostoRetido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlImpostoRetido() {
        return vlImpostoRetido;
    }

    /**
     * Define o valor da propriedade vlImpostoRetido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlImpostoRetido(BigDecimal value) {
        this.vlImpostoRetido = value;
    }

    /**
     * Obt�m o valor da propriedade vlPago.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlPago() {
        return vlPago;
    }

    /**
     * Define o valor da propriedade vlPago.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlPago(BigDecimal value) {
        this.vlPago = value;
    }

    /**
     * Obt�m o valor da propriedade dsObservacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsObservacao() {
        return dsObservacao;
    }

    /**
     * Define o valor da propriedade dsObservacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsObservacao(String value) {
        this.dsObservacao = value;
    }

}
