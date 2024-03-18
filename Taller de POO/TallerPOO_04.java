/*
 * Punto 4: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30
y 31 días. Sin años bisiestos.
 */

import java.util.Scanner;

public class TallerPOO_04 {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Día: ");
            int d = s.nextInt();
            System.out.print("Mes: ");
            int m = s.nextInt();
            System.out.print("Año: ");
            int a = s.nextInt();
            boolean v = verificarFecha(d, m, a);
            System.out.println(v ? "Fecha válida." : "Fecha inválida.");
            s.close();
        }
        
        public static boolean verificarFecha(int d, int m, int a) {
            if (a < 1) return false;
            if (m < 1 || m > 12) return false;
            switch (m) {
                case 2:
                    if (d < 1 || d > 28) return false;
                    break;
                case 4: case 6: case 9: case 11:
                    if (d < 1 || d > 30) return false;
                    break;
                default:
                    if (d < 1 || d > 31) return false;
            }
            return true;
        }
    }
    