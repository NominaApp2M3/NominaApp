/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.io.IOException;
import java.util.List;
/**
 *
 * @author Jeremy
 */



public interface Dao<T> {
    
//    En esta interface se crea los cuatro metodos principales del archivo
//    que mas adelante se utilizare en Daoimp que es donde se implementaran dichos metodos
    // T= al objeto que se hace referencia
    public void Guardar(T object) throws IOException;
    public void Actualizar(T Object) throws IOException;
    public void Borrar(int id) throws IOException;
    public List<T> EncontrarTodos() throws IOException;
    
}
