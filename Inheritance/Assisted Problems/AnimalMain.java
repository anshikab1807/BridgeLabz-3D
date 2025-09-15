package com.inheritance;

	public class AnimalMain {
	    public static void main(String[] args) {
	        AnimalHierarchy dog = new Dog("tommy", 4);
	        AnimalHierarchy cat = new Cat("toto", 2);
	        AnimalHierarchy bird = new Bird("oreo", 1);

	        dog.makeSound();
	        cat.makeSound();
	        bird.makeSound(); 
	    }
}
