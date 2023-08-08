package model.entities;

import model.abstractions.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {

	@Override
	public void nadar() {
		System.out.println("Nadando...");
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
