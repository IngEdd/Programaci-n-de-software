/*
 4. Desarrolle un algoritmo que le permita leer un valor que represente una temperatura
    expresada en grados Celcius y convierta dicho valor en un valor expresado en grados
    Fahrenheit.
 
 */
import java.util.Scanner;

public class PPunto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de grados Fahrenheit.");
        System.out.println("Ingrese un valor: ");
        int num = sc.nextInt();
        int res =(num * 9/5) + 32;
        System.out.println("El resultado en Fahrenheit es: " + res);


    }
}
