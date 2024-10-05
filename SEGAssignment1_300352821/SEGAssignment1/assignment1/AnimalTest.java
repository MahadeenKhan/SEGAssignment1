package assignment1;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		//Generate lissts
		ArrayList<animal> animals = new ArrayList<animal>(4);
		ArrayList<Bird> birds = new ArrayList<Bird>(4);
		ArrayList<Mammal> mammals = new ArrayList<Mammal>(4);
		ArrayList<Dog> dogs = new ArrayList<Dog>(4);
		ArrayList<Parrot> parrots = new ArrayList<Parrot>(4);
		
		
		//Animal is an abstract class, I have no idea how they instantiated it in appendix 1. Adding subclasses to animal list
		
		animals.add(new Bird());
		animals.add(new Mammal());
		animals.add(new Parrot("Dante"));
		animals.add(new Dog("Hugo"));  
		
		
		//Making sound for each object in list
		for (animal animal : animals) {
			animal.makeSound();
		}
		
		System.out.println("\n");
		
		
		//Adding to mammal list
		mammals.add(new Mammal("Hugo"));
		mammals.add(new Mammal("Chad"));
		mammals.add(new Mammal());
		mammals.add(new Mammal());
		
		for (Mammal mammal : mammals) {
			mammal.makeSound();
		}
		
		System.out.println("\n");
		
		
		//Adding to bird list
		birds.add(new Bird("Hugo"));
		birds.add(new Bird("Chad"));
		birds.add(new Bird());
		birds.add(new Bird());
		
		for (animal animal : birds) {
			animal.makeSound();
		}
		
		System.out.println("\n");
		
		//Adding to parrot list
		parrots.add(new Parrot("Hugo"));
		parrots.add(new Parrot("Chad"));
		parrots.add(new Parrot());
		parrots.add(new Parrot());
		
		for (animal animal : parrots) {
			animal.makeSound();
		}
		
		System.out.println("\n");
		
		//Adding to dog list
		dogs.add(new Dog("Hugo"));
		dogs.add(new Dog("Chad"));
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		for (animal animal : dogs) {
			animal.makeSound();
		}
		
		
		//Printing totals
		System.out.println("\n");
		System.out.println("Getting totals");
		System.out.println("Number of Animals: " + animal.getNumberOfAnimals());
		System.out.println("Number of Mammals: " + Mammal.getNumberOfMammals());
		System.out.println("Number of Birds:  " + Bird.getNumberOfBirds());
		

	}

}
