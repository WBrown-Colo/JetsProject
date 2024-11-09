package com.skilldistillery.jets.entities;

public class CargoJet extends Jet {

	public CargoJet() {
		super();
	}

	public CargoJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	@Override
	public String toString() {
		return "Fighter Jet [model: " + getModel() + ", speedInMPH: " + getSpeed() + ", range: "
				+ getRange() + "miles, price: $" + getPrice() + "]";
	}
	

}
