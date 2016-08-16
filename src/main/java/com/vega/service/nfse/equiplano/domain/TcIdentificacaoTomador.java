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
 * Representa a identificacao do tomador
 * 
 * <p>Classe Java de tcIdentificacaoTomador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcIdentificacaoTomador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documento" type="{http://www.equiplano.com.br/esnfs/tipos}tcDocumento"/>
 *         &lt;element name="nmTomador" type="{http://www.equiplano.com.br/esnfs/tipos}tsNmTomador" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcIdentificacaoTomador", propOrder = {
    "documento",
    "nmTomador"
})
public class TcIdentificacaoTomador {

    @XmlElement(required = true)
    protected TcDocumento documento;
    protected String nmTomador;

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

}
