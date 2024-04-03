
/*
 * Pedir 15 números y escribir la suma total.
 */

    import java.util.Scanner;

    public class TallerPOO_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;

        System.out.println("Ingrese 15 números:");

        for (int i = 0; i < 15; i++) {
            int numero = scanner.nextInt();
            total += numero;
        }

        System.out.println("La suma total es: " + total);
        
        scanner.close();
    }
}

