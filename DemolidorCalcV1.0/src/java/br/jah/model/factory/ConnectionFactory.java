/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.jah.model.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1946810
 */
public class ConnectionFactory {
    
    private String driver = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://localhost/jah", usuario = "postgres", senha = "lanodupi";
    
    public Connection getConnection() throws ClassNotFoundException{
        try{
            Class.forName(driver);
            return DriverManager.getConnection(url, usuario, senha);  
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
