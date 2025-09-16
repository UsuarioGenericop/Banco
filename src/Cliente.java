public class Cliente {
    String nombreUsuario = "";
    int numeroUsuario = 123456;
    int PIN = 654321;
    boolean tieneFondos = false;
    double fondos = 0;

    void depositar() {
        System.out.print("Haz depositado ");
    }

    void retirar() {
        System.out.print("Haz retirado ");
    }
}
