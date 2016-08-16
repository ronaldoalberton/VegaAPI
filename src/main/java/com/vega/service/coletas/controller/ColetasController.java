/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.coletas.controller;

import com.vega.service.configuration.ResponseRest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author ronaldo.alberton
 */
@RequestMapping(value = "/coletas")
public interface ColetasController {    
    /**     
     * @param sqlLine
     * @return
     */
    @RequestMapping(value = "envia", method = RequestMethod.POST)
    ResponseEntity<ResponseRest> envia(@RequestBody String sqlLine);
    
    @RequestMapping(value = "pendente", method = RequestMethod.GET)
    ResponseEntity<String> pendente();    
    
    @RequestMapping(value = "recebe/{codColeta}", method = RequestMethod.GET)
    ResponseEntity<String> recebe(@PathVariable String codColeta);        
    
    @RequestMapping(value = "confirma", method = RequestMethod.POST)
    ResponseEntity<ResponseRest> confirma(@RequestBody String codColeta);    
    
    
    
}
