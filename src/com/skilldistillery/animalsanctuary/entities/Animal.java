package com.skilldistillery.animalsanctuary.entities;

public abstract class Animal {
	private String name;
	
	public Animal () {}
	
	public Animal (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat (int num) {
		System.out.println(getClass().getSimpleName() + " eats " + num + " pounds of food!");
	}
	
	public void makeNoise () {
	}
}
