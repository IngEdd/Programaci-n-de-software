
/*
1. Se desea desarrollar un programa que calcule el índice de masa corporal de una persona.
Para ello, se requiere definir el peso de la persona (en kilogramos) y su estatura (en metros).
El índice de masa corporal (IMC) se calcula utilizando la siguiente fórmula:

                                IMC = Peso/Estatura^2
 */

import java.util.Scanner;

public class Punto_01 {

    public static void main(String[] args) {
        System.out.println("Calculadora de IMC");
        System.out.println("Ingrese su peso:");
        Scanner sc = new Scanner(System.in);
        double peso = sc.nextInt();
        System.out.println("ingrese su estatura en Metros");
        double estatura = sc.nextInt();

        double est = (estatura/100)*(estatura/100);
        double IMC = peso / (est);
        System.out.println("Su peso es : "+ peso);
        System.out.println("Su estatura es : "+ estatura + est);
        System.out.println("Su IMC es : "+ IMC);
        sc.close();
    }

}