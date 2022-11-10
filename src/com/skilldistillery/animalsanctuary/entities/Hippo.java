package com.skilldistillery.animalsanctuary.entities;

public class Hippo extends Herbivore {
	public Hippo () {}
	
	public Hippo (String name) {
		super(name);
	}
	
	public void makeNoise () {
		System.out.println("Bellow!!!");
	}
}
