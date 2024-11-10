package com.skilldistillery.jets.entities;

public class FighterJet extends Jet {
//create CombatReady and implement
	public FighterJet() {
		super();
	}

	public FighterJet(String model, int speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	@Override
	public String toString() {
		return "Fighter Jet [model: " + getModel() + ", speedInMPH: " + getSpeedInMPH() + ", range: "
				+ getRange() + "miles, price: $" + getPrice() + "]";
	}

	public void fight() {
		
	}

}
