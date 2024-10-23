package OOP_FINAL;


interface Mamals{
	
	//Abstract methods --> can override by inheritance 
	void sound();
	void sleep();
	void eat();
	
	//Default methods (Also have an implementation)  --> can override by inheritance 
	default void info(){
		
		System.out.print("Animal name is ....");
	}
	
	
	//Static methods  (Also have an implementation)  --> CANNOT override by inheritance 
	static void Eat() {
			System.out.println("I eat ...");
	}
	
}

  class Cat implements Mamals{
	 
	
	  public void sleep() {
	        System.out.println("Sleeping...");
	    }

	    public void eat() {
	        System.out.println("Eating...");
	    }

	    public void sound() {
	        System.out.println("Meow");
	    }
	    
	    public void info() {
	    	System.out.println("This is a cat");
	    }
	    
	   
		
 }

//Main classs
public class Interfaces {
	
	public static void main (String args[]) {
		
		Cat c1 =  new Cat();
		Cat c2 =  new Cat();
		Cat c3 =  new Cat();
		
		
		c1.info();
		c1.sleep();
		c1.sound();
		
		System.out.println();
		
		c2.info();
		c2.sleep();
		c2.sound();
		
		System.out.println();
		
		c3.info();
		c3.sleep();
		c3.sound();
		
	}

}
