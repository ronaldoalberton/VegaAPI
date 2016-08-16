/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.nfse.generic;

import com.vega.service.configuration.HibernateUtil;
import com.vega.service.nfse.equiplano.envio.EnvioNFSeEquiplano;
import com.vega.service.nfse.model.NotaFiscalView;
import com.vega.service.nfse.model.NotaFiscalItensView;

import java.util.List;

/**
 *
 * @author Ronaldo
 */
public class NFSe {

    private NotaFiscalView notaFiscalView;
    private IEnvioNFSe envioNFSe;

    public NotaFiscalView getNotaFiscalView() {
        return this.notaFiscalView;
    }

    public IEnvioNFSe getEnvioNFSe() {
        return this.envioNFSe;
    }

    public NFSe(Integer idNotaFiscal) {

        String sql = "from NotaFiscalView Where idNotaFiscal = " + String.valueOf(idNotaFiscal);
        this.notaFiscalView = (NotaFiscalView) HibernateUtil.getSingleClass(sql);

        sql = "from NotaFiscalItensView Where idNotaFiscal = " + String.valueOf(idNotaFiscal);
        List<NotaFiscalItensView> notaFiscalItenViews = (List<NotaFiscalItensView>) (List<?>) HibernateUtil.getListClass(sql);

        this.notaFiscalView.setNotaFiscalItens(notaFiscalItenViews);
        this.envioNFSe = new EnvioNFSeEquiplano();
    }


}
