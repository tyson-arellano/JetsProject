package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {

	public PassengerJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassengerJet(String model, double speed, double range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(this.toString());
		System.out.println(this.getModel() + " will fly for :" + this.getRange() / this.getSpeed());
	}

}
