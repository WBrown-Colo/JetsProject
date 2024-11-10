package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private int speedInMPH;
	private int range;
	private long price;
	
	public Jet() {}
	
	public Jet(String model, int speedInMPH, int range, long price) {
		super();
		this.model = model;
		this.speedInMPH = speedInMPH;
		this.range = range;
		this.price = price;
	}

	public void fly() {
		double flyTime = (this.range / this.speedInMPH);
		System.out.println("The " + this.model + " can fly for up to " + flyTime + "hours.");
	}
	
	public double getSpeedInMach() {
		double speedInMach = (this.range / this.speedInMPH);
		return speedInMach;
	}
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeedInMPH() {
		return speedInMPH;
	}

	public void setSpeedInMPH(int speedInMPH) {
		this.speedInMPH = speedInMPH;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", speedInMPH=" + speedInMPH + ", range=" + range + ", price=" + price + "]";
	}

}
