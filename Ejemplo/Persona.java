package Taller4ModificadordeaccesoPublic.Ejemplo;

// Clase definida como pública
public class Persona {
    public String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
