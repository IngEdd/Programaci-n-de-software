/*
 * Punto 5:Para tributar un determinado impuesto se debe ser mayor de 16 años y tener unos ingresos
iguales o superiores a 1000 € mensuales. Escribir un programa que pregunte al usuario su
edad y sus ingresos mensuales y muestre por pantalla si el usuario tiene que tributar o no.
 */

    import java.util.Scanner;

    public class TallerPOO_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese sus ingresos mensuales (en euros): ");
        double ingresos = scanner.nextDouble();
        
        if (edad > 16 && ingresos >= 1000) {
            System.out.println("Usted debe tributar.");
        } else {
            System.out.println("Usted no debe tributar.");
        }
        
        scanner.close();
    }
}


