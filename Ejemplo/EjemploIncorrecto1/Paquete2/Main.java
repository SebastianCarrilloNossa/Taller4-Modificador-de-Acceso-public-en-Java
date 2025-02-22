// Paquete: paquete2
package Taller4ModificadordeaccesoPublic.Ejemplo.EjemploIncorrecto1.Paquete2;

import paquete1.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan"); // Error de compilación: Persona no es visible
    }
}
