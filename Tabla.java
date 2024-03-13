


// tabla de multiplicar con la funcion for
import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + " hasta el 10:");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            sc.close();
        }
    }
}

