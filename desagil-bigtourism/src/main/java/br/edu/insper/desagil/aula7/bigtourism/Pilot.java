package br.edu.insper.desagil.aula7.bigtourism;

public class Pilot {
	private String name;
	private double budget;

	public Pilot(String name, double budget) {
		this.name = name;
		this.budget = budget;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

	public void deposit(double amount) {
		budget += amount;
	}

	public void withdraw(double amount) {
		budget -= amount;
	}
}
