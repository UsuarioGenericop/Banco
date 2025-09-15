import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        cliente.nombreUsuario = scanner.nextLine();
        System.out.println("Hola " + cliente.nombreUsuario + "!");
        System.out.print("Ingresa tu numero de cuenta: ");
        cliente.numeroCuenta = scanner.nextInt();
        System.out.println(cliente.nombreUsuario + " " + cliente.numeroCuenta);
        System.out.print("Ingresa la cantidad a depositar: ");
        double saldo = scanner.nextDouble();
        if (saldo > 0) {
            cliente.depositar();
            System.out.println(saldo);
            cliente.fondos = saldo;
            System.out.println("Fondos: " + cliente.fondos);
            cliente.tieneFondos = true;
        } else {
            System.out.println("Ingresa una cantidad mayor a 0");
        }
        System.out.print("Ingresa la cantidad a retirar: ");
        double retiro = scanner.nextDouble();
        if (retiro > saldo) {
            System.out.println("No puedes retirar mas de tu saldo");
        } else if (retiro <= 0) {
            System.out.println("Tienes que retirar mas de 0");

        } else {cliente.retirar();
            System.out.println(retiro);
            saldo = saldo - retiro;
            System.out.print("Fondos " + saldo);
        }

        scanner.close();

    }
}