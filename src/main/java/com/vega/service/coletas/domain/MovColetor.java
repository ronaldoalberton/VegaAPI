/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.coletas.domain;

import lombok.Data;

/**
 *
 * @author Ronaldo
 */
@Data
public class MovColetor {
    private Integer id;
    private Integer idCliente;
    private Integer idPontoColeta;
    private String dataColeta;
    private Integer idResiduo;
    private String unidade;
    private Double qtde;
    private String identificacao;
    private boolean importado;    
}
