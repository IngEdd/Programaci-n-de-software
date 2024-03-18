
/*
 * Punto 2: Escribir un programa que almacene la cadena de caracteres contraseña en una variable,
pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida por
el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y
minúsculas.
 */
import java.util.Scanner;

public class TallerPOO_02 {

    public static void main(String[] args) {
        String cont = "contraseña";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la contraseña:");
        String PASS = sc.nextLine(); 

        if (cont.equalsIgnoreCase(PASS)) {
            System.out.println("La contraseña coincide.");
        } else {
            System.out.println("La contraseña no coincide.");
        }
        sc.close();
    }
}


