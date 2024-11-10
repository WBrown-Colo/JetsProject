package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.PassengerJet;

public class JetsApplication {

	private AirField airField = new AirField();
	private static Scanner kb;

	// NO other fields! No list of jets!

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
		app.launch();

		kb.close();
	}

	private void launch() {

		boolean keepGoing = true;
		while (keepGoing) {
			printMenu();
			int input = kb.nextInt();
			kb.nextLine();

			switch (input) {
			case 1:
				airField.listFleet();
				break;
			case 2:
				airField.flyAllJets();
				break;
			case 3:
				System.out.println("The fastest jet in the fleet is: " + airField.getFastestJet());
				break;
			case 4:
				System.out.println("The jet in the fleet with the longest range is: " + airField.getJetWithLongestRange());
				break;
			case 5:
				airField.loadAllCargo();
				break;
			case 6:
				airField.startDogFight();
				break;
			case 7:
				userAddJet();
				break;
			case 8:
				System.out.println("Which jet would you like to remove?");
				System.out.println();
				airField.listFleet();
				System.out.println();
				System.out.println("Starting with '0' as the top line, select a number 0-4 for which jet you wish to remove.");
				int index = kb.nextInt();
				if (airField.removeJet(index)) {
					System.out.println("The jet has been removed");
				}
				break;
			case 9:
				System.out.println("<< Application Terminated >>");
				keepGoing = false;
				break;
			}
			if (keepGoing) {
				System.out.println("Would you like to continue? Y/N");
				String choice = kb.next();
				if (choice.equalsIgnoreCase("Y")) {
					keepGoing = true;
				} else {
					keepGoing = false;
				}
			}
		}
	}

	private void printMenu() {
		System.out.println(" ======================================== ");
		System.out.println("|    *WELCOME TO THE JETS APPLICATION*   |");
		System.out.println("|                                        |");
		System.out.println("|  Please select a number from the menu  |");
		System.out.println("|                --------                |");
		System.out.println("| 1. List all of the jets in the fleet   |");
		System.out.println("| 2. Fly all of the jets in the fleet    |");
		System.out.println("| 3. View the fastest jet in the fleet   |");
		System.out.println("| 4. View the jet with the longest range |");
		System.out.println("| 5. Load all cargo into the jets        |");
		System.out.println("| 6. Send jets to DOGFIGHT!              |");
		System.out.println("| 7. Add a new jet to the fleet          |");
		System.out.println("| 8. Remove a jet from the fleet         |");
		System.out.println("| 9. EXIT the jets application           |");
		System.out.println(" ======================================== ");
	
	}
	
	//TODO: create method/cases in order to addJet
	private void userAddJet() {
		System.out.println("Select a jet to add: ");
		airField.printSimpleJets();
		String jetType = kb.nextLine();
		System.out.print("Input the model: ");
		String model = kb.nextLine();
		System.out.print("Enter a max speed in MPH: ");
		int speed = kb.nextInt();
		System.out.print("Enter the max range of distance traveled: ");
		int range = kb.nextInt();
		System.out.print("Set the price of the aircraft: ");
		double price = kb.nextLong();
		kb.nextLine();
		System.out.println();
		switch (jetType) {
		case "Passenger Jet":
			PassengerJet userPassenger = new PassengerJet(model, speed, range, price);
			airField.addJet(userPassenger);
			break;
		case "Cargo Jet":
			CargoJet userCargo = new CargoJet(model, speed, range, price);
			airField.addJet(userCargo);
			break;
		case "Fighter Jet":
			FighterJet userFighter = new FighterJet(model, speed, range, price);
			airField.addJet(userFighter);
			break;
		default:
			System.out.println("Input error. Please use a valid entry from above.");
			break;
		}
		System.out.println("The " + jetType + " was added to the fleet");
	}
}