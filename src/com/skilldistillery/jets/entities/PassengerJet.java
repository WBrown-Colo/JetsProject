package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {

	public PassengerJet() {
		super();
	}

	public PassengerJet(String model, int speedInMPH, int range, long price) {
		super(model, speedInMPH, range, price);
	}
	
	@Override
	public String toString() {
		return "Passenger Jet [model: " + getModel() + ", speedInMPH: " + getSpeedInMPH() + ", range: "
				+ getRange() + "miles, price: $" + getPrice() + "]";
	}

}
