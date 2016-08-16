/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.listacoleta.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.vega.service.coletas.controller.ColetasControllerImpl;
import com.vega.service.configuration.DataBaseUtil;
import com.vega.service.configuration.ResponseRest;
import com.vega.service.listacoleta.domain.CadListaScript;
import com.vega.service.listacoleta.domain.CadLista;
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
public class ListaColetaControllerImpl implements ListaColetaController {
    /**
     * @param sqlLine
     * @return
     */
    @Override
    public ResponseEntity<ResponseRest> envia(@RequestBody String sqlLine) {
        Connection connection = null;
        ResponseRest responseRest = new ResponseRest();
        try {
            PreparedStatement stmt;
            connection = DataBaseUtil.getConnection();            
            connection.setAutoCommit(false);
            JsonArray lines = (JsonArray) new JsonParser().parse(sqlLine);
            for ( JsonElement line : lines  ){
                JsonObject comando = line.getAsJsonObject();                
                stmt = connection.prepareStatement(comando.get("sql").getAsString());
                stmt.executeUpdate();            
                stmt.close();
            }
            connection.commit();            
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
            return new ResponseEntity<>(responseRest,HttpStatus.OK);
        } catch (ClassNotFoundException ex) {
            responseRest.setSucesso(false);
            responseRest.setRetorno(ex.getMessage());                        
            return new ResponseEntity<>(responseRest,HttpStatus.OK);
        }
    }    

    @Override
    public ResponseEntity<String> recebe(@PathVariable String codListaScript) {
        
        StringBuilder sbSql = new StringBuilder();
        
        sbSql.append("SELECT ");      
        sbSql.append("  IDLISTA, ");
        sbSql.append("  SCRIPT ");
        sbSql.append("FROM ");
        sbSql.append("  CADLISTASCRIPT ");        
        sbSql.append("WHERE ");
        sbSql.append("  ID = ").append(codListaScript);        
        
        Connection connection = null;
        List<CadListaScript> cadListScript = new ArrayList<>();
        try {
            
            connection = DataBaseUtil.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sbSql.toString());
            ResultSet rs = stmt.executeQuery();            
            while ( rs.next() ){ 
                cadListScript.add(new CadListaScript());
                cadListScript.get(cadListScript.size()-1).setIdLista(rs.getInt("IDLISTA"));
                cadListScript.get(cadListScript.size()-1).setScript(rs.getString("SCRIPT"));                
            }     
            rs.close();
            stmt.close();
            connection.close();
            Gson gson = new Gson();
            String json = gson.toJson(cadListScript);
            
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
    public ResponseEntity<String> lista(@PathVariable String codLista) {
        
        StringBuilder sbSql = new StringBuilder();
        
        sbSql.append("SELECT ");      
        sbSql.append("  ID   ");        
        sbSql.append("FROM ");
        sbSql.append("  CADLISTASCRIPT ");        
        sbSql.append("WHERE ");
        sbSql.append("  IDLISTA = ").append(codLista);        
        
        Connection connection = null;
        List<CadListaScript> cadListScript = new ArrayList<>();
        try {
            
            connection = DataBaseUtil.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sbSql.toString());
            ResultSet rs = stmt.executeQuery();            
            while ( rs.next() ){ 
                cadListScript.add(new CadListaScript());
                cadListScript.get(cadListScript.size()-1).setId(rs.getInt("ID"));
            }     
            rs.close();
            stmt.close();
            connection.close();
            Gson gson = new Gson();
            String json = gson.toJson(cadListScript);
            
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
    public ResponseEntity<String> seleciona() {
        
        StringBuilder sbSql = new StringBuilder();
        
        sbSql.append("SELECT ");      
        sbSql.append("  ID,   ");        
        sbSql.append("  DESCRICAO   ");                
        sbSql.append("FROM ");
        sbSql.append("  CADLISTACOLETA");        
        
        Connection connection = null;
        List<CadLista> cadList = new ArrayList<>();
        try {
            
            connection = DataBaseUtil.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sbSql.toString());
            ResultSet rs = stmt.executeQuery();            
            while ( rs.next() ){ 
                cadList.add(new CadLista());
                cadList.get(cadList.size()-1).setId(rs.getInt("ID"));
                cadList.get(cadList.size()-1).setDescricao(rs.getString("DESCRICAO"));
            }     
            rs.close();
            stmt.close();
            connection.close();
            Gson gson = new Gson();
            String json = gson.toJson(cadList);
            
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
}
