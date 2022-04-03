package br.edu.insper.desagil.aula7.bigtourism;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private Pilot pilot;
	private List<Equipment> equipments;

	public Car(Pilot pilot) {
		this.pilot = pilot;
		this.equipments = new ArrayList<>();
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void add(Equipment equipment) {
		equipments.add(equipment);
	}
}
