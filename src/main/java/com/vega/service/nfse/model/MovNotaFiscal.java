package com.vega.service.nfse.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

/**
 * Created by Ronaldo on 14/08/2016.
 */
@Data
@Entity
public class MovNotaFiscal {
    @Id
    private BigInteger idNotaFiscal;
    private BigInteger nroNotaFiscal;

}
