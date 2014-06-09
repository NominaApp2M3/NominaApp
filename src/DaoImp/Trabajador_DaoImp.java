/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import ConeccionAleatoria.RandomConnection;
import DAO.Dao_Trabajador;
import POJO.Trabajador;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karla
 */

public class Trabajador_DaoImp implements Dao_Trabajador{

    private RandomAccessFile raf;
    private Trabajador tr;
    private List <Trabajador>trs;
    private static final int size=112;

    public Trabajador_DaoImp() {
        raf=RandomConnection.GetCurrentConnection();
    }
    
    
    
    @Override
    public Trabajador BuscarPorID(int ID) throws IOException {
               // Manda ID
       long pos = ((ID - 1) * size) + 4; 
       raf.seek(pos);//busca la posicion en donde se encuentra el ID
       
      tr = new Trabajador();// se inicializa curso como el objeto ProductoPJ
               
               tr.setId(raf.readInt());// Obtiene el ID
               tr.setNombres(raf.readUTF());
               tr.setApellidos(raf.readUTF());
               tr.setCedula(raf.readUTF());

       
        return tr;//Retorna el objeto
       
      
    }

    @Override
    public Trabajador BuscarPorNombre(String Nombre) throws IOException {
        
             List<Trabajador> tra=EncontrarTodos();
             
             Trabajador j= new Trabajador();
             
             for (Trabajador d:tra) {
                 
                 if (d.getNombres().equalsIgnoreCase(Nombre)) {
                     
                      j.setId(d.getId());// j toma el objeto contenido
                      j.setNombres(d.getNombres());
                      j.setApellidos(d.getApellidos());
                      j.setCedula(d.getCedula());
//                      j.setHrs_trabajadas(d.getHrs_trabajadas());
//                      j.setHrs_Extras(d.getHrs_Extras());
//                      j.setSalario_Bruto(d.getSalario_Bruto());
                      
                      break;// evita que retorne el objeto con el mismo nombre, que puede ser mas de uno
                 }
                 
               
            
        }
          return  j;
    }

    @Override
    public void Guardar(Trabajador object) throws IOException {
        if (raf==null) {
            
        }
        
        raf.seek(0);//Si hay se ubica al inicio de la posicion
        int n = raf.readInt();//n= ultimo registro
        long pos = (size * n) + 4;
        raf.seek(pos);//se posiciona al final del registro
        if(object == null){}
      
        //si se igreso datos, entonces escribe los datos que se utilizo
        raf.writeInt(object.getId());
        raf.writeUTF(fillString(object.getNombres(), 20));
        raf.writeUTF(fillString(object.getApellidos(), 20));
        raf.writeUTF(fillString(object.getCedula(),14));
//        raf.writeDouble(object.getHrs_trabajadas());
//        raf.writeDouble(object.getHrs_Extras());
//        raf.writeDouble(object.getSalario_Bruto());
 
     
        //object es el objeto Trabajador
                  
        raf.seek(0);
        raf.writeInt(++n);
    }

    @Override
    public void Actualizar(Trabajador Object) throws IOException {
               long pos = ((Object.getId() - 1) * size) + 4; 
       
       raf.seek(pos);
       raf.writeInt(Object.getId());
       raf.writeUTF(fillString(Object.getNombres(), 20));
       raf.writeUTF(fillString(Object.getApellidos(),20));
       raf.writeUTF(fillString(Object.getCedula(), 14));

    }

    @Override
    public void Borrar(int id) throws IOException {
        Actualizar(new Trabajador(id, "", "",""));
    }

    @Override
    public List<Trabajador> EncontrarTodos() throws IOException {
       
         trs = new ArrayList<Trabajador>();// se inicializa una lista Cursos de tipo ProductoPJ
        for(int i = 1; i <= Raf(); i++)//Raf es el numero de registros que se encuentran el archivo
        {
            //"i" es la exploracion de los archivos
            
            tr=this.BuscarPorID(i);// implementa el metodo de buscar por ID
            
            if (tr.getNombres() == null ) {
                //al final si encuentra algo, retorna toda la lista encontrada
          }
            
            else{
            trs.add(tr);
            }
            
        }
        
        return trs;//retorna la cantidad de listas en el archivo
    }
    
        
    public int Raf() throws IOException {
    
    raf.seek(0);
    
    int C= raf.readInt();  
    
    return C;
}
        private String fillString(String text, int size) {
        StringBuffer buffer;
        
        if (text==null) {
            buffer=new StringBuffer(size);
        }else{
            buffer= new StringBuffer(text);
            buffer.setLength(size);
        }
        
        return buffer.toString();
    }
    
    
}
