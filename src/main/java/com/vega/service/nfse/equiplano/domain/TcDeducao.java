//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa a estrutura da deducao
 * 
 * <p>Classe Java de tcDeducao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcDeducao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vlDeducao" type="{http://www.equiplano.com.br/esnfs/tipos}tsValor"/>
 *         &lt;element name="dsJustificativaDeducao" type="{http://www.equiplano.com.br/esnfs/tipos}tsDsJustificativaDeducao"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcDeducao", propOrder = {
    "vlDeducao",
    "dsJustificativaDeducao"
})
public class TcDeducao {

    @XmlElement(required = true)
    protected BigDecimal vlDeducao;
    @XmlElement(required = true)
    protected String dsJustificativaDeducao;

    /**
     * Obt�m o valor da propriedade vlDeducao.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlDeducao() {
        return vlDeducao;
    }

    /**
     * Define o valor da propriedade vlDeducao.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlDeducao(BigDecimal value) {
        this.vlDeducao = value;
    }

    /**
     * Obt�m o valor da propriedade dsJustificativaDeducao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsJustificativaDeducao() {
        return dsJustificativaDeducao;
    }

    /**
     * Define o valor da propriedade dsJustificativaDeducao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsJustificativaDeducao(String value) {
        this.dsJustificativaDeducao = value;
    }

}
