package assignment1;


//Abstract top class
abstract class animal implements soundMaker {
	
	static int numberOfAnimals = 0;
	protected String name;
	
	public animal() {
		numberOfAnimals++;
		System.out.println("Animal constructor called");
		name = "Unknown animal";
	}
	public animal(String name) {
		this.name = name;
		numberOfAnimals++;
		System.out.println("Animal constructor with name called");
	}
	
	protected abstract String getAnimalType();
	
	public static int getNumberOfAnimals() {
		return numberOfAnimals;
	}
	
	public void makeSound() {
		
		System.out.println(name + " sound");
	}
	
}