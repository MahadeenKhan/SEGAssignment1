package assignment1;


class Bird extends animal {
	static int numberOfBirds = 0;

	public Bird() { //Instantiate a Bird with no name
		super();
		numberOfBirds++;
		System.out.println("Bird constructor called");
	}

	public Bird(String name) { //Instantiate a Bird with a name
		super(name);
		numberOfBirds++;
		System.out.println("Bird constructor with name called");
		}

	@Override
	public void makeSound() { //Make bird sound
		System.out.println("Bird sound");
	}

	@Override
	protected String getAnimalType() { //return type "Bird"
		// TODO Auto-generated method stub
		return "Bird";
	}
	
	protected static int getNumberOfBirds() {//returns total amount of birds
		return numberOfBirds;
	}
}
