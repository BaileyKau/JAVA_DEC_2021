package com.john.ninjas;

public class Ninja {
	
//	member variables
    private String name;
    private int health;
    private int power;
    
    // constructor ------------------
    public Ninja() {
        // this.name = "no name";
        setName("no name");
        // this.health = 100;
        setHealth(100);
    }
    public Ninja(String name, int powerLevel){
        this.name = name;
        this.health = 100;
        setPower(powerLevel);
        
    }
    
//    ------ METHODS ----
    public void displayStats(){
        System.out.println("Name: " + this.getName());
        System.out.println("Health:" + this.getHealth());
        System.out.println("Power:" + this.getPower() + "\n");
    }

    public void eatStrawberry(){
        this.health += 10;
    }
    
    public void attack(Ninja anotherNinja) {
    	anotherNinja.setHealth(anotherNinja.getHealth() - 10);
    	System.out.println(anotherNinja.getName() + " lost 10 hp by " + this.getName());
    }
    
    
//    ----- GETTERS AND SETTERS -----

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
    
    
    
    
}
