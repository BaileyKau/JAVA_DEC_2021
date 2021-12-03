package com.john.ninjas;

import com.john.other.OtherClass;

public class TestNinja {

	public static void main(String[] args) {
//		System.out.println("hello!!!");
		
		Ninja kenshiro = new Ninja("Kenshiro", 100);
		kenshiro.displayStats();
		
		SuperNinja goku = new SuperNinja("Goku", 9001, "hands");
		goku.displayStats();
		
		goku.attack(kenshiro);
		kenshiro.displayStats();
		
		OtherClass something = new OtherClass();
		
//		using the interface
		Sensei masterSplinter = new Sensei("Master Splinter", 150, "cane");
		String result = masterSplinter.sayWisdom();
		System.out.println(masterSplinter.getName() + " from the " + masterSplinter.getClass().getSimpleName() + " Class, says " + result );

	}

}
