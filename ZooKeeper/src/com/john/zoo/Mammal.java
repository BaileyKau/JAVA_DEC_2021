package com.john.zoo;

public class Mammal {

	private int energyLevel;
	
//	constructor
	public Mammal() {
//		this.energyLevel = 100;
		this.setEnergyLevel(100);
	}
	public Mammal(int energy) {
		this.setEnergyLevel(energy);
	}
	
//	methods
	public int displayEnergy() {
		System.out.println("energy level: " + this.getEnergyLevel());
		return this.getEnergyLevel();
	}

	
	
	
//	------ GETTERS AND SETTERS -----
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	

	
	
}
