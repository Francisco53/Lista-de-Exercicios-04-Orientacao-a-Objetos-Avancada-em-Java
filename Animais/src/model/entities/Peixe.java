package model.entities;

import model.abstractions.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {

	private double distanciaNadada = 0.0f;
	private double comidaIngerida = 0.0f;
	private double caminhoPercorrido = 0.0f;
	private double horasDormidas = 0.0f;
	
	public Peixe(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso) {
		super(nome, tipoAnimal, idade, habitat, quantidadePatas, altura, peso);
    }
	
	public double getDistanciaNadada() {
		return distanciaNadada;
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
	public void nadar(double distancia) {
		distanciaNadada += distancia;
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
