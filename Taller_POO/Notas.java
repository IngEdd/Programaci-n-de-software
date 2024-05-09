
import java.util.Scanner;

public class Notas{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese primera nota ");
        int nota1 = sc.nextInt();
        nota1 = nota1*30/100;
        System.out.println("ingrese primera nota ");
        int nota2 = sc.nextInt();
        nota2 = nota2*30/100;
        System.out.println("ingrese primera nota ");
        int nota3 = sc.nextInt();
        nota3 = nota3*40/100;

        int resultado =nota1 + nota2+nota3;
        System.out.println("nota "+ resultado);
        sc.close(); //cerrar el scanner
    }

    
}
