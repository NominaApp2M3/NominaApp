/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Karla
 */
public class Trabajador {
    
   private int id;
   private String Nombres;
   private String Apellidos;
   private String Cedula;
   private int Hrs_Extras;
   private int Hrs_trabajadas;
   private double sal_mensual;
   private double INNS;
   private double IR;
   private double sal_Bruto;
   

    public Trabajador() {
    }

    public Trabajador(int id, String Nombres, String Apellidos,String Cedula,int Hrs_Extras, int Hrs_trabajadas,double INNS, double IR, double sal_Bruto,double sal_mensual) {
        this.id = id;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Cedula=Cedula;
        this.Hrs_trabajadas=Hrs_trabajadas;
        this.Hrs_Extras=Hrs_Extras;
        this.INNS=INNS;
        this.IR=IR;
        this.sal_Bruto=sal_Bruto;
        this.sal_mensual=sal_mensual;
    }

    public double getSal_mensual() {
        return sal_mensual;
    }

    public void setSal_mensual(double sal_mensual) {
        this.sal_mensual = sal_mensual;
    }

    
    public int getHrs_Extras() {
        return Hrs_Extras;
    }

    public void setHrs_Extras(int Hrs_Extras) {
        this.Hrs_Extras = Hrs_Extras;
    }

    public int getHrs_trabajadas() {
        return Hrs_trabajadas;
    }

    public void setHrs_trabajadas(int Hrs_trabajadas) {
        this.Hrs_trabajadas = Hrs_trabajadas;
    }

    public double getINNS() {
        return INNS;
    }

    public void setINNS(double INNS) {
        this.INNS = INNS;
    }

    public double getIR() {
        return IR;
    }

    public void setIR(double IR) {
        this.IR = IR;
    }

    public double getSal_Bruto() {
        return sal_Bruto;
    }

    public void setSal_Bruto(double sal_Bruto) {
        this.sal_Bruto = sal_Bruto;
    }

    
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }


    
    
    
    
}
