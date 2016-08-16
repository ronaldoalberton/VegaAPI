/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.listacoleta.controller;

import com.vega.service.configuration.ResponseRest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ronaldo
 */
@RequestMapping(value = "/listacoleta")
public interface ListaColetaController {
    
    @RequestMapping(value = "envia", method = RequestMethod.POST)
    ResponseEntity<ResponseRest> envia(@RequestBody String sqlLine);
    
    @RequestMapping(value = "seleciona", method = RequestMethod.GET)
    ResponseEntity<String> seleciona();    
    
    @RequestMapping(value = "lista/{codLista}", method = RequestMethod.GET)
    ResponseEntity<String> lista(@PathVariable String codLista);    
    
    @RequestMapping(value = "recebe/{codListaScript}", method = RequestMethod.GET)
    ResponseEntity<String> recebe(@PathVariable String codListaScript);        

    
    
}
