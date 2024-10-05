package assignment1;

class Dog extends Mammal {

	public Dog() { //Instantiate a Dog with no name
		super();
		System.out.println("Dog constructor called");
	}

	public Dog(String name) {//Instantiate a Dog with a name
		super(name);
		System.out.println("Dog constructor with name called");
	}
	
	public void makeSound() { //Barks
		System.out.println("Woof");
	}
	
	protected String getAnimalType() {//Returns type "Dog"
		return "Dog";
	}

}
