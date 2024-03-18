/*Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso
contrario, el programa termina cuando se introduce un espacio. */



    import java.util.Scanner;

    public class TallerPOO_08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            char caracter;
            do {
                System.out.print("Ingrese un caracter (o presione espacio para terminar): ");
                caracter = scanner.nextLine().charAt(0);
                
                if (caracter != ' ') {
                    if (esVocal(caracter)) {
                        System.out.println("VOCAL");
                    } else {
                        System.out.println("NO VOCAL");
                    }
                }
            } while (caracter != ' ');
            
            scanner.close();
        }
        
        // Función para verificar si un caracter es una vocal
        public static boolean esVocal(char c) {
            c = Character.toLowerCase(c);
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
    }
     
