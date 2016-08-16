/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author ronaldo.alberton
 */
public class DataBaseUtil {
    
    private static Connection con;
    private static DataSource ds;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        //String url = "jdbc:mysql://node81165-vegaservices.jelasticlw.com.br/vegadb";        
        String url = "jdbc:mysql://179.188.16.53/atitudeambient2";        
        Class.forName ("com.mysql.jdbc.Driver");
        //con = DriverManager.getConnection (url,"vegadb","8cDxrFH7VB3B7GGs");
        con = DriverManager.getConnection (url,"atitudeambient2","aadvmexico2355");
        return con;
    }    
    
}
