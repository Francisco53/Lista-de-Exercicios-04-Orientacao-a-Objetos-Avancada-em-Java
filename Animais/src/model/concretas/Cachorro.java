public class Cachorro extends AnimalAB {
    private double comidaIngerida = 0.0;
    private double caminhoPercorrido = 0.0;
    private double horasDormidas = 0.0;

    @Override
    public void comer(double quantidade) {
        comidaIngerida += quantidade;
    }

    @Override
    public void moverse(double distancia) {
        caminhoPercorrido += distancia;
    }

    @Override
    public void dormir(double horas) {
        horasDormidas += horas;
    }
}