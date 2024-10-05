package assignment1;


public class Mammal extends animal {
	static int numberOfMammals = 0;
	
	
	public Mammal() { //Instantiates a Mammal with no name
		super();
		numberOfMammals++;
		System.out.println("Mammal constructor called");
		
	}

	public Mammal(String name) { //Instantiates a Mammal with a name
		super(name);
		numberOfMammals++;
		System.out.println("Mammal constructor with name called");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() { //Prints the sound a Mammal makes
		System.out.println("Mammal sound");
		// TODO Auto-generated method stub
	}

	@Override
	protected String getAnimalType() { //return the type "Mammal"
		return "Mammal";
	}
	
	protected static int getNumberOfMammals() { //return the total amount of mammals
		return numberOfMammals;
	}

}
