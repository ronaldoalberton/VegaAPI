/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.nfse.controller;

import com.vega.service.nfse.equiplano.envio.EnvioNFSeEquiplano;
import com.vega.service.nfse.generic.IEnvioNFSe;
import com.vega.service.nfse.generic.NFSe;
import com.vega.service.nfse.model.NotaFiscalView;
import com.vega.service.util.VegaException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Security;

/**
 *
 * @author Ronaldo
 */
@RestController
public class NFSeControllerImpl implements NFSeController{

    @Override
    public String consultarNFSe(@PathVariable Integer  idNotaFiscal){        
        IEnvioNFSe envioNFSe = new EnvioNFSeEquiplano();        
        try {
            return envioNFSe.consultarNFSe(null);
        } catch (VegaException ex) {
            return ex.getMessage();
        }         
    }

    @Override
    public String enviarLoteNFSe(@PathVariable Integer  idNotaFiscal) {
        NFSe nfse = new NFSe(idNotaFiscal);
        IEnvioNFSe envioNFSe = nfse.getEnvioNFSe();
        try {
            this.configureSecurityProperties(nfse.getNotaFiscalView());
            return envioNFSe.enviarLoteNFSe(nfse.getNotaFiscalView());
        } catch (VegaException ex) {
            return ex.getMessage();
        }                 
    }

    @Override
    public String cancelarNFSe(@PathVariable Integer  idNotaFiscal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String downloadFileNFSe(@PathVariable Integer  idNotaFiscal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void configureSecurityProperties(NotaFiscalView notaFiscalView){
        System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
        System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
        System.setProperty("javax.net.ssl.keyStore", notaFiscalView.getCaminhoCertificado()+"\\"+ notaFiscalView.getCertificadoDigital());
        System.setProperty("javax.net.ssl.keyStorePassword", notaFiscalView.getSenhaCertificado());
        System.setProperty("javax.net.ssl.trustStoreType", "JKS");
        System.setProperty("javax.net.ssl.trustStore", "C:/VEGA/certificados/CaCertsEquiplano");
    }


}
