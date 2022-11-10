package com.skilldistillery.animalsanctuary.entities;

import java.util.List;

public class Attendant {
	
	public Attendant () {}
	
	public void feedAnimal (Animal animal, int amount) {
		animal.eat(amount);
	}
	
	public void feedAnimal (Animal animal, Animal food) {
		((Carnivore)animal).eat(food);
	}
	
	public void doRounds (List<Animal> animalList) {
		
		//
		
	}
	
}
