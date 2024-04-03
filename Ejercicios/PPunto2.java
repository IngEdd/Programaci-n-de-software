package Ejercicios;
   /*
   2.
Desarrolle un algoritmo que le permita leer un valor entero, calcular su cuadrado y escribir
dicho resultado.
   
   */ 
import java.util.Scanner;

public class PPunto2 {
public static void main(String[] args) {

    System.out.println("Calculadora de cuadrado, digite un numero para digitar su cuadrado: ");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
int res =num1 * num1;
System.out.println("el cuadrado de "+ num1 + " es " + res);

sc.close();

}

}
