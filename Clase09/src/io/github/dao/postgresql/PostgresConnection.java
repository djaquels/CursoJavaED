/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.dao.postgresql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/**
 *
 * @author daniel
 */
public class PostgresConnection {
    Connection conectar(){
      Connection conexion = null;
      String url = "jdbc:postgresql://localhost/proyectojava";
      Properties propiedades = new Properties();
      propiedades.setProperty("user","postgres");
      propiedades.setProperty("password","localtest");
      try{
          conexion = DriverManager.getConnection(url,propiedades); 
          
      } catch(SQLException sql){
          System.out.println(sql.getMessage());
          
      }
      return conexion;
    }
    
}
