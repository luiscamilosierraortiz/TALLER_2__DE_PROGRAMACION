
package taller_2_punto_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TALLER_2_PUNTO_7 {

  
    public static void main(String[] args) throws IOException {
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" CALCULAR EL % DE UTILIDAD DE UN PRODUCTO ");
        float pc,pv,pru;
        System.out.println("  DIGITE EL PRECIO DE COMPRA DEL PODUCTO:  ");
        pc=Float.parseFloat(leer.readLine());
        System.out.println(" DIGITE EL PRECIO DE VENTA DEL PODUCTO:  ");
        pv=Float.parseFloat(leer.readLine());
        
        pru=(pv-pc)/pv;
        
        System.out.println("EL PORCENTAJE % DE UTILIDAD ES: "+String.format("%.0f",pru*100)+"%");
        System.out.println(" GRACIAS POR UTILIZAR MI PROGRAMA ");

    }
    
}
