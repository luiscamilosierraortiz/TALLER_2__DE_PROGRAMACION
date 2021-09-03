
package taller_2_punto_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TALLER_2_PUNTO_6 {

    
    public static void main(String[] args) throws IOException {
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" CALCULAR LA MASA CORPORAL BMI ");
        float kg,al,mc;
        System.out.println(" DIGITE SU PESO EN KILOGRAMOS:  ");
        kg=Float.parseFloat(leer.readLine());
        System.out.println(" DIGITE SU ALTURA EN METROS:  ");
        al=Float.parseFloat(leer.readLine());
        
        mc=kg/(al*al);
        System.out.println(" LA MASA CORPORAL ES: "+String.format("%.2f",mc));
        System.out.println(" GRACIAS POR UTILIZAR MI PROGRAMA ");

    }
    
}
