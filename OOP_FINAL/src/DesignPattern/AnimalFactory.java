package DesignPattern;

public class AnimalFactory {
	
	public static  AnimalFP createAnimal(String type) {
		
		if(type.equalsIgnoreCase("Dog")) {
			return new DogFP();
		}
		if(type.equalsIgnoreCase("Cat")) {
			return new CatFP();
		}

	return null;

}
	
}
