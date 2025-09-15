import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        cliente.nombreUsuario = scanner.nextLine();
        System.out.println("Hola " + cliente.nombreUsuario + "!");

        System.out.print("Ingresa tu numero de usuario: ");
        int entrada = scanner.nextInt();
        scanner.nextLine();
        while (entrada != cliente.numeroUsuario) {
            System.out.println("Número de usuario incorrecto. Inténtalo de nuevo.");
            System.out.print("Ingresa tu numero de usuario: "); //Numero de usuario correcto: 123456
            entrada = scanner.nextInt();
        }
        System.out.println("Bienvenid@!");

        System.out.println(cliente.nombreUsuario + " " + cliente.numeroUsuario);

        System.out.println("\u001B[31mFondos: \u001B[0m" + cliente.fondos);

        System.out.print("Ingresa la cantidad a depositar: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        if (saldo > 0) {
            cliente.depositar();
            System.out.println(saldo);
            cliente.fondos = saldo;
            System.out.println("\u001B[31mFondos: \u001B[0m" + cliente.fondos);
            cliente.tieneFondos = true;
        } else {
            System.out.println("Ingresa una cantidad mayor a 0");
        }
        System.out.print("Deseas retirar? (y/n): ");
        String respuesta = scanner.nextLine();

        while (!respuesta.equalsIgnoreCase("y")) {
            System.out.print("Deseas retirar? (y/n): ");
            respuesta = scanner.nextLine();
        }
        System.out.print("Ingresa tu PIN: ");
        int PIN = scanner.nextInt();
        scanner.nextLine();
        while (PIN != cliente.PIN) {
            System.out.println("PIN incorrecto");
            System.out.print("Ingresa tu PIN: ");
            PIN = scanner.nextInt();
        }
        System.out.print("Ingresa la cantidad a retirar: ");
        double retiro = scanner.nextDouble();
        scanner.nextLine();

        if (retiro > saldo) {
            System.out.println("No puedes retirar más de tu saldo");
        } else if (retiro <= 0) {
            System.out.println("Tienes que retirar más de 0");
        } else {
            cliente.retirar();
            System.out.println("Retiro realizado: $" + retiro);
            saldo = saldo - retiro;
            System.out.print("\u001B[31mFondos: \u001B[0m" + saldo);
        }

        scanner.close();

        Empleado empleado1 = new Empleado();
        empleado1.anosTrabajando = 9;
        empleado1.calcularVacaciones();
        empleado1.mostrarVacaciones();
    }
}