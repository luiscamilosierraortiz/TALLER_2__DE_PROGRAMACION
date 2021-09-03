
package taller_2_punto_5;

import java.util.Scanner;


public class TALLER_2_PUNTO_5 {

   
    public static void main(String[] args) {
    System.out.println(" CONVERTIR CARACTER A UN VALOR NUMÉRICO ");
        Scanner leer = new Scanner(System.in);
        System.out.println(" FAVOR DIJITE UN CARACTER: ");
        char ct=leer.next().charAt(0);
        int vn=(int)ct;
        System.out.println(" EL VALOR NUMÉRICO FINAL ES:"+vn);
        System.out.println(" GRACIAS POR UTILIZAR MI PROGRAMA ");

    }
    
}
