public class Empleado {
    String nombre = "";
    int anosTrabajando = 0;
    Boolean cajero = false;
    Boolean supervisor = false;
    Boolean recepcionista = false;
    int vacaciones = 0;

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
