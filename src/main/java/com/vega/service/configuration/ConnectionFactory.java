package com.vega.service.configuration;

import com.vega.service.util.VegaException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {
	
    private static ConnectionFactory connectionFactory = null;  
    private static Connection connection = null; 

    private ConnectionFactory(){    
    	
    }    

    public static ConnectionFactory getInstance(){ 
    	if(connectionFactory == null) {
    		connectionFactory = new ConnectionFactory();
    	}
    	return connectionFactory;
    }  
                      
    public Connection getConnection() throws VegaException{
    	if( connection == null){
    		InitialContext contexto = null;
    		DataSource ds = null;
			try {
				contexto = new InitialContext();
				ds = (DataSource) contexto.lookup("java:comp/env/jdbc/vega_db");
				connection = ds.getConnection();
			} catch (NamingException | SQLException e) {
				throw new VegaException(e.getMessage());
			} 
    	}    
        return connection;  
    }  
      
    public void closeConnection() throws VegaException{
    	if(connection != null){  
    		try {
				connection.close();
			} catch (SQLException e) {
				throw new VegaException(e.getMessage());
			}      
        }  
  
    }              
    public void finalize() throws VegaException{
    	closeConnection();  
	}

} 