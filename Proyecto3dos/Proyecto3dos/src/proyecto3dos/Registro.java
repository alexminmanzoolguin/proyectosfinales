/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3dos;

/**
 *
 * @author alex_
 */
public class Registro {
private int id_dato;
private String nombre_completo;
private int telefono;
private String RFC;
  public Registro(int id_dato, String nombre_completo, int telefono, String RFC) {
        this.id_dato = id_dato;
        this.nombre_completo = nombre_completo;
        this.telefono = telefono;
        this.RFC = RFC;
    }


    public int getId_dato() {
        return id_dato;
    }

    public void setId_dato(int id_dato) {
        this.id_dato = id_dato;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    @Override
    public String toString() {
        return "Registro{" + "id_dato=" + id_dato + ", nombre_completo=" + nombre_completo + ", telefono=" + telefono + ", RFC=" + RFC + '}';
    }

   



}
