/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import ConeccionAleatoria.RandomConnection;
import DAO.DAO_Usuario;
import POJO.Usuario;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeremy Perez
 */
public class Usuario_DaoImp implements DAO_Usuario{

     private RandomAccessFile raf;
 private  Usuario us;
 private List<Usuario> u;
 private static final int Size = 44; //tamaño del archivo
   
  public Usuario_DaoImp() {
        raf = RandomConnection.GetCurrentConnection();
    }
 
 @Override
    public Usuario BuscarPorID(int ID) throws IOException {
               // Manda ID
       long pos = ((ID - 1) * Size) + 4; 
       raf.seek(pos);//busca la posicion en donde se encuentra el ID
       
      us = new Usuario();// se inicializa curso como el objeto ProductoPJ
               
               us.setId(raf.readInt());// Obtiene el ID
               us.setNombre(raf.readUTF());
               us.setPass(raf.readUTF());
             

       
        return us;//Retorna el objeto
    }

    @Override
    public Usuario BuscarPorNombre(String Nombre) throws IOException {
          List<Usuario> s= EncontrarTodos();
    
  Usuario  a = new Usuario ();
    
    for (Usuario e : s) {
        
         if ( e.getNombre().equals(Nombre) ) {
                
                a.setId(e.getId());//a  toma el objeto contenido
                a.setNombre(e.getNombre());
                a.setPass(e.getPass());
               
                
                break;// evita que retorne el objeto con el mismo nombre, que puede ser mas de uno
            }
         
        }
    
        return a;
    }

    @Override
    public void Guardar(Usuario object) throws IOException {
            if(raf == null)// si la conexion es nula termina
        {
        }
        
        raf.seek(0);//Si hay se ubica al inicio de la posicion
        int n = raf.readInt();//n= ultimo registro
        long pos = (Size * n) + 4;
        raf.seek(pos);//se posiciona al final del registro
        if(object == null){}
      
        //si se igreso datos, entonces escribe los datos que se utilizo
        raf.writeInt(object.getId());
        raf.writeUTF(fillString(object.getNombre(), 10));
        raf.writeUTF(fillString(object.getPass(), 10));
     
        //object es el objeto Usuario
                  
        raf.seek(0);
        raf.writeInt(++n);
    }

    @Override
    public void Actualizar(Usuario Object) throws IOException {
       long pos = ((Object.getId() - 1) * Size) + 4; 
       
       raf.seek(pos);
       raf.writeInt(Object.getId());
       raf.writeUTF(fillString(Object.getNombre(), 10));
       raf.writeUTF(fillString(Object.getPass(), 10));
    }
    
    

    @Override
    public List<Usuario> EncontrarTodos() throws IOException {
         u = new ArrayList<Usuario>();// se inicializa una lista Cursos de tipo ProductoPJ
        for(int i = 1; i <= Raf(); i++)//Raf es el numero de registros que se encuentran el archivo
        {
            //"i" es la exploracion de los archivos
            
            us=this.BuscarPorID(i);// implementa el metodo de buscar por ID
            
            if (us.getNombre() == null ) {
                //al final si encuentra algo, retorna toda la lista encontrada
          }
            
            else{
            u.add(us);
            }
            
        }
        
        return u;//retorna la cantidad de listas en el archivo
    }
    
         public int Raf() throws IOException {
    
    raf.seek(0);
    
    int B= raf.readInt();  
    
    return B;
}

    @Override
    public void Borrar(int id) throws IOException {
        Actualizar(new Usuario("", "", id));
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

    @Override
    public Usuario BuscarPorPass(String Pass) throws IOException {
                  List<Usuario> s= EncontrarTodos();
    
  Usuario  a = new Usuario ();
    
    for (Usuario e : s) {
        
         if ( e.getPass().equals(Pass) ) {
                
                a.setId(e.getId());//a  toma el objeto contenido
                a.setNombre(e.getNombre());
                a.setPass(e.getPass());
               
                
                break;// evita que retorne el objeto con el mismo nombre, que puede ser mas de uno
            }
         
        }
    
        return a;
    }
}
