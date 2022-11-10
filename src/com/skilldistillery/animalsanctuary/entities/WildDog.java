package com.skilldistillery.animalsanctuary.entities;

public class WildDog extends Carnivore {
	
	public WildDog () {}
	
	public WildDog (String name) {
		super(name);
	}
	
	public Animal eat (Animal food) {
		
		System.out.println(getName() + " just ate the " + (food.getClass().getSimpleName()));
		return null;
	}

	public void makeNoise () {
		System.out.println("Bark.");
	}
}
