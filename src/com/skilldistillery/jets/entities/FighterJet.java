package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FighterJet(String model, double speed, double range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(this.toString());
		System.out.println(this.getModel() + " will fly for :" + this.getRange() / this.getSpeed());
	}

	@Override
	public void fight() {

		System.out.println(this.getModel() + " weapons loaded and ready for combat!");
		System.out.println();

	}
}
