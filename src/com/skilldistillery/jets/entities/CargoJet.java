package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier {
//implement CargoCarrier
	public CargoJet() {
		super();
	}

	public CargoJet(String model, int speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	@Override
	public String toString() {
		return "Cargo Jet [model: " + getModel() + ", speedInMPH: " + getSpeedInMPH() + ", range: "
				+ getRange() + "miles, price: $" + getPrice() + "]";
	}

	@Override
	public void loadCargo() {
		System.out.println("The " + getModel() + " is loaded!");
		
	}
	

}
