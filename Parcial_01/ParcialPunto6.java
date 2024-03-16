package Parcial_01;
// PUNTO 6

import java.util.Scanner;

public class ParcialPunto6{
public static void main(String[]args){
System.out.println("Ingrese primer numero: ");
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();

System.out.println("Ingrese primer numero: ");
int num2 = sc.nextInt();

if (num1 == num2){
    int res = num1*num2;
    System.out.println("el resultado se a multiplicado: "+ res);
}else if(num1 > num2){
    int res = num1-num2;
    System.out.println("el resultado se a restado: "+ res);
}else{
    int res = num1+num2;
    System.out.println("el resultado se a sumado: "+ res);
}
sc.close();

}

}