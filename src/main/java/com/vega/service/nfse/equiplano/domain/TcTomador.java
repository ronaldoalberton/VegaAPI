//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa a estrutura do tomador
 * 
 * <p>Classe Java de tcTomador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcTomador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documento" type="{http://www.equiplano.com.br/esnfs/tipos}tcDocumento" minOccurs="0"/>
 *         &lt;element name="nmTomador" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmTomador"/>
 *         &lt;element name="dsEmail" type="{http://www.equiplano.com.br/esnfs/tipos}tsEmail" minOccurs="0"/>
 *         &lt;element name="nrInscricaoEstadual" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrInscricaoEstadual" minOccurs="0"/>
 *         &lt;element name="dsEndereco" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsEndereco" minOccurs="0"/>
 *         &lt;element name="nrEndereco" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrEndereco" minOccurs="0"/>
 *         &lt;element name="dsComplemento" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsComplemento" minOccurs="0"/>
 *         &lt;element name="nmBairro" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmBairro" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="nrCidadeIbge" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *             &lt;element name="nmUf" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmUf"/>
 *           &lt;/sequence>
 *           &lt;element name="nmCidadeEstrangeira" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmCidadeEstrangeira"/>
 *         &lt;/choice>
 *         &lt;element name="nmPais" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmPais"/>
 *         &lt;element name="nrCep" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrCep" minOccurs="0"/>
 *         &lt;element name="nrTelefone" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrTelefone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcTomador", propOrder = {
    "documento",
    "nmTomador",
    "dsEmail",
    "nrInscricaoEstadual",
    "dsEndereco",
    "nrEndereco",
    "dsComplemento",
    "nmBairro",
    "nrCidadeIbge",
    "nmUf",
    "nmCidadeEstrangeira",
    "nmPais",
    "nrCep",
    "nrTelefone"
})
public class TcTomador {

    protected TcDocumento documento;
    @XmlElement(required = true)
    protected String nmTomador;
    protected String dsEmail;
    protected String nrInscricaoEstadual;
    protected String dsEndereco;
    protected String nrEndereco;
    protected String dsComplemento;
    protected String nmBairro;
    protected BigInteger nrCidadeIbge;
    protected String nmUf;
    protected String nmCidadeEstrangeira;
    @XmlElement(required = true)
    protected String nmPais;
    protected String nrCep;
    protected String nrTelefone;

    /**
     * Obt�m o valor da propriedade documento.
     * 
     * @return
     *     possible object is
     *     {@link TcDocumento }
     *     
     */
    public TcDocumento getDocumento() {
        return documento;
    }

    /**
     * Define o valor da propriedade documento.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDocumento }
     *     
     */
    public void setDocumento(TcDocumento value) {
        this.documento = value;
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
     * Obt�m o valor da propriedade dsEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsEmail() {
        return dsEmail;
    }

    /**
     * Define o valor da propriedade dsEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsEmail(String value) {
        this.dsEmail = value;
    }

    /**
     * Obt�m o valor da propriedade nrInscricaoEstadual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInscricaoEstadual() {
        return nrInscricaoEstadual;
    }

    /**
     * Define o valor da propriedade nrInscricaoEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInscricaoEstadual(String value) {
        this.nrInscricaoEstadual = value;
    }

    /**
     * Obt�m o valor da propriedade dsEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsEndereco() {
        return dsEndereco;
    }

    /**
     * Define o valor da propriedade dsEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsEndereco(String value) {
        this.dsEndereco = value;
    }

    /**
     * Obt�m o valor da propriedade nrEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrEndereco() {
        return nrEndereco;
    }

    /**
     * Define o valor da propriedade nrEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrEndereco(String value) {
        this.nrEndereco = value;
    }

    /**
     * Obt�m o valor da propriedade dsComplemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsComplemento() {
        return dsComplemento;
    }

    /**
     * Define o valor da propriedade dsComplemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsComplemento(String value) {
        this.dsComplemento = value;
    }

    /**
     * Obt�m o valor da propriedade nmBairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmBairro() {
        return nmBairro;
    }

    /**
     * Define o valor da propriedade nmBairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmBairro(String value) {
        this.nmBairro = value;
    }

    /**
     * Obt�m o valor da propriedade nrCidadeIbge.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrCidadeIbge() {
        return nrCidadeIbge;
    }

    /**
     * Define o valor da propriedade nrCidadeIbge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrCidadeIbge(BigInteger value) {
        this.nrCidadeIbge = value;
    }

    /**
     * Obt�m o valor da propriedade nmUf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmUf() {
        return nmUf;
    }

    /**
     * Define o valor da propriedade nmUf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmUf(String value) {
        this.nmUf = value;
    }

    /**
     * Obt�m o valor da propriedade nmCidadeEstrangeira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmCidadeEstrangeira() {
        return nmCidadeEstrangeira;
    }

    /**
     * Define o valor da propriedade nmCidadeEstrangeira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmCidadeEstrangeira(String value) {
        this.nmCidadeEstrangeira = value;
    }

    /**
     * Obt�m o valor da propriedade nmPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmPais() {
        return nmPais;
    }

    /**
     * Define o valor da propriedade nmPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmPais(String value) {
        this.nmPais = value;
    }

    /**
     * Obt�m o valor da propriedade nrCep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrCep() {
        return nrCep;
    }

    /**
     * Define o valor da propriedade nrCep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrCep(String value) {
        this.nrCep = value;
    }

    /**
     * Obt�m o valor da propriedade nrTelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrTelefone() {
        return nrTelefone;
    }

    /**
     * Define o valor da propriedade nrTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrTelefone(String value) {
        this.nrTelefone = value;
    }

}
