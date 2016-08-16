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
 * Representa a estrutura da identifica��o do prestador
 * 
 * <p>Classe Java de tcIdentificacaoPrestador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcIdentificacaoPrestador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrInscricaoMunicipal" type="{http://www.equiplano.com.br/esnfs/tipos}tsInscricaoMunicipal" minOccurs="0"/>
 *         &lt;element name="cnpj" type="{http://www.equiplano.com.br/esnfs/tipos}tsCnpj"/>
 *         &lt;element name="idEntidade" type="{http://www.equiplano.com.br/esnfs/tipos}tsIdEntidade"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcIdentificacaoPrestador", propOrder = {
    "nrInscricaoMunicipal",
    "cnpj",
    "idEntidade"
})
public class TcIdentificacaoPrestador {

    protected String nrInscricaoMunicipal;
    @XmlElement(required = true)
    protected String cnpj;
    @XmlElement(required = true)
    protected BigInteger idEntidade;

    /**
     * Obt�m o valor da propriedade nrInscricaoMunicipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInscricaoMunicipal() {
        return nrInscricaoMunicipal;
    }

    /**
     * Define o valor da propriedade nrInscricaoMunicipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInscricaoMunicipal(String value) {
        this.nrInscricaoMunicipal = value;
    }

    /**
     * Obt�m o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

    /**
     * Obt�m o valor da propriedade idEntidade.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdEntidade() {
        return idEntidade;
    }

    /**
     * Define o valor da propriedade idEntidade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdEntidade(BigInteger value) {
        this.idEntidade = value;
    }

}
