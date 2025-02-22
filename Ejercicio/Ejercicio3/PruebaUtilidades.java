package Taller4ModificadordeaccesoPublic.Ejercicio.Ejercicio3;

public class PruebaUtilidades {
    public static void main(String[] args) {
        // Probar la suma
        int resultadoSuma = Utilidades.suma(10, 5);
        System.out.println("Suma: 10 + 5 = " + resultadoSuma);

        // Probar la resta
        int resultadoResta = Utilidades.resta(10, 5);
        System.out.println("Resta: 10 - 5 = " + resultadoResta);

        // Probar la multiplicación
        int resultadoMultiplicacion = Utilidades.multiplicacion(10, 5);
        System.out.println("Multiplicación: 10 * 5 = " + resultadoMultiplicacion);

        // Probar la división
        String resultadoDivision = Utilidades.division(10, 2);
        System.out.println("División: 10 / 2 = " + resultadoDivision);

        // Probar la división por cero
        String resultadoDivisionPorCero = Utilidades.division(10, 0);
        System.out.println("División: 10 / 0 = " + resultadoDivisionPorCero);
    }
}

