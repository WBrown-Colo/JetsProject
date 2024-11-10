package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class AirField {

	List<Jet> fleet = new ArrayList<>();
	// NO other fields

	public AirField() {
		loadJetsFromFile("jets.txt");
	//	System.out.println(fleet);
	}

	private void loadJetsFromFile(String fileNameJets) {
		try (BufferedReader br = new BufferedReader(new FileReader(fileNameJets))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				String jetType = fields[0];
				String model = fields[1];
				int speed = Integer.parseInt(fields[2]);
				int range = Integer.parseInt(fields[3]);
				double price = Double.parseDouble(fields[4]);

				Jet newJet = null;

				switch (jetType) {
				case "Cargo":
					newJet = new CargoJet(model, speed, range, price);
					fleet.add(newJet);
					break;

				case "Fighter":
					newJet = new FighterJet(model, speed, range, price);
					fleet.add(newJet);
					break;

				case "Passenger":
					newJet = new PassengerJet(model, speed, range, price);
					fleet.add(newJet);
					break;
				}
				System.out.println(newJet);
				
			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	public void listFleet() {
		for (Jet jet : fleet) {
			System.out.println(jet);
		}
	}

	public void flyAllJets() {
		for (Jet jet : fleet) {
			jet.fly();
		}
	}

	public Jet getFastestJet() {
		Jet fastestJet = fleet.get(0);
		for (int i = 0; i < fleet.size(); i++) {
			Jet currentJet = fleet.get(i);
			if (currentJet.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = currentJet;
			}
		}
		return fastestJet;
	}

	public Jet getJetWithLongestRange() {
		Jet furthestRange = fleet.get(0);
		for (int i = 0; i < fleet.size(); i++) {
			Jet currentJet = fleet.get(i);
			if (currentJet.getRange() > furthestRange.getRange()) {
				furthestRange = currentJet;
			}
		}
		return furthestRange;
	}

	public void loadAllCargo() {
		for (Jet jet : fleet) {
			if (jet instanceof CargoJet) {
				((CargoJet) jet).loadCargo();
			}
		}
	}
			
	public void startDogFight() {
		for (Jet jet : fleet) {
			if (jet instanceof CargoJet) {
				((CargoJet) jet).loadCargo();
		} else if (jet instanceof FighterJet) {
			((FighterJet) jet).fight();
			}
		}
	}

	public void addJet() {
		Jet jet = null;
		fleet.add(jet);
	}

	public boolean removeJet(int index) {
		try {
			fleet.remove(index);
			return true;
		} 
		catch (IndexOutOfBoundsException e) {
					System.err.println("Sorry, but there are not enough resources to add this jet to the fleet.");
					return false;
		}
	}
		
			
}