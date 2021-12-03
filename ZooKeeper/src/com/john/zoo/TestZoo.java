package com.john.zoo;

public class TestZoo {

	public static void main(String[] args) {
//		System.out.println("hello");
		
		Mammal x = new Mammal();
		x.displayEnergy();
		
		Gorilla coco = new Gorilla("Coco");
		System.out.println(coco.getName());
		coco.displayEnergy();
		coco.throwSomething();
		coco.throwSomething();
		coco.throwSomething();
		coco.throwSomething();
		coco.displayEnergy();
		
		coco.eatBanana(7);
		coco.eatBanana(7);
		coco.displayEnergy();
		
		System.out.println("-------");
		Bat b = new Bat(20);
		b.displayEnergy();
		b.fly();
		b.displayEnergy();
	}

}
