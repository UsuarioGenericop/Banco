public class Empresa {
    double nivelDeRiesgo = 0.0;
    double monto = 0.0;
    int plazo = 0;
    double porcentajeRetorno = 0;

    void calcularRetorno() {
        double retorno = monto * (porcentajeRetorno * 100);
        System.out.println(retorno);
    }
}
