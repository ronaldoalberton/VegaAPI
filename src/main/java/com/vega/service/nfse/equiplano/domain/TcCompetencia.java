//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2014.12.23 �s 10:56:33 PM BRST 
//


package com.vega.service.nfse.equiplano.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa a estrutura da compet�ncia
 * 
 * <p>Classe Java de tcCompetencia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcCompetencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrAnoCompetencia" type="{http://www.equiplano.com.br/esnfs/tipos}tsAnoCompetencia"/>
 *         &lt;element name="nrMesCompetencia" type="{http://www.equiplano.com.br/esnfs/tipos}tsMesCompetencia"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcCompetencia", propOrder = {
    "nrAnoCompetencia",
    "nrMesCompetencia"
})

public class TcCompetencia {

    protected int nrAnoCompetencia;
    protected int nrMesCompetencia;

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

}
