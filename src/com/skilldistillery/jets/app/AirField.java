package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.entities.Jet;

public class AirField {
	
	String fileName = "Jets.Text";
	
	private List<Jet> fleet = new ArrayList<>();
	// NO other fields
	
	public AirField() {
		loadJetsFromFile("jets.txt");
	}
	
	private void loadJetsFromFile(String fileNameJets) {
		//FIXME - try/catch/bufferedreader template
		//split line form file into array
		//Jet newJet = new PassengerJet(mod,sp,rng,pr);
		//fleet,add(newJet)
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName)) {
				String line = null;
				while ((line = br.readLine()) !=null) {
					String[] fields = line.split(",");
					String jetType = fields[0];
					String model = fields[1];
					int speed = Integer.parseInt(fields[2]);
					int range = Integer.parseInt(fields[3]);
					double price = Double.parseDouble(fields[4]);
					//use jetType to determine which subclass of Jet to construct
					switch(jetType) {
					case "cargo":
						// construct a new CargoJet()
						// add to fleet
						break;
					}
					//Jet newJet = new PassengerJet(mod,sp,rng,pr);
					// fleet.add(newJet)
				}
			}
			catch (fileNotFoundException e)
		}
	}
	
	//TODO: public methods for handling jets

}
