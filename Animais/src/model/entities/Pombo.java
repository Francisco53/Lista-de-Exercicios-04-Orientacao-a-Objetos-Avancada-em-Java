package model.entities;

import model.abstractions.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {

	@Override
	public void voar() {
		System.out.println("Voando...");
	}

	@Override
	public void comer() {
		System.out.println("Comendo...");
	}

	@Override
	public void moverse() {
		System.out.println("Movendo...");
	}

	@Override
	public void dormir() {
		System.out.println("Dormindo...");
	}
}
