package com.vega.service.nfse.equiplano.servicos;

public class EnfsPortTypeProxy implements com.vega.service.nfse.equiplano.servicos.EnfsPortType {
  private String _endpoint = null;
  private com.vega.service.nfse.equiplano.servicos.EnfsPortType enfsPortType = null;
  
  public EnfsPortTypeProxy() {
    _initEnfsPortTypeProxy();
  }
  
  public EnfsPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initEnfsPortTypeProxy();
  }
  
  private void _initEnfsPortTypeProxy() {
    try {
      enfsPortType = (new com.vega.service.nfse.equiplano.servicos.EnfsLocator()).getEnfsHttpsSoap11Endpoint();
      if (enfsPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)enfsPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)enfsPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (enfsPortType != null)
      ((javax.xml.rpc.Stub)enfsPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.vega.service.nfse.equiplano.servicos.EnfsPortType getEnfsPortType() {
    if (enfsPortType == null)
      _initEnfsPortTypeProxy();
    return enfsPortType;
  }
  
  public java.lang.String esRecepcionarLoteRps(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException{
    if (enfsPortType == null)
      _initEnfsPortTypeProxy();
    return enfsPortType.esRecepcionarLoteRps(nrVersaoXml, xml);
  }
  
  public java.lang.String esCancelarNfse(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException{
    if (enfsPortType == null)
      _initEnfsPortTypeProxy();
    return enfsPortType.esCancelarNfse(nrVersaoXml, xml);
  }
  
  public java.lang.String esConsultarNfse(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException{
    if (enfsPortType == null)
      _initEnfsPortTypeProxy();
    return enfsPortType.esConsultarNfse(nrVersaoXml, xml);
  }
  
  public java.lang.String esConsultarLoteRps(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException{
    if (enfsPortType == null)
      _initEnfsPortTypeProxy();
    return enfsPortType.esConsultarLoteRps(nrVersaoXml, xml);
  }
  
  public java.lang.String esConsultarSituacaoLoteRps(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException{
    if (enfsPortType == null)
      _initEnfsPortTypeProxy();
    return enfsPortType.esConsultarSituacaoLoteRps(nrVersaoXml, xml);
  }
  
  public java.lang.String esConsultarNfsePorRps(java.lang.String nrVersaoXml, java.lang.String xml) throws java.rmi.RemoteException{
    if (enfsPortType == null)
      _initEnfsPortTypeProxy();
    return enfsPortType.esConsultarNfsePorRps(nrVersaoXml, xml);
  }
  
  
}