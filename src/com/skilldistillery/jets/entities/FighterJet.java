package com.skilldistillery.jets.entities;

public class FighterJet extends Jet {
//create CombatReady and implement
	public FighterJet() {
		super();
	}

	public FighterJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	@Override
	public String toString() {
		return "Fighter Jet [model: " + getModel() + ", speedInMPH: " + getSpeed() + ", range: "
				+ getRange() + "miles, price: $" + getPrice() + "]";
	}

}
