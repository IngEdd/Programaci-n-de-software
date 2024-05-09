package Taller_POO;
import java.util.Scanner;

public class Triqui {
    // Definimos una matriz 3x3 para representar el tablero
    private static char[][] tablero = new char[3][3];
    private static char jugadorActual = 'X';

    // Método para inicializar el tablero con espacios en blanco
    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    // Método para mostrar el tablero en la consola
    private static void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Método para verificar si el tablero está lleno (empate)
    private static boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Aún hay casillas vacías
                }
            }
        }
        return true; // El tablero está lleno
    }

    // Método para verificar si hay un ganador
    private static boolean hayGanador() {
        // Verificamos filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true; // Hay una fila completa
            }
            if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                return true; // Hay una columna completa
            }
        }
        // Verificamos diagonales
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true; // Diagonal principal completa
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true; // Diagonal secundaria completa
        }
        return false;
    }

    // Método para realizar el movimiento de un jugador
    private static void hacerMovimiento(int fila, int columna) {
        if (tablero[fila][columna] == ' ') {
            tablero[fila][columna] = jugadorActual;
        } else {
            System.out.println("La casilla ya está ocupada. Inténtalo de nuevo.");
            turno();
        }
    }

    // Método para cambiar de jugador
    private static void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }

    // Método para gestionar el turno de un jugador
    private static void turno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Turno de " + jugadorActual + ". Ingresa la fila y columna (ejemplo: 1 2):");
        int fila = scanner.nextInt() - 1;
        int columna = scanner.nextInt() - 1;
        hacerMovimiento(fila, columna);
        if (hayGanador()) {
            System.out.println("¡" + jugadorActual + " ha ganado!");
            mostrarTablero();
            System.exit(0);
        } else if (tableroLleno()) {
            System.out.println("¡Empate!");
            mostrarTablero();
            System.exit(0);
        }
        cambiarJugador();
        mostrarTablero();
        turno();
    }

    public static void main(String[] args) {
        inicializarTablero();
        mostrarTablero();
        turno();
    }
}
