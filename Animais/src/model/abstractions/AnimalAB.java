package model.abstractions;

import model.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {

	private String nome;
	private String tipoAnimal;
	private int idade;
	private String habitat;
	private int quantidadePatas;
	private double altura;
	private double peso;

	public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso) {
		this.nome = nome;
		this.tipoAnimal = tipoAnimal;
		this.idade = idade;
		this.habitat = habitat;
		this.quantidadePatas = quantidadePatas;
		this.altura = altura;
		this.peso = peso;
	}
	
	public String getNome() {
        return nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    public int getQuantidadePatas() {
        return quantidadePatas;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getPeso() {
        return peso;
    }

	@Override
	public abstract void comer(double quantidade);

	@Override
	public abstract void moverse(double distancia);

	@Override
	public abstract void dormir(double horas);
}
