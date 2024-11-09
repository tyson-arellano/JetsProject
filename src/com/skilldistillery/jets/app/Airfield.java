package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class Airfield {

	private List<Jet> fleet = new ArrayList<>();

	public Airfield() {

		loadJetsFromFile("jets.txt");

	}

	public void loadJetsFromFile(String fileName) {

		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {

				String[] fields = line.split(",");
				String jetType = fields[0];
				String model = fields[1];
				int speed = Integer.parseInt(fields[2]);
				int range = Integer.parseInt(fields[3]);
				double price = Double.parseDouble(fields[4]);

				Jet newJet = null;

				switch (jetType) {
				case "CargoPlane":
					newJet = new CargoPlane(model, speed, range, price);
					fleet.add(newJet);
					break;

				case "FighterJet":
					newJet = new FighterJet(model, speed, range, price);
					fleet.add(newJet);
					break;

				case "PassengerJet":
					newJet = new PassengerJet(model, speed, range, price);
					fleet.add(newJet);
					break;
				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void fleetList() {
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(fleet.get(i));
			System.out.println();
		}

	}

	public void takeOff() {
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(fleet.get(i).toString());
			System.out.println(fleet.get(i).getModel() + " will fly for "
					+ fleet.get(i).getRange() / fleet.get(i).getSpeed() + " hour(s) before running out of fuel");
			System.out.println();

		}
	}

	public void viewFastestJet() {
		Jet fastest = fleet.get(0);

		for (int i = 0; i < fleet.size(); i++) {
			Jet currentJet = fleet.get(i);
			if (currentJet.getSpeed() > fastest.getSpeed()) {
				fastest = currentJet;

			}
		}
		System.out.println("The fastet jet in the fleet is:");
		System.out.println(fastest);
		System.out.println();
	}

	public void viewJetWithLongestRange() {
		Jet longestRange = fleet.get(0);

		for (int i = 0; i < fleet.size(); i++) {
			Jet currentJet = fleet.get(i);
			if (currentJet.getRange() > longestRange.getRange()) {
				longestRange = currentJet;

			}
		}
		System.out.println("The jet with the longest range in the fleet is:");
		System.out.println(longestRange);
		System.out.println();
	}

	public void loadAllCargoJets() {

		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i) instanceof CargoPlane) {
				((CargoPlane) fleet.get(i)).loadCargo();
			}
		}
	}

	public void dogFight() {

		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i) instanceof FighterJet) {
				((FighterJet) fleet.get(i)).fight();
			}
		}
	}
	
	public void addJet() {
//		TODO logic to add a jet
	}
	
	public void removeJet() {
//		TODO logic to remove jet
	}
	
	
}
