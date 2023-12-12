package com.Bird;

public class BirdApp {
	public static void main(String[] args) {
		Eagle eg = new Eagle();
		Sparrow sp = new Sparrow();
		
		eg.name="Eagle";
		eg.color="Brown";
		sp.name="Sparrow";
		sp.color="Pink";
		
		eg.eat();
		eg.fly();
		eg.hunt();
		System.out.println("-----------------------------------");
		sp.eat();
		sp.fly();
		sp.buildNest();
		System.out.println("-----------------------------------");
	}

}
