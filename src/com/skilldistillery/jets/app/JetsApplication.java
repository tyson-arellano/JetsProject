package com.skilldistillery.jets.app;

import java.util.Scanner;

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
		
		do {
			displayUserMenu();
			String input = sc.next();
			
			switch(input) {
			case "1" : 
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
