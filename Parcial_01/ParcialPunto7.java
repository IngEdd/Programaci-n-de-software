package Parcial_01;
//PUNTO 7

import java.util.Scanner;

public class ParcialPunto7 {
    public static void main(String[]args){

        System.out.println("Ingrese primer numero: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        
        System.out.println("Ingrese segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese tercer numero: ");
        int num3 = sc.nextInt();
        
        if (num1 > num2 & num1 > num2){
            System.out.println("El numero " + num1 + " es el Mayor ");
        }else if(num2 > num1 & num2 > num3){
                System.out.println("El numero " + num2 + " es el Mayor ");
        }else if(num3 > num1 & num3 > num1){
                System.out.println("El numero " + num3 + " es el Mayor ");
            }else{
                System.out.println("Los numeros son iguales ");
            }
            sc.close();
        }

    
}
