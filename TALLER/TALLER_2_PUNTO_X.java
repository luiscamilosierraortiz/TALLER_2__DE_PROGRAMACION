
package taller_2_punto_x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TALLER_2_PUNTO_X {

  
    public static void main(String[] args) throws IOException {
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("  CONVERTIR UNIDADES DE MASA ");
        float kg,g,lb,tn;
        System.out.println(" DIGITE EL PESO EN KILOGRAMOS:  ");
        kg=Float.parseFloat(leer.readLine());
        g=kg*1000;
        lb=(float) (kg*(2.20462));
        tn=kg/1000;
        System.out.println(" SU COVERSION A GRAMOS ES: "+g);
        System.out.println(" SU COVERSION FINAL A LIBRAS ES: "+lb);
        System.out.println(" SU COVERSION FINAL A TONELADAS ES: "+tn);

    }
    
}
