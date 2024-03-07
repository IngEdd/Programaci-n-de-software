import javax.swing.JOptionPane;

public class PPunto4v2 {
    public static void main(String[] args) {
        // Se utiliza un cuadro de diálogo para ingresar la temperatura en Celsius
        String input = JOptionPane.showInputDialog("Calculadora de grados Fahrenheit.\nIngrese un valor en grados Celsius:");

        // Convertir la entrada de cadena a un valor numérico
        double num = Double.parseDouble(input);

        // Realizar la conversión a grados Fahrenheit
        double res = (num * 9/5) + 32;

        // Mostrar el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El resultado en grados Fahrenheit es: " + res);
    }
}
