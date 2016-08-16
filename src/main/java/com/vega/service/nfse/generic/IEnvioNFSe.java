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
public interface IEnvioNFSe {
    public String consultarNFSe(NotaFiscalView notaFiscalView) throws VegaException;
    public String enviarLoteNFSe(NotaFiscalView notaFiscalView) throws VegaException;
    public String cancelarNFSe(NotaFiscalView notaFiscalView) throws VegaException;
    public String downloadFileNFSe(NotaFiscalView notaFiscalView) throws VegaException;
    public String getURLWebService(NotaFiscalView notaFiscalView) throws VegaException;

}
