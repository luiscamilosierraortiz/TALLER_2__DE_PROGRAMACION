
package taller_2_punto_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TALLER_2_PUNTO_3 {

    
    public static void main(String[] args) throws IOException {
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" CALCULAR ");
        float num1,num2,num3,sm,mt,dv,prm;
        System.out.println(" INGRESE UN NUMERO DECIMAL:  ");
        num1=Float.parseFloat(leer.readLine());
        System.out.println(" INGRESE OTRO NUMERO DECIMAL:  ");
        num2=Float.parseFloat(leer.readLine());
        System.out.println(" INGRESE OTRO NUMERO DECIMAL:  ");
        num3=Float.parseFloat(leer.readLine()); 
        sm=num1+num2+num3;
        mt=num1*num2*num3;
        dv=num1/num2/num3;
        prm=(num1+num2+num3)/3;
        System.out.println(" LA SUMA FINAL ES: "+String.format("%.1f",sm));
        System.out.println(" EL PROMEDIO FINAL  ES: "+String.format("%.1f",prm));
        System.out.println(" EL PRODUCTO FINAL ES: "+String.format("%.1f",mt));
        System.out.println(" EL COCIENTE FINAL ES: "+String.format("%.1f",dv));

    }
    
}
