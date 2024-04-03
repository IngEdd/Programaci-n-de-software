package Ejercicios;
/*

1. Desarrolle un algoritmo que le permita leer dos valores y escribir la suma de los dos. 

*/
import java.util.Scanner;

public class PPunto1 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("digite primer numero");
    int num1 = sc.nextInt();
    System.out.println("ingrese segundo numero: ");
    int num2 =sc.nextInt();
    int res = num1 + num2 ;
    System.out.println("La suma de "+ num1 + " y " + num2 +" es: "+ res );
    sc.close();
    }
        

}
