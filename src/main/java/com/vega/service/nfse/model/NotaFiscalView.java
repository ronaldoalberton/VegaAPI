/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.nfse.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

/**
 *
 * @author Ronaldo
 */
@Data
@Entity
@Table(name = "NotaFiscalVW") 
public class NotaFiscalView {
    @Id
    private BigInteger idNotaFiscal;
    private BigInteger nroRps;
    private Date dataEmissao;
    private BigDecimal valorTotal;
    private BigDecimal valorLiquido;
    private BigDecimal valorRetCofins;
    private BigDecimal valorRetPis;
    private BigDecimal valorRetCsll;
    private BigDecimal valorRetIrrf;
    private BigDecimal valorRetIss;
    private BigDecimal valorRetInss;
    private BigDecimal aliqRetCofins;
    private BigDecimal aliqRetPis;
    private BigDecimal aliqRetCsll;
    private BigDecimal aliqRetIrrf;
    private BigDecimal aliqRetIss;
    private BigDecimal aliqRetInss;
    private Integer tipoTributacaoIss;
    private String serieNota;
    private BigInteger nroLoteNFSe;
    private String cnpjCpfCliente;
    private String nomeCliente;
    private String emailCliente;
    private String emailContatoCliente;
    private String IECliente;
    private String IMCliente;
    private String enderecoCliente;
    private String numeroCliente;
    private String complementoCliente;
    private String bairroCliente;
    private BigInteger codigoIbgeCliente;
    private BigInteger codigoSiafiCliente;
    private String UFCliente;
    private String cidadeCliente;
    private BigInteger CEPCliente;
    private String foneCliente;
    private BigInteger nroNotaFiscal;
    private BigInteger idEmpresa;
    private BigInteger idCliente;
    private String nomeEmpresa;
    private String IMEmpresa;
    private String cnpjEmpresa;
    private String IEEmpresa;
    private BigInteger codigoIbgeEmpresa;
    private String numeroEmpresa;
    private String complementoEmpresa;
    private String enderecoEmpresa;
    private BigInteger CEPEmpresa;
    private String bairroEmpresa;
    private Integer regimeTributarioEmpresa;
    private String certificadoDigital;
    private Integer layoutNFSe;
    private String versaoXML;
    private BigInteger codigoMunicipioNFSe;
    private String senhaCertificado;
    private String caminhoCertificado;
    private Byte ambienteNFSe;
    @Transient
    private List<NotaFiscalItensView> notaFiscalItens;
}
