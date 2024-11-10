package com.skilldistillery.jets.entities;

import java.util.List;

public class CargoPlane extends Jet implements CargoLoader {

	public CargoPlane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoPlane(String model, double speed, double range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(this.toString());
		System.out.println(this.getModel() + " will fly for :" + this.getRange() / this.getSpeed());
	}

	@Override
	public void loadCargo() {

		System.out.println(" Cargo has been loaded on " + this.getModel());
		System.out.println();

	}

}
