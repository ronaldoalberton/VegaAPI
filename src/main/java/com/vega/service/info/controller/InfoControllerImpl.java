/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.info.controller;
import com.vega.service.configuration.DataBaseUtil;
import com.vega.service.info.domain.Info;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoControllerImpl implements InfoController{
    
    @Override    
    public Info getSingleInfo() {         
        Info info = null;
        Connection connection = null;
        try {            
            connection = DataBaseUtil.getConnection();
            PreparedStatement stmt = connection.prepareStatement("SELECT INF FROM INFO");
            ResultSet rs = stmt.executeQuery();
            while ( rs.next() ){
                info = new Info(DateTime.now(), rs.getString(1));                             
            }  
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            try {
                if ( connection != null ){
                    connection.rollback();
                    connection.close();
                }
            } catch (SQLException ex1) {
                Logger.getLogger(InfoControllerImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }            
            info = new Info(DateTime.now(),ex.getMessage());
            Logger.getLogger(InfoControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return info;
    } 

    @Override
    public List<Info> getListInfo() {
        return Arrays.asList(new Info(DateTime.now(),Info.class.getName()),new Info(DateTime.now(),Info.class.getName()));        
    }   

    @Override
    public String getTest() {
       return null; 
    }
    
    
}
