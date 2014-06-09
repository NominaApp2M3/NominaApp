/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import ConeccionAleatoria.RandomConnection;
import DAO.DAO_Salario;
import POJO.Salario;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karla
 */
public class Salario_DaoImp implements DAO_Salario{

         private RandomAccessFile raf;
 private  Salario s;
 private List<Salario> sa;
 private static final int Size = 60; //tamaño del archivo

    public Salario_DaoImp() {
        raf=RandomConnection.GetCurrentConnection();
    }
    
 
 
    @Override
    public Salario BuscarPorID(int ID) throws IOException {
                 // Manda ID
       long pos = ((ID - 1) * Size) + 4; 
       raf.seek(pos);//busca la posicion en donde se encuentra el ID
       
      s = new Salario();// se inicializa curso como el objeto ProductoPJ
               
               s.setId(raf.readInt());// Obtiene el ID
               s.setNombres(raf.readUTF());
               s.setHrs_trabajadas(raf.readInt());
               s.setHrs_extras(raf.readInt());
               
               s.setSalario_neto(raf.readDouble());
             

       
        return s;//Retorna el objeto
    }

    @Override
    public void Guardar(Salario object) throws IOException {
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
        raf.writeUTF(fillString(object.getNombres(),20));
        raf.writeInt(object.getHrs_trabajadas());
        raf.writeInt(object.getHrs_extras());
        
        raf.writeDouble(object.getSalario_neto());
     
        //object es el objeto Usuario
                  
        raf.seek(0);
        raf.writeInt(++n);
    }

    @Override
    public void Actualizar(Salario Object) throws IOException {
         long pos = ((Object.getId() - 1) * Size) + 4; 
         
          raf.writeInt(Object.getId());
          raf.writeUTF(fillString(Object.getNombres(),20));
          raf.writeInt(Object.getHrs_trabajadas());
          raf.writeInt(Object.getHrs_extras());
       
        raf.writeDouble(Object.getSalario_neto());
    }

    @Override
    public void Borrar(int id) throws IOException {
      Actualizar(new Salario("", id,0,0, 0));
    }

    @Override
    public List<Salario> EncontrarTodos() throws IOException {
         sa = new ArrayList<Salario>();// se inicializa una lista Cursos de tipo ProductoPJ
        for(int i = 1; i <= Raf(); i++)//Raf es el numero de registros que se encuentran el archivo
        {
            //"i" es la exploracion de los archivos
            
            s=this.BuscarPorID(i);// implementa el metodo de buscar por ID
            
            if (s.getNombres()==null) {
                //al final si encuentra algo, retorna toda la lista encontrada
          }
            
            else{
            sa.add(s);
            }
            
        }
        
        return sa;//retorna la cantidad de listas en el archivo
    }
    
   public int Raf() throws IOException {
    
    raf.seek(0);
    
    int A= raf.readInt();  
    
    return A;
}

    @Override
    public Salario BuscarPorNombres(String Nombres) throws IOException {
       List<Salario> ca= EncontrarTodos();
    
 Salario can = new Salario ();
    
    for (Salario e : ca) {
        
         if ( e.getNombres().equals(Nombres) ) {
                
               can.setId(e.getId());
               can.setNombres(e.getNombres());
               can.setHrs_trabajadas(e.getHrs_trabajadas());
               can.setHrs_extras(e.getHrs_extras());
              
               can.setSalario_neto(e.getSalario_neto());
                
                break;
            }
         
        }
    
        return can;
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
