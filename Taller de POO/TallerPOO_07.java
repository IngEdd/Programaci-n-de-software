/*
 * Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
introducir). El programa debe informar de cuántos números introducidos son mayores que 0,
menores que 0 e iguales a 0
 */

    import java.util.Scanner;

    public class TallerPOO_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números: ");
        int n = s.nextInt();
        
        int mc = 0; // mayores que cero
        int mnc = 0; // menores que cero
        int ic = 0; // iguales a cero
        
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = s.nextInt();
            
            if (num > 0) {
                mc++;
            } else if (num < 0) {
                mnc++;
            } else {
                ic++;
            }
        }
        
        System.out.println("Mayores que cero: " + mc);
        System.out.println("Menores que cero: " + mnc);
        System.out.println("Iguales a cero: " + ic);
        
        s.close();
    }
}

