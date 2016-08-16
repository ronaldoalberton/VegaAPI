/**
 * EnfsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vega.service.nfse.equiplano.servicos;

public class EnfsLocator extends org.apache.axis.client.Service implements com.vega.service.nfse.equiplano.servicos.Enfs {

    public EnfsLocator() {
    }


    public EnfsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EnfsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EnfsHttpsSoap11Endpoint
    private java.lang.String EnfsHttpsSoap11Endpoint_address = "https://www.esnfs.com.br:9444/homologacaows/services/Enfs.EnfsHttpsSoap11Endpoint/";

    public java.lang.String getEnfsHttpsSoap11EndpointAddress() {
        return EnfsHttpsSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EnfsHttpsSoap11EndpointWSDDServiceName = "EnfsHttpsSoap11Endpoint";

    public java.lang.String getEnfsHttpsSoap11EndpointWSDDServiceName() {
        return EnfsHttpsSoap11EndpointWSDDServiceName;
    }

    public void setEnfsHttpsSoap11EndpointWSDDServiceName(java.lang.String name) {
        EnfsHttpsSoap11EndpointWSDDServiceName = name;
    }

    public com.vega.service.nfse.equiplano.servicos.EnfsPortType getEnfsHttpsSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EnfsHttpsSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEnfsHttpsSoap11Endpoint(endpoint);
    }

    public com.vega.service.nfse.equiplano.servicos.EnfsPortType getEnfsHttpsSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.vega.service.nfse.equiplano.servicos.EnfsSoap11BindingStub _stub = new com.vega.service.nfse.equiplano.servicos.EnfsSoap11BindingStub(portAddress, this);
            _stub.setPortName(getEnfsHttpsSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEnfsHttpsSoap11EndpointEndpointAddress(java.lang.String address) {
        EnfsHttpsSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.vega.service.nfse.equiplano.servicos.EnfsPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.vega.service.nfse.equiplano.servicos.EnfsSoap11BindingStub _stub = new com.vega.service.nfse.equiplano.servicos.EnfsSoap11BindingStub(new java.net.URL(EnfsHttpsSoap11Endpoint_address), this);
                _stub.setPortName(getEnfsHttpsSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EnfsHttpsSoap11Endpoint".equals(inputPortName)) {
            return getEnfsHttpsSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.enfsws.es", "Enfs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.enfsws.es", "EnfsHttpsSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EnfsHttpsSoap11Endpoint".equals(portName)) {
            setEnfsHttpsSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
