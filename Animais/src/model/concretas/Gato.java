

public class Gato extends AnimalAB {
    private double comidaIngerida = 0.0f;
    private double caminhoPercorrido = 0.0f;
    private double horasDormidas = 0.0f;
    @Override
    public void comer(double quantidade) {
        comidaIngerida += quantidade;
    }

    @Override
    public void moverse(double distancia) {
        ;
        caminhoPercorrido += distancia;
    }

    @Override
    public void dormir(double horas) {

        horasDormidas += horas;
    }
}