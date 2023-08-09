package model.abstractions;

public abstract class AnimalVoadorAB extends AnimalAB {

	private int quantidadeAssas;
    private double envergaduraAsas;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso, int quantidadeAssas, double envergaduraAsas) {
    	super(nome, tipoAnimal, idade, habitat, quantidadePatas, altura, peso);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAsas = envergaduraAsas;
    }

    public int getQuantidadeAssas() {
        return quantidadeAssas;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }
	
    public abstract void voar(double distancia);
}
