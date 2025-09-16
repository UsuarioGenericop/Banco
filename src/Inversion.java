import java.util.Scanner;

public class Inversion extends CuentaBancaria {
    boolean primerDeposito = false;
    double saldo;

    Inversion(int numeroCuenta, String nombreUsuario) {
        super(numeroCuenta, nombreUsuario);
        this.saldo = 0;
    }

    @Override
    void depositar(double monto) {
        if (!primerDeposito) {
            if (monto < 25000) {
                System.out.println("Debes depositar mas de 25000 en tu primer deposito");
                System.out.println("\u001B[31mFondos: \u001B[0m" + saldo);
            } else {
                System.out.println("Deposito hecho");
                primerDeposito = true;
                saldo += monto;
                System.out.println("\u001B[31mFondos: \u001B[0m" + saldo);
            }
        } else {
            System.out.println("Deposito hecho");
            saldo += monto;
            System.out.println("\u001B[31mFondos: \u001B[0m" + saldo);
        }
    }

    void retirar(double monto) {
        if (saldo - monto < 10000) {
            System.out.println("Debes dejar al menos 10000 en tu cuenta");
            System.out.println("\u001B[31mFondos: \u001B[0m" + saldo);
        } else {
            System.out.println("Retiro hecho");
            saldo -= monto;
            System.out.println("\u001B[31mFondos: \u001B[0m" + saldo);
        }
    }

    void cerrarCuenta() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\u001B[31mADVERTENCIA ESTA POR CERRAR SU CUENTA \u001B[0m");
        System.out.print("\u001B[31mESTA SEGURO? (Y/N) \u001B[0m");
        String respuestaCerrar = scanner1.nextLine();
        if (respuestaCerrar.equalsIgnoreCase("y")) {
            System.out.print("\u001B[31mCONFIRME QUE DESEA BORRAR SU CUENTA (Y/N) \u001B[0m");
            respuestaCerrar = scanner1.nextLine();
            if (respuestaCerrar.equalsIgnoreCase("y")) {
                System.out.println("Su cuenta ha sido borrada");
                System.out.println("Ha retirado: " + saldo);
            }
        }
        scanner1.close();
    }
}
