package com.skilldistillery.animalsanctuary.entities;

public class Giraffe extends Herbivore {
	
	public Giraffe () {}
	
	public Giraffe (String name) {
		super(name);
	}
	
	public void makeNoise () {
		System.out.println("Chitters!!!");
	}
}
