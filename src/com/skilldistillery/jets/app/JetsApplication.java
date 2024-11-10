package com.skilldistillery.jets.app;

import java.util.InputMismatchException;
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

			switch (input) {

			case "1":
				airfield.fleetList();
				break;

			case "2":
				airfield.takeOff();
				break;

			case "3":
				airfield.viewFastestJet();
				break;

			case "4":
				airfield.viewJetWithLongestRange();
				break;

			case "5":
				airfield.loadAllCargoJets();
				break;

			case "6":
				airfield.dogFight();
				break;

			case "7":
				userAddJet();
				break;

			case "8":
				userRemoveJet();
				break;

			case "9":
				System.out.println("Thank you Commander! Goodbye.");
				quit = true;
				break;

			default:
				System.out.println();
				System.out.println("Invalid input. Please enter a valid number.");
				System.out.println();
				break;
			}

		} while (quit == false);
	}

	private void displayUserMenu() {
		System.out.println("***********************************");
		System.out.println("************ Main Menu ************");
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

	public void userAddJet() {
		
		String type;
		String userJet;
		double newJetSpeed = 0;
		double newJetRange = 0;
		double newJetPrice = 0;
		boolean validInput = false;
		boolean keepGoing = true;

		do {
			System.out.println("What type of aircraft would you like to add? Select 1, 2 or 3.");
			System.out.println();
			System.out.println(" 1. Cargo Plane");
			System.out.println(" 2. Fighter Jet");
			System.out.println(" 3. Passenger Plane");

			type = sc.next();
			if (!type.equals("1") && !type.equals("2") && !type.equals("3")) {
				System.out.println();
				System.out.println("Invalid Choice. You must select 1, 2 or 3. RETURNING TO MAIN MENU.");
				System.out.println();
				break;
			}

			System.out.println("What model?");
			userJet = sc.next();

			do {
				System.out.println();
				System.out.println("What is the maximum speed for this aircraft? Enter speed using ONLY NUMBERS.");
				System.out.println();
				try {
					newJetSpeed = sc.nextDouble();
					validInput = true;
					break;
				} catch (InputMismatchException e) {
					System.out.println();
					System.out.println("Invalid input. USE ONLY NUMBERS.");
					System.out.println();
					System.out.println();
					sc.next();
					validInput = false;
				}
			} while (!validInput);

			do {
				System.out.println();
				System.out.println("What is the range of this aircraft? Enter range using ONLY NUMBERS.");
				System.out.println();
				try {
					newJetRange = sc.nextDouble();
					validInput = true;
					break;
				} catch (InputMismatchException e) {
					System.out.println();
					System.out.println("Invalid input. USE ONLY NUMBERS.");
					System.out.println();
					sc.next();
					validInput = false;
				}
			} while (!validInput);

			do {
				System.out.println("What is the price of this aircraft? Enter Price using ONLY NUMBERS.");
				try {
					newJetPrice = sc.nextDouble();
					System.out.println();
					System.out.println("Aircraft added to fleet!");
					System.out.println();
					validInput = true;
					keepGoing = false;
				} catch (InputMismatchException e) {
					System.out.println();
					System.out.println("Invalid input. Please enter a valid price using ONLY NUMBERS.");
					System.out.println();
					sc.next();
					validInput = false;
				}
			} while (!validInput);
			
			airfield.addJet(type, userJet, newJetSpeed, newJetRange, newJetPrice);
			
		} while (keepGoing);

	}

	public void userRemoveJet() {

		System.out.println("Select the number corresponding to the aircraft you would like to remove from the fleet.");
		System.out.println();
		airfield.fleetList();

		int selection = 0;

		try {
			selection = sc.nextInt();
			airfield.removeJet(selection);
			System.out.println("Aircraft removed from fleet.");
			System.out.println();

		} catch (InputMismatchException e) {
			System.out.println("Invalid input. You must enter a valid number. RETURNING TO MAIN MENU.");
			System.out.println();

		} catch (Exception e) {
			System.out.println("Invalid input. You must enter a valid number. RETURNING TO MAIN MENU.");
			System.out.println();

		}

	}
}
