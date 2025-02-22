package Taller4ModificadordeaccesoPublic.Ejercicio.Ejercicio1;

public class PruebaEmpleado {
    public static void main(String[] args) {
        // Crear un objeto Empleado
        Empleado empleado1 = new Empleado("Juan Pérez", 2500);

        // Acceder a las propiedades públicas y privadas
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Salario: " + empleado1.getSalario());

        // Intentar modificar el salario con un valor negativo
        empleado1.setSalario(-100); // Esto debería imprimir un mensaje de error

        // Cambiar el salario a un valor válido
        empleado1.setSalario(3000);
        System.out.println("Nuevo salario: " + empleado1.getSalario());
    }
}


