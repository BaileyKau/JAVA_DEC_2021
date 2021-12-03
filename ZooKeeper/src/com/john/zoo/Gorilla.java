package com.john.zoo;

public class Gorilla extends Mammal {
	
//	member variables
	private String name;
	
//	constructor
	public Gorilla(String name) {
		this.setEnergyLevel(150);
		this.setName(name);
	}
	
//	methods
	public void throwSomething() {
		this.setEnergyLevel(this.getEnergyLevel() - 10);
		System.out.println("threw something and lost 10 hp");
		System.out.println("now you have :" + this.getEnergyLevel());
	}
	
	public void eatBanana(int hp) {
		this.setEnergyLevel(this.getEnergyLevel() + hp);
		System.out.println("we got back " + hp + " and now we have : " + this.getEnergyLevel() + " hp");
	}

	
//	--- GETTERS AND SETTERS ---
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

}
