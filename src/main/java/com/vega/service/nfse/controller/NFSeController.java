/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.nfse.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ronaldo
 */
@RequestMapping(value = "/nfse")
public interface NFSeController {
    
    @RequestMapping(value = "consultarnfse/{idNotaFiscal}", method = RequestMethod.GET)
    public String consultarNFSe(@PathVariable Integer idNotaFiscal);
    
    @RequestMapping(value = "enviarlotenfse/{idNotaFiscal}", method = RequestMethod.GET)
    public String enviarLoteNFSe(@PathVariable Integer idNotaFiscal);
    
    @RequestMapping(value = "cancelarnfse/{idNotaFiscal}", method = RequestMethod.GET)
    public String cancelarNFSe(@PathVariable Integer  idNotaFiscal);
    
    @RequestMapping(value = "downloadfilenfse/{idNotaFiscal}", method = RequestMethod.GET)
    public String downloadFileNFSe(@PathVariable Integer  idNotaFiscal);   
    
}
