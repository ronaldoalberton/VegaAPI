package com.vega.service.nfse.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Ronaldo on 08/08/2016.
 */
@Data
@Entity
@Table(name = "NotaFiscalItensVW")
public class NotaFiscalItensView {
    @Id
    private BigInteger idSequencia;
    private BigInteger idNotaFiscal;
    private String classificacao;
    private BigDecimal valorServico;
    private BigDecimal valorLiquido;
    private BigDecimal aliquotaIss;
    private BigDecimal valorDesconto;
    private BigDecimal baseCalculoIss;
    private BigDecimal valorIss;
    private String descricaoServico;
    private String obsDigitada;
    private BigInteger codigoAtividade;
    private BigDecimal quantidade;
    private BigDecimal valorUnitario;
}
