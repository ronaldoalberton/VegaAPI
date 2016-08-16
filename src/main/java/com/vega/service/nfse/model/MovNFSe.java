package com.vega.service.nfse.model;

import com.vega.service.nfse.generic.TypeNFSe;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

/**
 * Created by Ronaldo on 14/08/2016.
 */
@Data
@Entity
public class MovNFSe {
    @Id
    private BigInteger idNotaFiscal;
    private String protocoloRecebimento;
    private String msg;
    private String codigoAutenticacao;
    private TypeNFSe.StatusNFSe status;
    private String xml;
    private Byte ambienteNFSe;
}
