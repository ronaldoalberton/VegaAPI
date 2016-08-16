//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.11.29 �s 09:35:19 AM BRST 
//

package com.vega.service.nfse.equiplano.domain;


import java.io.StringWriter;

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
 *         &lt;element name="rps" type="{http://www.equiplano.com.br/esnfs/tipos}tcIdentificacaoRps"/>
 *         &lt;element name="prestador" type="{http://www.equiplano.com.br/esnfs/tipos}tcIdentificacaoPrestador"/>
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
    "rps",
    "prestador",
    "signature"
})
@XmlRootElement(name = "esConsultarNfsePorRpsEnvio", namespace = "http://www.equiplano.com.br/esnfs")
public class EsConsultarNfsePorRpsEnvio {

    @XmlElement(required = true)
    protected TcIdentificacaoRps rps;
    @XmlElement(required = true)
    protected TcIdentificacaoPrestador prestador;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obt�m o valor da propriedade rps.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoRps }
     *     
     */
    public TcIdentificacaoRps getRps() {
        return rps;
    }

    /**
     * Define o valor da propriedade rps.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoRps }
     *     
     */
    public void setRps(TcIdentificacaoRps value) {
        this.rps = value;
    }

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
			
			jaxbContext = JAXBContext.newInstance(EsConsultarNfsePorRpsEnvio.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();		
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);		
			jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,"http://www.equiplano.com.br/enfs esConsultarNfsePorRpsEnvio.xsd");					
			jaxbMarshaller.marshal(this, stringWriter);			
						
		} catch (JAXBException e) {
			//
		}
		
		return stringWriter.toString();
		
    }
    
    

}
