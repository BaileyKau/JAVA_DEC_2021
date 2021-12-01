package com.john.ninjas;

public class TestNinja {

	public static void main(String[] args) {
//		System.out.println("hello!!!");
		
		Ninja kenshiro = new Ninja("Kenshiro", 100);
		kenshiro.displayStats();
		
		SuperNinja goku = new SuperNinja("Goku", 9001, "hands");
		goku.displayStats();
		
		goku.attack(kenshiro);
		kenshiro.displayStats();

	}

}
