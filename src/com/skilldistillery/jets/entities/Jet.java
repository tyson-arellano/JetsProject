package com.skilldistillery.jets.entities;

import java.util.List;

public abstract class Jet {

	private String model;
	private double speed;
	private double range;
	private double price;

	public Jet() {

	}

	public Jet(String model, double speed, double range, double price) {

		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {
		
	
		System.out.println(this.model + " flying");
	}

	public double getMachSpeed() {
		
		return 0.0;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet Model: " + model + " | Speed: " + speed +" MPH " + " | Range: " + range + " Miles " + " | Price: " + price ;
	}



}
