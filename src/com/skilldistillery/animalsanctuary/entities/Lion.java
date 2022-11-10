package com.skilldistillery.animalsanctuary.entities;

public class Lion extends Carnivore {
	
	public Lion () {}
	
	public Lion (String name) {
		super(name);
	}
	
	public Animal eat (Animal food) {
		
		System.out.println(getName() + " just ate the " + (food.getClass().getSimpleName()));
		return null;
	}
	
	public void makeNoise () {
		System.out.println("Roaaaar!!!");
	}
}
