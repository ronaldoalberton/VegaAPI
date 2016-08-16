//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//

package com.vega.service.nfse.equiplano.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de KeyValueType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KeyValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RSAKeyValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Modulus" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *                   &lt;element name="Exponent" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
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
@XmlType(name = "KeyValueType", namespace = "http://www.w3.org/2000/09/xmldsig#", propOrder = {
    "rsaKeyValue"
})
public class KeyValueType {

    @XmlElement(name = "RSAKeyValue", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected KeyValueType.RSAKeyValue rsaKeyValue;

    /**
     * Obt�m o valor da propriedade rsaKeyValue.
     * 
     * @return
     *     possible object is
     *     {@link KeyValueType.RSAKeyValue }
     *     
     */
    public KeyValueType.RSAKeyValue getRSAKeyValue() {
        return rsaKeyValue;
    }

    /**
     * Define o valor da propriedade rsaKeyValue.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValueType.RSAKeyValue }
     *     
     */
    public void setRSAKeyValue(KeyValueType.RSAKeyValue value) {
        this.rsaKeyValue = value;
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
     *         &lt;element name="Modulus" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
     *         &lt;element name="Exponent" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
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
        "modulus",
        "exponent"
    })
    public static class RSAKeyValue {

        @XmlElement(name = "Modulus", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
        protected byte[] modulus;
        @XmlElement(name = "Exponent", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
        protected byte[] exponent;

        /**
         * Obt�m o valor da propriedade modulus.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getModulus() {
            return modulus;
        }

        /**
         * Define o valor da propriedade modulus.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setModulus(byte[] value) {
            this.modulus = value;
        }

        /**
         * Obt�m o valor da propriedade exponent.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getExponent() {
            return exponent;
        }

        /**
         * Define o valor da propriedade exponent.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setExponent(byte[] value) {
            this.exponent = value;
        }

    }

}
