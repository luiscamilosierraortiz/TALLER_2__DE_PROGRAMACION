
package taller_2_punto_xi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TALLER_2_PUNTO_XI {

    public static void main(String[] args) throws IOException {
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" DESCOMPRIMIR UN NUMERO ");
        int un,dc,cn,num;
        System.out.println(" DIGITE UN NUMERO:  ");
        num=Integer.parseInt(leer.readLine());
        if(num<=1000){
        un=num%10;
        num=num/10;
        dc=num%10;
        cn=num/10;
            System.out.println(" LA UNIDAD FINAL ES: "+un);
            System.out.println(" LA DECENA FINAL ES: "+dc*10);
            System.out.println(" LA CENTENA FINAL ES: "+cn*100);
        }
        else{
            System.out.println(" FAVOR DIGITE OTRO NUMERO PORQUE EL NUMERO DIJITADO ESTA FUERA DE RANGO**");
        }

    }
    
}
