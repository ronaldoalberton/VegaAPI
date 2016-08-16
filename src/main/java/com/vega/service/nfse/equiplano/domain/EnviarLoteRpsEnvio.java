//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.09.14 �s 01:51:37 PM BRT 
//


package com.vega.service.nfse.equiplano.domain;

import com.vega.service.util.VegaException;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="lote">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nrLote" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="qtRps" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="nrVersaoXml" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="prestador" type="{http://www.equiplano.com.br/esnfs/tipos}tcPrestador"/>
 *                   &lt;element name="listaRps">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="rps" type="{http://www.equiplano.com.br/esnfs/tipos}tcRps" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "lote",
    "signature"
})  
@XmlRootElement(name = "enviarLoteRpsEnvio", namespace = "http://www.equiplano.com.br/esnfs")
public class EnviarLoteRpsEnvio {

    @XmlElement(required = true)
    protected EnviarLoteRpsEnvio.Lote lote;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obt�m o valor da propriedade lote.
     * 
     * @return
     *     possible object is
     *     {@link EnviarLoteRpsEnvio.Lote }
     *     
     */
    public EnviarLoteRpsEnvio.Lote getLote() {
        return lote;
    }

    /**
     * Define o valor da propriedade lote.
     * 
     * @param value
     *     allowed object is
     *     {@link EnviarLoteRpsEnvio.Lote }
     *     
     */
    public void setLote(EnviarLoteRpsEnvio.Lote value) {
        this.lote = value;
    }

    /**
     * Obt�m o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     *         &lt;element name="nrLote" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="qtRps" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="nrVersaoXml" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="prestador" type="{http://www.equiplano.com.br/esnfs/tipos}tcPrestador"/>
     *         &lt;element name="listaRps">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="rps" type="{http://www.equiplano.com.br/esnfs/tipos}tcRps" maxOccurs="unbounded"/>
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
    @XmlType(name = "", propOrder = {
        "nrLote",
        "qtRps",
        "nrVersaoXml",
        "prestador",
        "listaRps"
    })
    public static class Lote {

        @XmlElement(required = true)
        protected int nrLote;
        @XmlElement(required = true)
        protected int qtRps;
        @XmlElement(required = true)
        protected int nrVersaoXml;
        @XmlElement(required = true)
        protected TcPrestador prestador;
        @XmlElement(required = true)
        protected EnviarLoteRpsEnvio.Lote.ListaRps listaRps;

        /**
         * Obt�m o valor da propriedade nrLote.
         * 
         * @return
         *     possible object is
         *     {@link int }
         *     
         */
        public int getNrLote() {
            return nrLote;
        }

        /**
         * Define o valor da propriedade nrLote.
         * 
         * @param value
         *     allowed object is
         *     {@link int }
         *     
         */
        public void setNrLote(int value) {
            this.nrLote = value;
        }

        /**
         * Obt�m o valor da propriedade qtRps.
         * 
         * @return
         *     possible object is
         *     {@link int }
         *     
         */
        public int getQtRps() {
            return qtRps;
        }

        /**
         * Define o valor da propriedade qtRps.
         * 
         * @param value
         *     allowed object is
         *     {@link int }
         *     
         */
        public void setQtRps(int value) {
            this.qtRps = value;
        }

        /**
         * Obt�m o valor da propriedade nrVersaoXml.
         * 
         * @return
         *     possible object is
         *     {@link int }
         *     
         */
        public int getNrVersaoXml() {
            return nrVersaoXml;
        }

        /**
         * Define o valor da propriedade nrVersaoXml.
         * 
         * @param value
         *     allowed object is
         *     {@link int }
         *     
         */
        public void setNrVersaoXml(int value) {
            this.nrVersaoXml = value;
        }

        /**
         * Obt�m o valor da propriedade prestador.
         * 
         * @return
         *     possible object is
         *     {@link TcPrestador }
         *     
         */
        public TcPrestador getPrestador() {
            return prestador;
        }

        /**
         * Define o valor da propriedade prestador.
         * 
         * @param value
         *     allowed object is
         *     {@link TcPrestador }
         *     
         */
        public void setPrestador(TcPrestador value) {
            this.prestador = value;
        }

        /**
         * Obt�m o valor da propriedade listaRps.
         * 
         * @return
         *     possible object is
         *     {@link EnviarLoteRpsEnvio.Lote.ListaRps }
         *     
         */
        public EnviarLoteRpsEnvio.Lote.ListaRps getListaRps() {
            return listaRps;
        }

        /**
         * Define o valor da propriedade listaRps.
         * 
         * @param value
         *     allowed object is
         *     {@link EnviarLoteRpsEnvio.Lote.ListaRps }
         *     
         */
        public void setListaRps(EnviarLoteRpsEnvio.Lote.ListaRps value) {
            this.listaRps = value;
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
         *         &lt;element name="rps" type="{http://www.equiplano.com.br/esnfs/tipos}tcRps" maxOccurs="unbounded"/>
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
            "rps"
        })
        public static class ListaRps {

            @XmlElement(required = true)
            protected List<TcRps> rps;

            /**
             * Gets the value of the rps property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rps property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRps().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TcRps }
             * 
             * 
             */
            public List<TcRps> getRps() {
                if (rps == null) {
                    rps = new ArrayList<TcRps>();
                }
                return this.rps;
            }

        }

    }
    
    public String toXML() throws VegaException {
    	StringWriter stringWriter = new StringWriter();
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(EnviarLoteRpsEnvio.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();		
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);		
			jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,"http://www.equiplano.com.br/enfs esRecepcionarLoteRpsEnvio_v01.xsd");					
			jaxbMarshaller.marshal(this, stringWriter);			
						
		} catch (JAXBException e) {
            throw new VegaException(e.getMessage());
		}
		return stringWriter.toString();
    }
    

}
