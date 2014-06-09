/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Karla
 */
public class Salario {
    
    private int id;
    private int hrs_trabajadas;
    private int hrs_extras;
    private double salario_neto;
    private String Nombres;
    
    public Salario(){
    }

    public Salario(String Nombres,int hrs_trabajadas, int hrs_extras,  double salario_neto,int id) {
        this.id=id;
        this.hrs_trabajadas = hrs_trabajadas;
        this.hrs_extras = hrs_extras;

        this.salario_neto = salario_neto;
        this.Nombres=Nombres;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHrs_trabajadas() {
        return hrs_trabajadas;
    }

    public void setHrs_trabajadas(int hrs_trabajadas) {
        this.hrs_trabajadas = hrs_trabajadas;
    }

    public int getHrs_extras() {
        return hrs_extras;
    }

    public void setHrs_extras(int hrs_extras) {
        this.hrs_extras = hrs_extras;
    }

 

    public double getSalario_neto() {
        return salario_neto;
    }

    public void setSalario_neto(double salario_neto) {
        this.salario_neto = salario_neto;
    }
    
    
    
    
            
}
