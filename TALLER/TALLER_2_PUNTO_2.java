
package taller_2_punto_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TALLER_2_PUNTO_2 {

    
    public static void main(String[] args) throws IOException {
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("  CALCULAR ");
        float num1,num2,sm,mt,rt;
        System.out.println(" INGRESE UN NUMERO:  ");
        num1=Float.parseFloat(leer.readLine());
        System.out.println(" INGRESE OTRO NUMERO:  ");
        num2=Float.parseFloat(leer.readLine());
          
        sm=num1+num2;
        mt=num1*num2;
        rt=num1-num2;
        System.out.println(" LA SUMA FINAL ES: "+sm);
        System.out.println(" EL PRODUCTO FINAL ES: "+mt);
        System.out.println(" LA DIFERENCIA ES: "+rt);
        System.out.println(" GRACIAS POR UTILIZAR MI PROGRAMA ");

    }
    
}
