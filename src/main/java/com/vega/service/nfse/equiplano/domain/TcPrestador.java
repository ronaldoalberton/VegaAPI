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
 * Representa a estrutura do prestador
 * 
 * <p>Classe Java de tcPrestador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcPrestador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrCnpj" type="{http://www.equiplano.com.br/esnfs/tipos}tsCnpj"/>
 *         &lt;element name="nrInscricaoMunicipal" type="{http://www.equiplano.com.br/esnfs/tipos}tsInscricaoMunicipal"/>
 *         &lt;element name="isOptanteSimplesNacional" type="{http://www.equiplano.com.br/esnfs/tipos}tsSimNao"/>
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
@XmlType(name = "tcPrestador", propOrder = {
    "nrCnpj",
    "nrInscricaoMunicipal",
    "isOptanteSimplesNacional",
    "idEntidade"
})
public class TcPrestador {

    @XmlElement(required = true)
    protected String nrCnpj;
    @XmlElement(required = true)
    protected String nrInscricaoMunicipal;
    protected int isOptanteSimplesNacional;
    @XmlElement(required = true)
    protected BigInteger idEntidade;

    /**
     * Obt�m o valor da propriedade nrCnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrCnpj() {
        return nrCnpj;
    }

    /**
     * Define o valor da propriedade nrCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrCnpj(String value) {
        this.nrCnpj = value;
    }

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
     * Obt�m o valor da propriedade isOptanteSimplesNacional.
     * 
     */
    public int getIsOptanteSimplesNacional() {
        return isOptanteSimplesNacional;
    }

    /**
     * Define o valor da propriedade isOptanteSimplesNacional.
     * 
     */
    public void setIsOptanteSimplesNacional(int value) {
        this.isOptanteSimplesNacional = value;
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
