
package taller_2_punto_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TALLER_2_PUNTO_4 {

    
    public static void main(String[] args) throws IOException {
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" CALCULAR LA LONGITUD Y AREA DE UNA CIRCUNFERENCIA ");
        float r,lt,a;
        
        System.out.println(" DIGITE EL RADIO DE LA CIRCUNFERENCIA:  ");
        r=Float.parseFloat(leer.readLine());
        lt=2*r;
        a=r*r;
        System.out.println(" LA LONGITUD ES: "+String.format("%.2f",Math.PI*lt));
        System.out.println(" LA AREA ES: "+String.format("%.2f",Math.PI*a));
        System.out.println(" GRACIAS POR UTILIZAR MI PROGRAMA ");

    }
    
}
