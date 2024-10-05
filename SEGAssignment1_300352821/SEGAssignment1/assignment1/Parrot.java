package assignment1;

class Parrot extends Bird  {

	public Parrot() { //Instantiate a Parrot with no name
		super();
		System.out.println("Parrot constructor called");
	}

	
	public Parrot(String name) { //Instantiate a Parrot with a name
		super(name);
		System.out.println("Parrot constructor with name called");
	}
	
	public void makeSound() { //Make parrot sound
		System.out.println("Squawk");
		
	}
	
	protected String getAnimalType() { //Return type "Parrot"
		return "Parrot";
	}

}
