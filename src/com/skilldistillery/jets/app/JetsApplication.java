package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.Jet;

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
						
			case "7" : airfield.addJet();
						break;
						
			case "8" : airfield.removeJet();
						break;
						
			case "9" : System.out.println("Thank you Commander! Goodbye.");
						quit = true;
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
}
