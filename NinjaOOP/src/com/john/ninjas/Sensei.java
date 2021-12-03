package com.john.ninjas;

public class Sensei extends SuperNinja implements Knowledgeable {

	public Sensei(String name, int powerLevel, String weapon) {
		super(name, powerLevel, weapon);
	}
	
	@Override
	public String sayWisdom() {
		return "you are awesome!";
	}

}
