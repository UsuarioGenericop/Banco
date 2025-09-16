public class Empleado extends Cliente {
    String nombre = "";
    int anosTrabajando = 0;
    String puestoTrabajo;
    int vacaciones = 0;

    Empleado(String nombreUsuario, int numeroUsuario, int anosTrabajando, String puestoTrabajo) {
        super(nombreUsuario, numeroUsuario);
        this.anosTrabajando = anosTrabajando;
        this.puestoTrabajo = puestoTrabajo;
    }

    void calcularVacaciones() {

        if (anosTrabajando <= 1) {
            vacaciones = 5;
        } else if (anosTrabajando >= 9) {
            vacaciones = 20;

        } else {
            vacaciones = 5;
            vacaciones = vacaciones + (2 * (anosTrabajando - 1));
        }
    }

    void mostrarVacaciones() {
        System.out.println(vacaciones);
    }
}
