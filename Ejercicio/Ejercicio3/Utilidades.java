package Taller4ModificadordeaccesoPublic.Ejercicio.Ejercicio3;

public class Utilidades {

    // Método para realizar la suma de dos números
    public static int suma(int a, int b) {
        return a + b;
    }

    // Método para realizar la resta de dos números
    public static int resta(int a, int b) {
        return a - b;
    }

    // Método para realizar la multiplicación de dos números
    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    // Método para realizar la división de dos números
    // Retorna un mensaje de error si se intenta dividir por cero
    public static String division(int a, int b) {
        if (b == 0) {
            return "Error: No se puede dividir entre cero.";
        } else {
            return String.valueOf(a / (double) b);
        }
    }
}

