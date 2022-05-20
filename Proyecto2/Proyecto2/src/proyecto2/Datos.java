/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author alex_
 */
public class Datos {
    private String nombre_completo;
     private int telefono;
     private String rfc;
     public Datos(String nombre_completo,int telefono,String rfc){
         this.nombre_completo=nombre_completo;
         this.telefono=telefono;
         this.rfc=rfc;
     }
     public String getrfc(){
    return rfc;
}
     public void setrfc(String rfc){
         this.rfc=rfc;
     }
     public int gettelefono(){
    return telefono;
}
     public void settelefono(int telefono){
         this.telefono=telefono;
     }
     
     public String getnombre_completo(){
         return nombre_completo;
     }
     public void setnombre_completo(String nombre_completo){
         this.nombre_completo=nombre_completo;
     }
}
