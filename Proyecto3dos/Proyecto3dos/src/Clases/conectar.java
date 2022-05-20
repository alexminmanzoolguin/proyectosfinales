/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alex_
 */
public class conectar {
    private static Connection conn;
  private static final String driver="com.mysql.jdbc.Driver",
          user="root", 
          password="",
          url="jdbc:mysql://localhost:3306/Agenda1";
     
    public conectar(){
        conn=null;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, password);
          
                System.out.println("Conexion establecida..");
            
        }catch(ClassNotFoundException | SQLException e ){
            System.out.println("Error al conectar.."+""+e.getMessage());
            
        }
    }
  public Connection getConnection(){
      return conn;
  }  
  public void desconectar(){
      conn=null;
      if(conn==null){
          System.out.println("Conexion terminada..");
      }
  }
 public PreparedStatement ps;
    public ResultSet rs; 
}


