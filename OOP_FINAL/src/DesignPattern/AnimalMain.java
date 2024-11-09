package DesignPattern;

public class AnimalMain {

	public static void main(String[] args) {
		
		//Creating an object for AnimalFactory
		AnimalFactory af = new AnimalFactory();		
		
		AnimalFP animal1 = AnimalFactory.createAnimal("Cat");
		animal1.eat();
		
		
	}
}
