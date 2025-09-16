public class Ahorros extends CuentaBancaria {
    double ahorroAnual;
    boolean primerDeposito = false;
    double saldo;

    Ahorros(int numeroCuenta, String nombreUsuario, double ahorroAnual) {
        super(numeroCuenta, nombreUsuario);
        this.ahorroAnual = ahorroAnual;
        this.saldo = 0;
    }

    void mostrarTodo() {
        System.out.println(ahorroAnual);
        System.out.println(primerDeposito);
        System.out.println(saldo);
    }


    @Override
    void depositar(double monto) {


        if (!primerDeposito) {
            if (monto < 1000) {
                System.out.println("Debes depositar mas de 1000 en tu primer deposito");
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
        if (saldo - monto < 500) {
            System.out.println("Debes dejar al menos 500 en tu cuenta");
            System.out.println("\u001B[31mFondos: \u001B[0m" + saldo);
        } else {
            System.out.println("Retiro hecho");
            saldo -= monto;
            System.out.println("\u001B[31mFondos: \u001B[0m" + saldo);
        }

    }

    void calcularIntereses() {
        double interes = (saldo * (ahorroAnual / 12 / 100));
        saldo += interes;
        System.out.println("\u001B[31mInteres mensual agregado: \u001B[0m" + interes);
        System.out.println("\u001B[31mFondos: \u001B[0m" + saldo);

    }
}
