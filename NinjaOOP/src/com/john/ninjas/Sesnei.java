package com.john.ninjas;

public class Sesnei extends SuperNinja implements Knowledgeable {

	public Sesnei(String name, int powerLevel, String weapon) {
		super(name, powerLevel, weapon);
	}
	
	@Override
	public String sayWisdom() {
		return "you are awesome!";
	}

}
