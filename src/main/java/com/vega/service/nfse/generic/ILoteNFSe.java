/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.nfse.generic;

import com.vega.service.nfse.model.NotaFiscalView;
import com.vega.service.util.VegaException;

/**
 *
 * @author Ronaldo
 */
public interface ILoteNFSe {
    public String criaArquivoEnvioLote(NotaFiscalView notaFiscalView) throws VegaException;
    public String criaArquivoCancelamentoNFSe(NotaFiscalView notaFiscalView) throws VegaException;
    public String criaArquivoConsultaNFSe(NotaFiscalView notaFiscalView) throws VegaException;
    
}
