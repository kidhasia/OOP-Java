package OOP_FINAL;

//Abstract class creation								
abstract class Animal{
	
	//Abstract class contains of Abstract method and Concrete methods
	
	//Abstract methods don't have any implementations
	abstract void sound();
	
	//Concrete methods have implementations 
	void sleep() {
		System.out.println("Sleep...");
	}
	
}


	class Dog extends Animal{
		
		void sound() {
			System.out.println("Bark! ");
		}
		
	}


public class AbstractClasses {
	
		public static void main (String [] args) {
			
			//Object creation syntax : Class_name Object_name = new Class_name();
			Dog d1 = new Dog();
			Dog d2 = new Dog();
			Dog d3 = new Dog();
			
			
			d1.sleep();
			d1.sound();
			
			d2.sleep();
			d2.sound();
			
			d3.sleep();
			d3.sound();
			
			
			
			
			
			
		}

}
