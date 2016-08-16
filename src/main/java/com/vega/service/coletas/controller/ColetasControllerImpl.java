/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.coletas.controller;

import com.google.gson.Gson;
import com.vega.service.configuration.DataBaseUtil;
import com.vega.service.coletas.domain.MovColetor;
import com.vega.service.configuration.ResponseRest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColetasControllerImpl implements ColetasController {

    @Override
    public ResponseEntity<ResponseRest> envia(@RequestBody String sqlLine) {          
        Connection connection = null;
        ResponseRest responseRest = new ResponseRest();
        try {
            connection = DataBaseUtil.getConnection();            
            connection.setAutoCommit(false);
            try (PreparedStatement stmt = connection.prepareStatement(sqlLine)) {
                stmt.executeUpdate();
                connection.commit();
            }
            connection.close();
            responseRest.setSucesso(true);
            responseRest.setRetorno("OK");                        
            return new ResponseEntity<>(responseRest,HttpStatus.OK);
        } catch (SQLException ex) {
            try {
                if ( connection != null ){
                    connection.rollback();
                    connection.close();
                }
            } catch (SQLException ex1) {
                Logger.getLogger(ColetasControllerImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            responseRest.setSucesso(false);
            responseRest.setRetorno(ex.getMessage());            
            return new ResponseEntity<>(responseRest,HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (ClassNotFoundException ex) {
            responseRest.setSucesso(false);
            responseRest.setRetorno(ex.getMessage());            
            return new ResponseEntity<>(responseRest,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<String> pendente() {
    
        StringBuilder sbSql = new StringBuilder();
        StringBuilder sbRetorno = new StringBuilder();        
        
        sbSql.append("SELECT ");      
        sbSql.append("  ID ");
        sbSql.append("FROM ");
        sbSql.append("  MOVCOLETOR ");        
        sbSql.append("WHERE ");
        sbSql.append("  IMPORTADO = 0 ");        
        sbSql.append("ORDER BY ");
        sbSql.append("  ID ");        
        
        Connection connection = null;
        try {            
            connection = DataBaseUtil.getConnection();
            try (PreparedStatement stmt = connection.prepareStatement(sbSql.toString()); 
                ResultSet rs = stmt.executeQuery()) {
                while ( rs.next() ){
                    sbRetorno.append(rs.getInt("ID")).append(",");
                }
            }
            connection.close();
            return new ResponseEntity<>(sbRetorno.toString(),HttpStatus.OK);            
        } catch (ClassNotFoundException | SQLException ex) {
            try {
                if ( connection != null ){
                    connection.rollback();
                    connection.close();
                }
            } catch (SQLException ex1) {
                Logger.getLogger(ColetasControllerImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ColetasControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }                
    }

    @Override
    public ResponseEntity<String> recebe(@PathVariable String codColeta) {
        
        StringBuilder sbSql = new StringBuilder();
        
        sbSql.append("SELECT ");      
        sbSql.append("  ID, ");
        sbSql.append("  IDCLIENTE, ");
        sbSql.append("  IDPONTOCOLETA, ");
        sbSql.append("  DATACOLETA, ");
        sbSql.append("  IDRESIDUO, ");
        sbSql.append("  UNIDADE, ");
        sbSql.append("  QTDE, ");
        sbSql.append("  IDENTIFICACAO, ");
        sbSql.append("  IMPORTADO ");
        sbSql.append("FROM ");
        sbSql.append("  MOVCOLETOR ");        
        sbSql.append("WHERE ");
        sbSql.append("  ID IN (").append(codColeta).append(")");        
        
        Connection connection = null;
        try {
            
            List<MovColetor> movColetas = new ArrayList<MovColetor>();
            
            connection = DataBaseUtil.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sbSql.toString());
            ResultSet rs = stmt.executeQuery();            
            while ( rs.next() ){                
                MovColetor movColetor = new MovColetor();
                movColetor.setId(rs.getInt("ID"));
                movColetor.setIdCliente(rs.getInt("IDCLIENTE"));
                movColetor.setIdPontoColeta(rs.getInt("IDPONTOCOLETA"));
                movColetor.setDataColeta(rs.getString("DATACOLETA"));
                movColetor.setIdResiduo(rs.getInt("IDRESIDUO"));
                movColetor.setUnidade(rs.getString("UNIDADE"));
                movColetor.setQtde(rs.getDouble("QTDE"));
                movColetor.setIdentificacao(rs.getString("IDENTIFICACAO"));
                movColetas.add(movColetor);
            }      
            rs.close();
            stmt.close();
            connection.close();
            Gson gson = new Gson();
            String json = gson.toJson(movColetas);
            return new ResponseEntity<>(json,HttpStatus.OK);
            
        } catch (ClassNotFoundException | SQLException ex) {
            try {
                if ( connection != null ){
                    connection.rollback();
                    connection.close();
                }
            } catch (SQLException ex1) {
                Logger.getLogger(ColetasControllerImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ColetasControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }        
                
    }

    @Override
    public ResponseEntity<ResponseRest> confirma(@RequestBody String codColeta) {
        Connection connection = null;
        ResponseRest responseRest = new ResponseRest();
        try {
            connection = DataBaseUtil.getConnection();
            connection.setAutoCommit(false);
            try (PreparedStatement stmt = connection.prepareStatement("UPDATE MOVCOLETOR SET IMPORTADO = 1 WHERE ID IN  ("+codColeta+")")) {
                stmt.executeUpdate();
            }
            connection.commit();     
            connection.close();
            responseRest.setSucesso(true);
            responseRest.setRetorno("OK"); 
            return new ResponseEntity<>(responseRest,HttpStatus.OK);
        } catch (ClassNotFoundException | SQLException ex) {
            try {
                if ( connection != null ){
                    connection.rollback();
                    connection.close();
                }
            } catch (SQLException ex1) {
                Logger.getLogger(ColetasControllerImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ColetasControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            responseRest.setSucesso(false);
            responseRest.setRetorno(ex.getMessage());            
            return new ResponseEntity<>(responseRest,HttpStatus.OK);
        }

    }
    
    
}
