/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Salario;
import java.io.IOException;

/**
 *
 * @author JEREMY PEREZ
 */
public interface DAO_Salario extends Dao<Salario>{
    
    public Salario BuscarPorID(int ID) throws IOException;
    public Salario BuscarPorNombres (String Nombres)throws IOException;
}
