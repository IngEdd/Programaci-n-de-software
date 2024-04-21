/*
 * Dibuja un cuadrado, como en la imagen que acompaña, con ocho * de lado:
 */

public class TallerPOO_09 {
    public static void main(String[] args) {
         dibujarCuadrado();
     }
    
       public static void dibujarCuadrado() {
         int lado = 8;
    
        for (int i = 0; i < lado; i++) {
             for (int j = 0; j < lado; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
   }
}
    
