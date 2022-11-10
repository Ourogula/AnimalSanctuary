package com.skilldistillery.animalsanctuary.entities;

public abstract class Carnivore extends Animal {
	
	public Carnivore () {}
	
	public Carnivore (String name) {
		super(name);
	}
	
	public abstract Animal eat (Animal food);
}
