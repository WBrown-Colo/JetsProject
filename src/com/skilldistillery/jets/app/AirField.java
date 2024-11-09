package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;

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
					newJet = new FighterJet(model, speed, range, price);
					fleet.add(newJet);
					break;
				}
				System.out.println(newJet);
				
			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}

}