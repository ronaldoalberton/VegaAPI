/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.info.domain;

import lombok.Data;
import org.joda.time.DateTime;
/**
 *
 * @author ronaldo.alberton
 */
@Data
public class Info {
    
    private DateTime dataHora;   
    private String nomeClasse;

    public Info(DateTime dataHora, String nomeClasse) {
        this.dataHora = dataHora;
        this.nomeClasse = nomeClasse;
    }   
    
}
