package com.skilldistillery.animalsanctuary.entities;

public class Elephant extends Herbivore {
	public Elephant () {}
	
	public Elephant (String name) {
		super(name);
	}
	
	public void makeNoise () {
		System.out.println("Trumpets!!!");
	}
}
