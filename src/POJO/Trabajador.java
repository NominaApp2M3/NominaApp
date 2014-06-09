/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author JEREMY PEREZ
 */
public class Trabajador {
    
   private int id;
   private String Nombres;
   private String Apellidos;
   private String Cedula;
   
   

    public Trabajador() {
    }

    public Trabajador(int id, String Nombres, String Apellidos,String Cedula) {
        this.id = id;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Cedula=Cedula;

    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }


    
    
    
    
}
