/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Karla
 */
public class Usuario {
    
     private int id;
    private String nombre;
    private String pass;
   

    public Usuario() {
    }

    public Usuario(String nombre, String pass, int id) {
        this.nombre = nombre;
        this.pass = pass;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
