package Taller4ModificadordeaccesoPublic.Ejercicio.Ejercicio2;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        // Crear un objeto CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 1500.0, "Ahorros");

        // Intentar acceder directamente al número de cuenta (esto causará un error de compilación)
        
        /*System.out.println(cuenta.numeroCuenta);*/ // Error: numeroCuenta tiene modificador de acceso private

        // Acceder al saldo y tipo de cuenta mediante los métodos correspondientes
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        System.out.println("Tipo de cuenta: " + cuenta.tipoCuenta);

        // Modificar el saldo con un valor válido
        cuenta.setSaldo(2000.0);
        System.out.println("Nuevo saldo: " + cuenta.getSaldo());

        // Intentar modificar el saldo con un valor negativo
        cuenta.setSaldo(-500);  // Esto debería imprimir un mensaje de error
        // Mostrar los detalles completos de la cuenta
        cuenta.mostrarDetalles();
    }
}