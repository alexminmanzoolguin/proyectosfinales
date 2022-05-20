/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alex_
 */
public class cls_agenda {
    private final String SQL_INSERT="INSERT INTO Datos(nombre_completo,telefono,RFC)values(?,?,?)";
    private final String SQL_SELECT="SELECT * FROM Datos";
    private final String SQL_DELETE="DELETE FROM Datos WHERE id_dato= ?";
    
    private PreparedStatement ps;
    private DefaultTableModel dt;
    private ResultSet rs;
    private conectar cn;
    public cls_agenda(){
        ps=null;
        cn= new conectar();
    }
    private DefaultTableModel setTitulos(){
        dt=new DefaultTableModel();
        dt.addColumn("id_dato");
        dt.addColumn("nombre_completo");
        dt.addColumn("telefono");
        dt.addColumn("RFC");
        return dt;
    }
    public int insertDatos(String nombre_completo,int telefono,String RFC){
        try {
            ps=cn.getConnection().prepareStatement(SQL_INSERT);
            ps.setString(1,nombre_completo);
            ps.setInt(2, telefono);
            ps.setString(3, RFC);
           int res= ps.executeUpdate();
           if(res > 0){
               JOptionPane.showMessageDialog(null,"Registro guardado..");
           }
            
        } catch (Exception e) {
            System.out.println("error al guardar los datos" + e.getMessage()); 
        }finally{
            ps=null;
            cn.desconectar();
        }
        return 0;
    }
    public DefaultTableModel getDatos(){
        try {
            setTitulos();
            ps=cn.getConnection().prepareStatement(SQL_SELECT);
            rs=ps.executeQuery();
            Object[] fila=new Object[4];
            while(rs.next()){
               fila[0]=rs.getInt(1);
               fila[1]=rs.getString(2);
               fila[2]=rs.getInt(3);
               fila[3]=rs.getString(4);
               dt.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("error al mostrar datos"+e.getMessage());
        
        }
        finally{
            ps=null;
            rs=null;
            cn.desconectar();
        }
        return dt;
    }
     public DefaultTableModel getDato(int crt,String prm ){
         String SQL;
         if(crt==0){
             SQL="SELECT * FROM Datos WHERE id_dato" + prm;
             
         }else{
              SQL="SELECT * FROM Datos WHERE nombre_completo=like '"+prm +"%" ;
         }
        
         try {
            setTitulos();
            ps=cn.getConnection().prepareStatement(SQL);
            rs=ps.executeQuery();
            Object[] fila=new Object[4];
            while(rs.next()){
               fila[0]=rs.getInt(1);
               fila[1]=rs.getString(2);
               fila[2]=rs.getInt(3);
               fila[3]=rs.getString(4);
               dt.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("error al mostrar datos"+e.getMessage());
        
        }
        finally{
            ps=null;
            rs=null;
            cn.desconectar();
        }
        return dt;
    }
  public  int updateDatos(int id_dato,String nombre_completo, int telefono, String RFC){
      String SQL= "UPDATE Datos Set nombre_completo= '"+nombre_completo+"',telefono= '"+telefono+"',RFC= '"+RFC+"' WHERE id_dato="+id_dato; 
      int res=0;
      try {
            ps=cn.getConnection().prepareStatement(SQL);
         ps.setString(1,nombre_completo);
            ps.setInt(2, telefono);
            ps.setString(3, RFC);
           res= ps.executeUpdate();
           if(res > 0){
               JOptionPane.showMessageDialog(null,"Registro Actualizado..");
           }
            
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Error: " + e.getMessage()); 
        }
        return 0;
  }
  public int deleteDatos(int id_dato){
      int res=0;
      String SQL="DELETE FROM Datos WHERE id_dato="+id_dato;
      try {
          ps= cn.getConnection().prepareStatement(SQL);
 res=ps.executeUpdate();
 if(res > 0){
               JOptionPane.showMessageDialog(null,"Registro Eliminado..");
           }
            
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "ERROR"+ e.getMessage());
      }
        return res ;
  }  
    
    
}
