package Ejercicios;
import java.util.Scanner;

public class MayordeEdad{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su edad: ");
        int edad = sc.nextInt();
        if (edad >18){
            System.out.println("Usted es mayor de edad, ¡vaya trabaje!");
        }
        else{
            System.out.println("Usted es menor de edad, ¡vaya duerma!");
    }
    sc.close(); //cerrar el scanner
    
}
}