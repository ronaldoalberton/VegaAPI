/**
 * EnfsPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vega.service.nfse.equiplano.servicos;

public interface EnfsPortType extends java.rmi.Remote {
    public java.lang.String esRecepcionarLoteRps(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String esCancelarNfse(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String esConsultarNfse(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String esConsultarLoteRps(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String esConsultarSituacaoLoteRps(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException;
    public java.lang.String esConsultarNfsePorRps(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException;
}
