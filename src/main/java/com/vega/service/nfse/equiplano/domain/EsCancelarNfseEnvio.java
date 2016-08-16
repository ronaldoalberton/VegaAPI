//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:54:45 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import java.io.StringWriter;
import java.math.BigInteger;

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
 *         &lt;element name="prestador" type="{http://www.equiplano.com.br/esnfs/tipos}tcIdentificacaoPrestador"/>
 *         &lt;element name="nrNfse" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dsMotivoCancelamento" type="{http://www.equiplano.com.br/esnfs/tipos}tsMotivoCancelamentoNfse"/>
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
    "prestador",
    "nrNfse",
    "dsMotivoCancelamento",
    "signature"
})
@XmlRootElement(name = "esCancelarNfseEnvio", namespace = "http://www.equiplano.com.br/esnfs")
public class EsCancelarNfseEnvio {

    @XmlElement(required = true)
    protected TcIdentificacaoPrestador prestador;
    @XmlElement(required = true)
    protected BigInteger nrNfse;
    @XmlElement(required = true)
    protected String dsMotivoCancelamento;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

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
     * Obt�m o valor da propriedade nrNfse.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrNfse() {
        return nrNfse;
    }

    /**
     * Define o valor da propriedade nrNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrNfse(BigInteger value) {
        this.nrNfse = value;
    }

    /**
     * Obt�m o valor da propriedade dsMotivoCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsMotivoCancelamento() {
        return dsMotivoCancelamento;
    }

    /**
     * Define o valor da propriedade dsMotivoCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsMotivoCancelamento(String value) {
        this.dsMotivoCancelamento = value;
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
    
    public String toXML(){
    	
    	StringWriter stringWriter = new StringWriter();
		JAXBContext jaxbContext;
		
		try {
			
			jaxbContext = JAXBContext.newInstance(EsCancelarNfseEnvio.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();		
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);		
			jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,"http://www.equiplano.com.br/enfs esCancelarNfseEnvio_v01.xsd");					
			jaxbMarshaller.marshal(this, stringWriter);			
						
		} catch (JAXBException e) {
			//
		}
		
		return stringWriter.toString();    	
    	
    }

}
