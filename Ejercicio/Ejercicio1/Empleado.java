package Taller4ModificadordeaccesoPublic.Ejercicio.Ejercicio1;

public class Empleado {
    // Propiedad pública
    public String nombre;

    // Propiedad privada
    private double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);  // Usamos el setter para aplicar la validación
    }

    // Método getter para salario
    public double getSalario() {
        return salario;
    }

    // Método setter para salario con validación
    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("El salario no puede ser negativo.");
        } else {
            this.salario = salario;
        }
    }
}