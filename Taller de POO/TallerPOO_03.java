/*
 * Punto 3: Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
 */

import java.util.Scanner;


public class TallerPOO_03 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entre 0 y 9,999:");
        int numero = sc.nextInt();

        if (numero >= 0 && numero <= 9999) {

            int cifras = 1;
            if (numero >= 10) {
                cifras = 2;
            }
            if (numero >= 100) {
                cifras = 3;
            }
            if (numero >= 1000) {
                cifras = 4;
            }
            System.out.println("El número " + numero + " tiene " + cifras + " cifra(s).");
        } else {
            System.out.println("El número ingresado está fuera del rango especificado.");
        }
        sc.close();
    }
}

