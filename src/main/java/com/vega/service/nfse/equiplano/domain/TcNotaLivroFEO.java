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
 * Representa a estrutura das notas para serem utilizadas no livro fiscal eletr�nico
 * 
 * <p>Classe Java de tcNotaLivroFEO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcNotaLivroFEO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrNfs" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dtEmissaoNfs" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="tpTributacao" type="{http://www.equiplano.com.br/esnfs/tipos}tsTpTributacao"/>
 *         &lt;element name="nrCnpjTomador" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrDocumento"/>
 *         &lt;element name="nrInscricaoMunicipalTomador" type="{http://www.equiplano.com.br/esnfs/tipos}tsInscricaoMunicipal" minOccurs="0"/>
 *         &lt;element name="nmTomador" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmPessoa"/>
 *         &lt;element name="vlTotalNfs" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="vlTotalImposto" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="vlTotalDeducoes" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor" minOccurs="0"/>
 *         &lt;element name="isTomadorInformado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isIssRetido" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="servicos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="servico" type="{http://www.equiplano.com.br/esnfs/tipos}tcServicoIntegracao" maxOccurs="unbounded"/>
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
@XmlType(name = "tcNotaLivroFEO", propOrder = {
    "nrNfs",
    "dtEmissaoNfs",
    "tpTributacao",
    "nrCnpjTomador",
    "nrInscricaoMunicipalTomador",
    "nmTomador",
    "vlTotalNfs",
    "vlTotalImposto",
    "vlTotalDeducoes",
    "isTomadorInformado",
    "isIssRetido",
    "servicos"
})
public class TcNotaLivroFEO {

    @XmlElement(required = true)
    protected BigInteger nrNfs;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtEmissaoNfs;
    protected int tpTributacao;
    @XmlElement(required = true)
    protected String nrCnpjTomador;
    protected String nrInscricaoMunicipalTomador;
    @XmlElement(required = true)
    protected String nmTomador;
    @XmlElement(required = true)
    protected BigDecimal vlTotalNfs;
    @XmlElement(required = true)
    protected BigDecimal vlTotalImposto;
    protected BigDecimal vlTotalDeducoes;
    protected boolean isTomadorInformado;
    protected boolean isIssRetido;
    @XmlElement(required = true)
    protected TcNotaLivroFEO.Servicos servicos;

    /**
     * Obt�m o valor da propriedade nrNfs.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrNfs() {
        return nrNfs;
    }

    /**
     * Define o valor da propriedade nrNfs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrNfs(BigInteger value) {
        this.nrNfs = value;
    }

    /**
     * Obt�m o valor da propriedade dtEmissaoNfs.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEmissaoNfs() {
        return dtEmissaoNfs;
    }

    /**
     * Define o valor da propriedade dtEmissaoNfs.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEmissaoNfs(XMLGregorianCalendar value) {
        this.dtEmissaoNfs = value;
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
     * Obt�m o valor da propriedade nrCnpjTomador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrCnpjTomador() {
        return nrCnpjTomador;
    }

    /**
     * Define o valor da propriedade nrCnpjTomador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrCnpjTomador(String value) {
        this.nrCnpjTomador = value;
    }

    /**
     * Obt�m o valor da propriedade nrInscricaoMunicipalTomador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInscricaoMunicipalTomador() {
        return nrInscricaoMunicipalTomador;
    }

    /**
     * Define o valor da propriedade nrInscricaoMunicipalTomador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInscricaoMunicipalTomador(String value) {
        this.nrInscricaoMunicipalTomador = value;
    }

    /**
     * Obt�m o valor da propriedade nmTomador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmTomador() {
        return nmTomador;
    }

    /**
     * Define o valor da propriedade nmTomador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmTomador(String value) {
        this.nmTomador = value;
    }

    /**
     * Obt�m o valor da propriedade vlTotalNfs.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlTotalNfs() {
        return vlTotalNfs;
    }

    /**
     * Define o valor da propriedade vlTotalNfs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlTotalNfs(BigDecimal value) {
        this.vlTotalNfs = value;
    }

    /**
     * Obt�m o valor da propriedade vlTotalImposto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlTotalImposto() {
        return vlTotalImposto;
    }

    /**
     * Define o valor da propriedade vlTotalImposto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlTotalImposto(BigDecimal value) {
        this.vlTotalImposto = value;
    }

    /**
     * Obt�m o valor da propriedade vlTotalDeducoes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlTotalDeducoes() {
        return vlTotalDeducoes;
    }

    /**
     * Define o valor da propriedade vlTotalDeducoes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlTotalDeducoes(BigDecimal value) {
        this.vlTotalDeducoes = value;
    }

    /**
     * Obt�m o valor da propriedade isTomadorInformado.
     * 
     */
    public boolean isIsTomadorInformado() {
        return isTomadorInformado;
    }

    /**
     * Define o valor da propriedade isTomadorInformado.
     * 
     */
    public void setIsTomadorInformado(boolean value) {
        this.isTomadorInformado = value;
    }

    /**
     * Obt�m o valor da propriedade isIssRetido.
     * 
     */
    public boolean isIsIssRetido() {
        return isIssRetido;
    }

    /**
     * Define o valor da propriedade isIssRetido.
     * 
     */
    public void setIsIssRetido(boolean value) {
        this.isIssRetido = value;
    }

    /**
     * Obt�m o valor da propriedade servicos.
     * 
     * @return
     *     possible object is
     *     {@link TcNotaLivroFEO.Servicos }
     *     
     */
    public TcNotaLivroFEO.Servicos getServicos() {
        return servicos;
    }

    /**
     * Define o valor da propriedade servicos.
     * 
     * @param value
     *     allowed object is
     *     {@link TcNotaLivroFEO.Servicos }
     *     
     */
    public void setServicos(TcNotaLivroFEO.Servicos value) {
        this.servicos = value;
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
     *         &lt;element name="servico" type="{http://www.equiplano.com.br/esnfs/tipos}tcServicoIntegracao" maxOccurs="unbounded"/>
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
    public static class Servicos {

        @XmlElement(required = true)
        protected List<TcServicoIntegracao> servico;

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
         * {@link TcServicoIntegracao }
         * 
         * 
         */
        public List<TcServicoIntegracao> getServico() {
            if (servico == null) {
                servico = new ArrayList<TcServicoIntegracao>();
            }
            return this.servico;
        }

    }

}
