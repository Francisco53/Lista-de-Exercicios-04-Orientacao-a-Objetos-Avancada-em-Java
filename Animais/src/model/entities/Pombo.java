package model.entities;

import model.abstractions.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {
	
	private double distanciaVoo = 0.0f;
	private double comidaIngerida = 0.0f;
	private double caminhoPercorrido = 0.0f;
	private double horasDormidas = 0.0f;
	
	public Pombo(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso, int quantidadeAssas, double envergaduraAsas) {
		super(nome, tipoAnimal, idade, habitat, quantidadePatas, altura, peso, quantidadeAssas, envergaduraAsas);
	}
	
	public double getDistanciaVoo() {
		return distanciaVoo;
	}
	
	public double getComidaIngerida() {
		return comidaIngerida;
	}

	public double getCaminhoPercorrido() {
		return caminhoPercorrido;
	}


	public double getHorasDormidas() {
		return horasDormidas;
	}

	@Override
	public void voar(double distancia) {
		distanciaVoo += distancia;
	}

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
