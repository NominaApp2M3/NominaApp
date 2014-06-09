/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo_Deduc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JEREMY PEREZ
 */
public class Deducciones_Calc {
    public double ir = 0, inss;
//sm=salario mensual , tv= tasa de valuacion , sa=salarion anual, 
    public  double SalarioNeto(double sm) throws IOException {
        
        BufferedReader en = new BufferedReader(new InputStreamReader(System.in));
        double sa, ssinss, sn, tv = 0.0625;
        
        String x;
        inss = sm * tv;
        ssinss = (sm - inss);
        sa = ssinss * 12;
        if (sa<8333.33) {
            ir = 0;
        }
        if (sa >= 100000.01 && sa <= 200000) {
            ir = (((sa - 100000) * (0.15)) / 12);
        }
        if (sa >= 200000.01 && sa <= 300000) {
            ir = (((sa - 200000) * (0.20) + 15000) / 12);
        }
        if (sa >= 350000.01 && sa <= 500000) {
            ir = (((sa - 350000) * (0.25) + 45000) / 12);
        }
        if (sa >= 500000.01) {
            ir = (((sa - 500000) * (0.30) + 82500) / 12);
        }
        sn = sm - inss - ir;
        return sn;
    }

    public  double INSS() {
        
     return inss;
    }

    public  double IR() {
        return ir;
    }

    public  double TotalDeducciones() {
        double tdeducciones;
        tdeducciones = inss + ir;
        return tdeducciones;
    }
}
