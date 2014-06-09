/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Usuario;
import java.io.IOException;

/**
 *
 * @author Jeremy Perez
 */
public interface DAO_Usuario  extends Dao<Usuario>{
    
    public Usuario BuscarPorID(int ID) throws IOException;
    public Usuario BuscarPorNombre(String Nombre) throws IOException;
    public Usuario BuscarPorPass(String Pass)throws IOException;
}
