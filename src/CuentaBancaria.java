public abstract class CuentaBancaria {
    int numeroCuenta;
    String nombreUsuario;

    CuentaBancaria(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreUsuario = "Anonimo";
    }

    CuentaBancaria(int numeroCuenta, String nombreUsuario) {
        this.numeroCuenta = numeroCuenta;
        this.nombreUsuario = nombreUsuario;
    }

    void detallesCuenta() {
        System.out.println("Numero de cuentaCuenta: " + numeroCuenta);
        System.out.println("Hola: " + nombreUsuario + "!");
    }

    abstract void depositar(double monto);

    abstract void retirar(double monto);
}
