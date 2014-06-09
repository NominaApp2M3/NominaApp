/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ConeccionAleatoria;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 *
 * @author Jeremy
 */
public class RandomConnection {
    
    //inicializacion de los datos del archivo
    
    private File file;
    private static RandomAccessFile raf;
    private String filename;

    
    // Se crea la conexion del archivo 
    public RandomConnection(String filename) {
        this.filename = filename;
    }
    
    
    
    // Se crea el nombre del archivo
    //especificando el modo que se requiere
    public void Conectar() throws FileNotFoundException, IOException
    {
        file = new File(filename);
        if(file.exists())
        {
            raf = new RandomAccessFile(file, "rw");
        }
        else
        {
            raf = new RandomAccessFile(file, "rw");
            raf.seek(0);  //====>>> Se inicializa el punto de origen de guardado del archivo ( su posición )
            raf.writeInt(0);//=====>> Se especifica desde donde se iniciara a guardar 
        }
    }
    
    
    //***Retorna la conexión
    public static RandomAccessFile GetCurrentConnection()
    {
        return raf;
    }
    
}
