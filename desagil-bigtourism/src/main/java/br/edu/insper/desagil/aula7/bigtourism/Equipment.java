package br.edu.insper.desagil.aula7.bigtourism;

public abstract class Equipment {
	private String name;
	private double price;

	public Equipment(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
