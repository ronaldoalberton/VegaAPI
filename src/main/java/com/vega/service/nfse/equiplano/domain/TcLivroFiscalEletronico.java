//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representa a estrutura do livro fiscal eletr�nico
 * 
 * <p>Classe Java de tcLivroFiscalEletronico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcLivroFiscalEletronico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrVersaoLayout" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrMesCompetencia" type="{http://www.equiplano.com.br/esnfs/tipos}tsMesCompetencia"/>
 *         &lt;element name="nrAnoCompetencia" type="{http://www.equiplano.com.br/esnfs/tipos}tsAnoCompetencia"/>
 *         &lt;element name="nrCnpjPrestador" type="{http://www.equiplano.com.br/esnfs/tipos}tsNrDocumento"/>
 *         &lt;element name="nrInscricaoMunicipalPrestador" type="{http://www.equiplano.com.br/esnfs/tipos}tsInscricaoMunicipal"/>
 *         &lt;element name="isOptanteSimplesNacional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dtEnquadramentoSimplesNacional" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="notas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nota" type="{http://www.equiplano.com.br/esnfs/tipos}tcNotaLivroFEO" maxOccurs="unbounded"/>
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
@XmlType(name = "tcLivroFiscalEletronico", propOrder = {
    "nrVersaoLayout",
    "nrMesCompetencia",
    "nrAnoCompetencia",
    "nrCnpjPrestador",
    "nrInscricaoMunicipalPrestador",
    "isOptanteSimplesNacional",
    "dtEnquadramentoSimplesNacional",
    "notas"
})
public class TcLivroFiscalEletronico {

    @XmlElement(required = true)
    protected String nrVersaoLayout;
    protected int nrMesCompetencia;
    protected int nrAnoCompetencia;
    @XmlElement(required = true)
    protected String nrCnpjPrestador;
    @XmlElement(required = true)
    protected String nrInscricaoMunicipalPrestador;
    protected boolean isOptanteSimplesNacional;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtEnquadramentoSimplesNacional;
    @XmlElement(required = true)
    protected TcLivroFiscalEletronico.Notas notas;

    /**
     * Obt�m o valor da propriedade nrVersaoLayout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrVersaoLayout() {
        return nrVersaoLayout;
    }

    /**
     * Define o valor da propriedade nrVersaoLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrVersaoLayout(String value) {
        this.nrVersaoLayout = value;
    }

    /**
     * Obt�m o valor da propriedade nrMesCompetencia.
     * 
     */
    public int getNrMesCompetencia() {
        return nrMesCompetencia;
    }

    /**
     * Define o valor da propriedade nrMesCompetencia.
     * 
     */
    public void setNrMesCompetencia(int value) {
        this.nrMesCompetencia = value;
    }

    /**
     * Obt�m o valor da propriedade nrAnoCompetencia.
     * 
     */
    public int getNrAnoCompetencia() {
        return nrAnoCompetencia;
    }

    /**
     * Define o valor da propriedade nrAnoCompetencia.
     * 
     */
    public void setNrAnoCompetencia(int value) {
        this.nrAnoCompetencia = value;
    }

    /**
     * Obt�m o valor da propriedade nrCnpjPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrCnpjPrestador() {
        return nrCnpjPrestador;
    }

    /**
     * Define o valor da propriedade nrCnpjPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrCnpjPrestador(String value) {
        this.nrCnpjPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade nrInscricaoMunicipalPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInscricaoMunicipalPrestador() {
        return nrInscricaoMunicipalPrestador;
    }

    /**
     * Define o valor da propriedade nrInscricaoMunicipalPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInscricaoMunicipalPrestador(String value) {
        this.nrInscricaoMunicipalPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade isOptanteSimplesNacional.
     * 
     */
    public boolean isIsOptanteSimplesNacional() {
        return isOptanteSimplesNacional;
    }

    /**
     * Define o valor da propriedade isOptanteSimplesNacional.
     * 
     */
    public void setIsOptanteSimplesNacional(boolean value) {
        this.isOptanteSimplesNacional = value;
    }

    /**
     * Obt�m o valor da propriedade dtEnquadramentoSimplesNacional.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEnquadramentoSimplesNacional() {
        return dtEnquadramentoSimplesNacional;
    }

    /**
     * Define o valor da propriedade dtEnquadramentoSimplesNacional.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEnquadramentoSimplesNacional(XMLGregorianCalendar value) {
        this.dtEnquadramentoSimplesNacional = value;
    }

    /**
     * Obt�m o valor da propriedade notas.
     * 
     * @return
     *     possible object is
     *     {@link TcLivroFiscalEletronico.Notas }
     *     
     */
    public TcLivroFiscalEletronico.Notas getNotas() {
        return notas;
    }

    /**
     * Define o valor da propriedade notas.
     * 
     * @param value
     *     allowed object is
     *     {@link TcLivroFiscalEletronico.Notas }
     *     
     */
    public void setNotas(TcLivroFiscalEletronico.Notas value) {
        this.notas = value;
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
     *         &lt;element name="nota" type="{http://www.equiplano.com.br/esnfs/tipos}tcNotaLivroFEO" maxOccurs="unbounded"/>
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
        "nota"
    })
    public static class Notas {

        @XmlElement(required = true)
        protected List<TcNotaLivroFEO> nota;

        /**
         * Gets the value of the nota property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nota property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNota().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TcNotaLivroFEO }
         * 
         * 
         */
        public List<TcNotaLivroFEO> getNota() {
            if (nota == null) {
                nota = new ArrayList<TcNotaLivroFEO>();
            }
            return this.nota;
        }

    }

}
