public class Cliente {
    String nombreUsuario;
    int numeroUsuario;
    int PIN = 654321;
    boolean tieneFondos = false;
    double fondos = 0;

    Cliente(String nombreUsuario, int numeroUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.numeroUsuario = numeroUsuario;

    }

    void depositar() {
        System.out.print("Haz depositado ");
    }

    void retirar() {
        System.out.print("Haz retirado ");
    }
}
