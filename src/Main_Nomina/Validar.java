/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Nomina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Karla
 */
public class Validar {
    
     public static String esfecha() {
        String fechax;
        
        Scanner lee = new Scanner(System.in);
        boolean a;
        do {
            fechax = lee.next();
            a = false;
            try {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = formatoFecha.parse(fechax);

            } catch (Exception e) {
                System.out.println("fecha erronea ingrese de nuevo");
                System.out.println();
                a = true;
            }

        } while (a);
        return fechax;
    }

    public static String cadena() throws IOException {
        
        BufferedReader en= new BufferedReader(new InputStreamReader(System.in));
  
        String a;
        boolean rep;
        do {
            rep = false;

            a = en.readLine();
            Pattern pat = Pattern.compile("[0123456789]");
            Matcher mat = pat.matcher(a);
            if (mat.find()) {
                System.err.println("SOLO ACEPTA LETRAS INTENTE DE NUEVO");
                rep = true;
            }
        } while (rep);
        return a;
    }

    public static int enteros() throws IOException {
        boolean rep;
        String a;
        int x;
         BufferedReader en= new BufferedReader(new InputStreamReader(System.in));
     
        do {
            rep = false;
            a = en.readLine();
            for (int i = 0; i < a.length(); i++) {
                if (Character.isDigit(a.charAt(i))) {
                } else {
                    System.err.println("SOLO ACEPTA ENTEROS INTENTE DE NUEVO");
                    rep = true;
                    break;
                }
            }
        } while (rep);
        return (x = Integer.parseInt(a));
    }

    public static String cedula() throws IOException {
         BufferedReader en= new BufferedReader(new InputStreamReader(System.in));
       
        String cedula;
        boolean opc = true;
        do {
            cedula = en.readLine();
            Pattern pat = Pattern.compile("\\d{3}-\\d{6}-\\d{4}[a-zA-Z]");
            Matcher mat = pat.matcher(cedula);

            if (mat.find()) {
                opc = false;
            } else {
                System.err.println("No. Incorrecto");
                System.out.print("  No_Cédula: ");
            }
        } while (opc);
        return cedula;
    }
     public static boolean LeerDouble(String a) {
        try {
            Double.parseDouble(a);
            return false;
        } catch (NumberFormatException e) {
            System.err.println("Error");
            return true;
        }
    }
     public static int cantidad() throws IOException {
        int x;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.print("Saldo de targeta maximo $20,000 : ");
            x = enteros();
        } while (x <= 0 || x >= 20000);
        return x;
        }
     
     
     public static String texto () throws IOException{
         BufferedReader buffer = new BufferedReader( new InputStreamReader(System.in));
         String a;
        boolean rep;
        do {
            rep = false;

            a = buffer.readLine();
            Pattern pat = Pattern.compile("[0123456789]");
            Matcher mat = pat.matcher(a);
            if (mat.find()) {
                System.err.println("SOLO ACEPTA LETRAS INTENTE DE NUEVO");
                rep = true;
            }
        } while (rep);
        return a;
     }
}
