/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Nomina;

import ConeccionAleatoria.RandomConnection;
import DaoImp.Salario_DaoImp;
import DaoImp.Trabajador_DaoImp;
import DaoImp.Usuario_DaoImp;
import POJO.Salario;
import POJO.Trabajador;
import POJO.Usuario;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JEREMY PEREZ
 */



public class Apps_Demo {
   
    public static void Menu1(){
        System.out.println("");
        System.out.println(" 1. Nuevo Usuario ");
        System.out.println(" 2. Configurar Usuario ");
        System.out.println(" 3. Eliminar Usuario ");
        System.out.println(" 4. Mostar Usuarios ");
        System.out.println(" 5. Nuevo Trabajador");
        System.out.println(" 6. Configurar Trabajador ");
        System.out.println(" 7. Eliminar Trabajador ");
        System.out.println(" 8. Mostrar Trabajador");
        System.out.println(" 9. Administrar salario de trabajador");
        System.out.println(" 10. mostrar nomina ");
        System.out.println(" 11. Salir ");
    }
    

   
    
    public static void main( String [] args) throws IOException{
        Validar v= new Validar();
        Scanner s= new Scanner (System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int opc;
        
        System.out.println("=============================");
        System.out.println(" P R U E B A    N O M I N A  ");
        System.out.println("=============================");
        
        do {
            Apps_Demo.Menu1();
            opc=s.nextInt();
            
            switch(opc){
                case 1:
                    System.out.print(" Usuario: ");
                    String nom=br.readLine();
                    System.out.print("");
                    
                    System.out.print(" Contraseña: ");
                    String pass=br.readLine();
                    System.out.print("");
                    
                    try{
                        new RandomConnection(("Usuarios.dat")).Conectar();
                    }catch(FileNotFoundException e){
                        System.out.println(" ARCHIVO NO ENCONTRADO ");
                        return;
                    }catch(IOException e){
                        System.out.println(" ERROR EN CONECCION ");
                        return ;
                    }
                    
                    Usuario_DaoImp ud= new Usuario_DaoImp();
                    Usuario o= new Usuario();
                    
                    
                    o.setId(ud.Raf()+1);
                    o.setNombre(nom);
                    o.setPass(pass);
                    
                    ud.Guardar(o);
                    
                    System.out.println(" USUARIO REGISTRADO ");
                    break;
                    
                case 2:
                    System.out.print("ID de Usuario: ");
                    int m=s.nextInt();
                    System.out.print("");
                    
                    try{
                        new RandomConnection(("Usuarios.dat")).Conectar();
                    }catch(FileNotFoundException ex){
                        System.out.println(" Archivo no encotrado ");
                        return;
                    }catch(IOException e){
                        System.out.println(" Error en coneccion ");
                        return;
                    }
                    
                    Usuario_DaoImp imp= new Usuario_DaoImp();
                    Usuario u2= new Usuario();
                    u2=null;
                    
                    try{
                        u2=imp.BuscarPorID(m);
                    }catch(EOFException ex){
                        System.out.println(" ID no existe ");
                        return ;
                    }
                    
                    Usuario u3= new Usuario();
                    
                    System.out.print(" Nuevo nombre de usuario: ");
                    String Nnom= br.readLine();
                    System.out.print("");
                    
                    System.out.print(" Nueva Contraseña: ");
                    String Npass=br.readLine();
                    System.out.print("");
                    
                    u3.setId(m);
                    u3.setNombre(Nnom);
                    u3.setPass(Npass);
                    
                    imp.Actualizar(u3);
                    
                    System.out.println(" Configurado con exito ");
                            
                    break;
                    
                case 3:
                    
                    try{
                        new RandomConnection(("Usuarios.dat")).Conectar();
                    }catch(FileNotFoundException e){
                        System.out.println(" ARCHIVO NO ENCONTRADO ");
                        return ;
                    }catch(IOException e){
                        System.out.println(" ERROR EN CONECCION ");
                        return;
                    }
                    
                    Usuario_DaoImp imp2= new Usuario_DaoImp();
                    
                    System.out.print("Ingrese Id del Usuario a eliminar: ");
                    int ide= s.nextInt();
                    System.out.print("");
                    
                    Usuario u4= new Usuario ();
                    u4=null;
                    
                    try{
                        imp2.BuscarPorID(ide);
                    }catch(EOFException e){
                        System.out.println(" Id no existe ");
                        return;
                    }
                    
                    imp2.Borrar(ide);
                    
                    System.out.println(" USUARIO ELIMINADO ");
                    break;
                    
                case 4:
                    
                    try{
                        new RandomConnection(("Usuarios.dat")).Conectar();
                    }catch(FileNotFoundException e){
                        System.out.println(" ARCHIVO NO ENCONTRADO ");
                        return ;
                    }catch(IOException e){
                        System.out.println(" ERROR EN CONECCION ");
                        return ;
                    }
                    
                    Usuario_DaoImp imp3= new Usuario_DaoImp();
                    
                    if (imp3.Raf()==0) {
                        System.out.println(" NO HAY REGISTROS ");
                        return;
                    }
                    
                    List<Usuario> Lista;
                    
                    Lista=imp3.EncontrarTodos();
                    
                    for (Usuario r:Lista) {
                        if (!"".equals(r.getNombre()))
                        {
                            System.out.println("\nID: "+r.getId());
                            System.out.println("Nombre de usuario: "+r.getNombre());
                            System.out.println("===============================================");
                        }
                    }
                    break;
                    
                case 5:
                    System.out.print("Nombres: ");
                    String trab=br.readLine();
                    System.out.print("");
                    
                    System.out.print("Apellidos: ");
                    String Ape=br.readLine();
                    System.out.print("");
                    
                    System.out.print("No de Cedula: ");
                    String ced=br.readLine();
                    System.out.print("");
                    
                    try{
                        new RandomConnection(("Trabajadores.dat")).Conectar();
                    }catch(FileNotFoundException e){
                        System.out.println("ARCHIVO NO ENCOTRADO");
                        return;
                    }catch(IOException e) {
                        System.out.println("Error en coneccion");
                        return;
                    }
                    Trabajador_DaoImp imp1= new Trabajador_DaoImp();
                    Trabajador tr1= new Trabajador();
                    
                    int d= imp1.Raf()+1;
                    
                    tr1.setId(d);
                    tr1.setNombres(trab);
                    tr1.setApellidos(Ape);
                    tr1.setCedula(ced);
                    imp1.Guardar(tr1);
                    
                    System.out.println(" TRABAJADOR INGRESADO ");
                
                    break;
                    
                case 6:
                    
                    System.out.print("ID del Trabajador: ");
                    int k=s.nextInt();
                    System.out.print("");
                    
                    try{
                        new RandomConnection(("Trabajadores.dat")).Conectar();
                    }catch(FileNotFoundException e){
                        System.out.println("ARCHIVO NO ENCONTRADO ");
                        return;
                    }catch(IOException e){
                        System.out.println("ERROR AL CONECTAR ");
                        return;
                    }
                    
                    Trabajador_DaoImp impt2= new Trabajador_DaoImp();
                    Trabajador tr2 = new Trabajador();
                    
                    tr2=null;
                    
                    try{
                        tr2=impt2.BuscarPorID(k);
                    }catch(EOFException e){
                        System.out.println(" ID TRABAJADOR NO EXISTE ");
                        return;
                    }
                    
                    Trabajador tr3= new Trabajador();
                    
                    System.out.print("Nuevos nombres: ");
                    String Nntr=br.readLine();
                    System.out.print("");
                    
                    System.out.print("Nuevos Apellidos: ");
                    String Natr=br.readLine();
                    System.out.print("");
                    
                    System.out.print("Nuevo numero de cedula: ");
                    String Nced=br.readLine();
                    System.out.print("");
                    
                    tr3.setId(k);
                    tr3.setNombres(Nntr);
                    tr3.setApellidos(Natr);
                    tr3.setCedula(Nced);
                    impt2.Actualizar(tr3);
                    System.out.println(" MODIFICADO CON EXITO");
                    System.out.println("");
                    break;
                    
                case 7:
                    
                    try{
                        new RandomConnection(("Trabajadores.dat")).Conectar();
                    }catch(FileNotFoundException e){
                        System.out.println("Archivo no encontrado");
                        return;
                    }catch(IOException e){
                        System.out.println(" Error al Conectar ");
                    }
                    
                    Trabajador_DaoImp impt3= new Trabajador_DaoImp();
                    
                    System.out.print("ID del trabajador: ");
                    int I= s.nextInt();
                    System.out.print("");
                    
                    Trabajador tr4= new Trabajador();
                    tr4=null;
                    
                    try{
                        impt3.BuscarPorID(I);
                    }catch(EOFException e){
                        System.out.println(" ID del trabajador no existe ");
                        return;
                    }
                    
                    impt3.Borrar(I);
                    System.out.println(" ELIMINADO CON EXITO ");
                    System.out.println("");
                    break;
                    
                case 8:
                    
                    try{
                        new RandomConnection(("Trabajadores.dat")).Conectar();
                        
                    }catch(FileNotFoundException e){
                        
                        System.out.println(" Archivo no encontrado ");
                        return;
                        
                    }catch(IOException e){
                        
                        System.out.println(" Error al conectar ");
                        return;
                    }
                    
                    Trabajador_DaoImp impt4= new Trabajador_DaoImp();
                    
                    if (impt4.Raf()==0) {
                        System.out.println(" NO HAY REGISTROS");
                        return;
                    }
                    
                    List<Trabajador> lista;
                    lista=impt4.EncontrarTodos();
                            
                    for (Trabajador a: lista) {
                        if (!"".equals(a.getNombres())) {
                            System.out.println("");
                            System.out.println("\nID: "+a.getId());
                            System.out.println("Nombres: "+a.getNombres());
                            System.out.println("Apellidos: "+a.getApellidos());
                            System.out.println("No de Cedula: "+a.getCedula());
                            System.out.println("==========================================");
                        }
                    }
                    break;
                    
                case 9:
                    System.out.print("id del Trabajador: ");//NOMBRE DLE TRABAJADOR A ADMINISTRAR SU SALARIO
                    int y= s.nextInt();
                    System.out.print("");
                    System.out.print("Nombre del trabajador:");
                    String work= br.readLine();
                    
                    
                    try{
                        new RandomConnection(("Trabajadores.dat")).Conectar();//CONECTAR EL ARCHIVO QUE CONTIENE A LOS TRABAJADORES
                    }catch(FileNotFoundException e){
                        System.err.append("Archivo no encontrado");
                    }catch(IOException e){
                        System.out.println(" ERROR AL CONECTAR ");
                        return;
                    }
                     
                    Trabajador_DaoImp tim5= new Trabajador_DaoImp();
                    Trabajador tr5= new Trabajador();
                    tr5=null;
//                    try{
//                        tr5=tim5.BuscarPorNombre(work);
//                    }catch(EOFException e){
//                        System.out.println(" trabajador no existe ");
//                        return;
//                    }
//                    if (tr5.getId()==0) {
//                        System.out.println("TRABAJADOR NO EXISTE");
//                        return;
//                    }
                    try{
                        tim5.BuscarPorID(y);
                    }catch(EOFException e){
                        System.out.println("ID no encontrado");
                    }
                    try {
                        new RandomConnection(("Salarios.dat")).Conectar();//CONECTAR EL ARCHIVO EN DONDE SE GUARDARA LOS CAMBIOS EN EL SALARIO
                    } catch (FileNotFoundException ex) {

                        System.out.println("Archivo No Encontrado");
                        return;
                    } catch (IOException ex) {

                        System.out.println("Error Al Conectar");
                        return;

                    }
                    
                    Salario_DaoImp simp1= new Salario_DaoImp();
                    Salario sa1= new Salario();
                    
                    double pago_hrs=16.6;//cada hora laboral tiene un costo de 16.6 como base de un salario de 4000 cordobas mensual
                    int ID_S=simp1.Raf()+1;
                    
                    System.out.print("Horas laborables: ");
                    int hl= s.nextInt();
                    System.out.print("");
                    
                    System.out.print("Horas extras:");
                    int he= s.nextInt();
                    System.out.print("");
                    
                    double sal=((hl+he)*pago_hrs);
                    double saln=sal-(sal*0.006);
                    
                    sa1.setId(ID_S);
                    sa1.setNombres(work);
                    sa1.setHrs_trabajadas(hl);
                    sa1.setHrs_extras(he);
                    sa1.setSalario_neto(saln);
                    
                    simp1.Guardar(sa1);
                    
                    System.out.println("Guardado!!");
                    System.out.println("");
                    break;
                    
                case 10:

                    
                               try {
                                    new RandomConnection(("Trabajadores.dat")).Conectar();
                                  
                                } catch (FileNotFoundException ex) {

                                    System.out.println("Archivo No Encontrado");
                                    return;
                                } catch (IOException ex) {

                                    System.out.println("Error Al Conectar");
                                    return;

                                }
                               
                                  try {
                                    new RandomConnection(("Salarios.dat")).Conectar();
                                } catch (FileNotFoundException ex) {

                                    System.out.println("Archivo No Encontrado");
                                    return;
                                } catch (IOException ex) {

                                    System.out.println("Error Al Conectar");
                                    return;

                                }
                               
                               Trabajador_DaoImp imp6= new Trabajador_DaoImp();
//                            
                               
                                 
                                  
                               Salario_DaoImp simp6= new Salario_DaoImp();
                               Salario sal6= new Salario();
                               
                               if ((imp6.Raf()==0) ) {
                                   System.out.println("  NO HAY REGISTROS");   
                                   return;
                                     }
                    if ((simp6.Raf()==0)) {
                        System.out.println("HO HAY REGISTRO");
                        return;
                    }
//                               List<Trabajador> t;
//                               t=imp6.EncontrarTodos();
                               
                               List<Trabajador> p;
                               p=imp6.EncontrarTodos();
                                       
                             
                               
//                               
//                               for (Trabajador j: t) {
//                                   
//                                       if((!"".equals(j.getNombres()))){
//                                           
//                                       System.out.println("ID Trabajador: "+j.getId());
//                                       System.out.println("Nombre del trabajador: "+j.getNombres());
//                                       System.out.println("Apellidos del trabajador: "+j.getApellidos());
//                                       System.out.println("No de Cedula: "+j.getCedula());
//                                      
//                                       }
//                                   }
                       List<Trabajador> ta;
                    ta=imp6.EncontrarTodos();
                            
                    for (Trabajador a: ta) {
                        if (!"".equals(a.getNombres())) {
                            System.out.println("");
                            System.out.println("\nID: "+a.getId());
                            System.out.println("Nombres: "+a.getNombres());
                            System.out.println("Apellidos: "+a.getApellidos());
                            System.out.println("No de Cedula: "+a.getCedula());
                            
                        }
                    }
                                 List<Salario>l;
                               l=simp6.EncontrarTodos();
                                       for (Salario i:l) {
                                           if (!"".equals(i.getNombres())) {
                                       System.out.println("Horas laborales: "+i.getHrs_trabajadas());
                                       System.out.println("Horas extras: "+i.getHrs_extras());
                                       System.out.println("Salario neto: "+i.getSalario_neto());
                                       System.out.println("================================================================");
                                           }
                                   }
                                       
                                   System.out.println("");
                    
                    break;
            }
            
           
        } while (opc!=11);
        
    }
}
