package com.inheritance;

public class AnimalHierarchy {
	    String name;
	    int age;

	    public AnimalHierarchy(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void makeSound() {
	        System.out.println("Some generic animal sound");
	    }
	}

	class Dog extends AnimalHierarchy {
	    public Dog(String name, int age) {
	        super(name, age);
	    }

	    @Override
	    public void makeSound() {
	        System.out.println(name + " says: Woof! Woof!");
	    }
	}

	class Cat extends AnimalHierarchy {
	    public Cat(String name, int age) {
	        super(name, age);
	    }

	    @Override
	    public void makeSound() {
	        System.out.println(name + " says: Meow!");
	    }
	}

	class Bird extends AnimalHierarchy {
	    public Bird(String name, int age) {
	        super(name, age);
	    }

	    @Override
	    public void makeSound() {
	        System.out.println(name + " says: Tweet!");
	    }
	}
