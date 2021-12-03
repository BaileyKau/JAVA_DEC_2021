package com.john.zoo;

public class Bat extends Mammal {
	
//	constructor
	public Bat(int batEnergy) {
		super(batEnergy);
	}
	
//  methods
	public void fly() {
		System.out.println("fly!!!!");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
		
	}

}
