import java.util.Scanner;

public class TallerPOO_01v2 {

    public static void main(String[] args) {
        System.out.println("Calculadora de IMC");
        System.out.println("Ingrese su peso:");
        Scanner sc = new Scanner(System.in);
        double peso = sc.nextDouble(); // Cambiado a nextDouble()
        System.out.println("Ingrese su estatura en metros:");
        double estatura = sc.nextDouble(); // Cambiado a nextDouble()

        double est = (estatura / 100) * (estatura / 100);
        double IMC = peso / est;
        System.out.println("Su peso es: " + peso + " kg");
        System.out.println("Su estatura es: " + estatura + " metros");
        System.out.println("Su IMC es: " + IMC);
        sc.close();
    }
}

    
