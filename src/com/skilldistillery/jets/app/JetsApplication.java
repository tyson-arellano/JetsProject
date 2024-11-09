package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class JetsApplication {
	
	private static Airfield airfield = new Airfield();;
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
		
		app.launch();
		sc.close();
	}
	
	private void launch() {
		boolean quit = false;
		System.out.println();
		System.out.println("Hello Commander! Awaiting your orders!");
		System.out.println();
		do {
			displayUserMenu();
			String input = sc.next();
			
			switch(input) {
			
			case "1" : airfield.fleetList();
						break;
						
			case "2" : airfield.takeOff();
						break;
						
			case "3" : airfield.viewFastestJet();
						break;
						
			case "4" : airfield.viewJetWithLongestRange();
						break;
						
			case "5" : airfield.loadAllCargoJets();
						break;
			
			case "6" : airfield.dogFight();
						break;
						
			case "7" : addJet();
						break;
						
			case "8" : removeJet();
						break;
						
			case "9" : System.out.println("Thank you Commander! Goodbye.");
						quit = true;
						break;
						
			default : System.out.println();
					  System.out.println("Invalid choice. Please enter a number from the menu.");
					  System.out.println();
						break;
			}
			
		}while( quit ==false);
	}
	private void displayUserMenu( ) {
		System.out.println("***********************************");
		System.out.println("************ User Menu ************");
		System.out.println("***********************************");
		System.out.println("*  1. List Fleet                  *");
		System.out.println("*  2. Fly all jets                *");
		System.out.println("*  3. View fastest jet            *");
		System.out.println("*  4. View jet with longest range *");
		System.out.println("*  5. Load all Cargo jets         *");
		System.out.println("*  6. Dogfight!                   *");
		System.out.println("*  7. Add a jet to the fleet      *");
		System.out.println("*  8. Remove a jet from the fleet *");
		System.out.println("*  9. Quit                        *");
		System.out.println("***********************************");
	}
	public void addJet() {
		Jet newJet = null;
		
		System.out.println("What type of aircraft would you like to add? Select 1, 2 or 3.");
		System.out.println();
		System.out.println(" 1. Cargo Plane");
		System.out.println(" 2. Fighter Jet");
		System.out.println(" 3. Passenger Plane");
		String type = sc.next();
		
		System.out.println("What model?");
		String userJet = sc.next();
		
		System.out.println("What is the maximum speed for this aircraft? Enter speed.");
		double newJetSpeed = sc.nextDouble();
		
		System.out.println("What is the range of this aircraft? Enter range.");
		double newJetRange = sc.nextDouble();
		
		System.out.println("What is the price of this aircraft? Enter Price.");
		double newJetPrice = sc.nextDouble();
		
		switch(type) {
		
			case "1" : newJet = new CargoPlane( userJet , newJetSpeed, newJetRange, newJetPrice );
					   airfield.getFleet().add(newJet);
					   break;
					   
			case "2" : newJet = new FighterJet( userJet , newJetSpeed, newJetRange, newJetPrice );
					   airfield.getFleet().add(newJet);
					   break;
					   
			case "3" : newJet = new PassengerJet( userJet , newJetSpeed, newJetRange, newJetPrice );
					   airfield.getFleet().add(newJet);
					   break;
			
			default  : System.out.println("Invalid Choice. Please try again, Commander.");
		}
		
		
		}
	
	public void removeJet() {
//		TODO logic to remove jet
	}
}
