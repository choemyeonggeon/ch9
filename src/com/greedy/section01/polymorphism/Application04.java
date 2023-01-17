package com.greedy.section01.polymorphism;

public class Application04 {

	public static void main(String[] args) {
		
		Application04 app4 = new Application04();
		Animal randomAnimal = app4.getRandomAnimal();
		randomAnimal.cry();

		
	}

	public Animal getRandomAnimal() {
		
		int random = (int) (Math.random()*2);
		
		return random == 0? new Rabbit(): new Tiger();
		
	}
}
