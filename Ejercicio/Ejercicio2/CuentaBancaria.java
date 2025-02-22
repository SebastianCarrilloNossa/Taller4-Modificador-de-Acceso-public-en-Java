package Taller4ModificadordeaccesoPublic.Ejercicio.Ejercicio2;

public class CuentaBancaria {
    // Propiedades privadas
    private String numeroCuenta;
    private double saldo;

    // Propiedad pública
    public String tipoCuenta;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Método setter para saldo con validación
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("El saldo no puede ser negativo.");
        } else {
            this.saldo = saldo;
        }
    }
// Método para mostrar los detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}

