
package taller_2_punto_1;

import java.util.Scanner;


public class TALLER_2_PUNTO_1 {

    
    public static void main(String[] args) {
    Scanner entrada=new Scanner (System.in);
  System.out.print(" DIGITE UN NUMERO : ");
     int num1 = entrada.nextInt();
        System.out.print(" DIGITE OTRO  NUMERO : ");
     int num2 = entrada.nextInt();
      
        System.out.printf("x=%d\n", num1);
        System.out.printf("El valor de %d + %d es %d\n", num1, num1, ( num1 + num1 ) );
        
         System.out.printf("x=%.2f\n", x(num1,num2));
         System.out.printf("%d - %d\n", ( num1 + num2 ), ( num2 + num1 ) );
         
    }
        public static double x(int a, int b){
           
        return (double) a / 1 ;
        
    }

    }
    

