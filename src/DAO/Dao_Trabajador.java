/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Trabajador;
import java.io.IOException;

/**
 *
 * @author Karla
 */
public interface Dao_Trabajador extends Dao<Trabajador> {
    
    public Trabajador BuscarPorID(int ID) throws IOException;
    public Trabajador BuscarPorNombre(String Nombre) throws IOException; 
}
