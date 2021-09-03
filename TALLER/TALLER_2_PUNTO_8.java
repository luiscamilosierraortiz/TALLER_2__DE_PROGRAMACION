
package taller_2_punto_8;

import javax.swing.JOptionPane;


public class TALLER_2_PUNTO_8 {

    public static void main(String[] args) {
    int op=0;
    do{
    op=Integer.parseInt(JOptionPane.showInputDialog("""
                                                    MENU *
                                                    1 PRIMERA OPCION
                                                    2 SEGUNDA OPCION
                                                    3 TERCERA OPCION
                                                    4 CUARTA OPCION
                                                    5 SALIR
                                                    FAVOR ELIJA UNA OPCION DEL MENU :"""));
         switch(op)
            {
             case 1 -> JOptionPane.showMessageDialog(null," BIENBENIDO AL TERCER SEMESTRE ");
         }
         switch(op)
         {
         case 2 -> JOptionPane.showMessageDialog(null," BIENBENIDO AL TERCER SEMESTRE ");
         }
          switch(op)
         {
         case 3 -> JOptionPane.showMessageDialog(null,"* BIENBENIDO AL TERCER SEMESTRE ");
         }
           switch(op)
         {
         case 4 -> JOptionPane.showMessageDialog(null," BIENBENIDO AL TERCER SEMESTRE ");
         }
        }while(op!=5);

    }
    
}
