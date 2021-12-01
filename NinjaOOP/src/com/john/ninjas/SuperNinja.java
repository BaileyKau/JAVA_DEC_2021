package com.john.ninjas;

public class SuperNinja extends Ninja {
//	member variables
	private String weapon;
	
//	CONSTRUCTOR(s) ----------
	public SuperNinja(String name, int powerLevel, String weapon) {
		super(name, powerLevel);
		setWeapon(weapon);
	}
	

//	----- GETTERS AND SETTERS ------
	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	

}
