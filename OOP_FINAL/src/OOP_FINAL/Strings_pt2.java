package OOP_FINAL;

public class Strings_pt2 {
	public static void main (String args []) {
		
		String s1= "JAVA";
		String s2= "java";
		
		String s3=new String("java");
		String s4=new String("Java");
		
		String s5=s4;
		
		System.out.println (s1 == s2);// false 
		System.out.println (s1.equals( s2)); //false - equals() compares the actual content
		System.out.println(s1.equals("JAVA"));//True - Content is different 
		System.out.println(s1.equals(s4));//False - Content is different 
		System.out.println(s5.equals(s4));//True - Assigning values at the end
		System.out.println(s5 == s5);//True - Assigning values at the end
		// == Operator does is check whether two references point of the same object
		
		String myName = "Gaveen";
		
		StringBuilder sb = new StringBuilder(myName);
		
		//Reversed characters
		sb.reverse();
		
		
		System.out.println(sb);
		System.out.println(myName);
		
		//Using append()
		
		String name = "Gaveen";
		
		StringBuilder sb2 = new StringBuilder (name);
		
		sb2.append(" Hasira");
		
		System.out.println(sb2); //Basically used for concatenate 
		
		//Using concat() 
		
		String str = "Hello";
		
		str = str.concat(" World!");
		System.out.println(str);
		//In above it makes a new string name in string class but in append() it dont build a new variable it only mutate the String
		
		//Exercise -02 
		
		//Creating a StrigBuilder object
		
		StringBuilder sb3 =  new StringBuilder("Hello");
		
		//appending the world
		sb3.append(" World!");
		 
		//delete indexes from 0-5 (Hello)
		sb3.delete(0, 5);
		
		//inserting Hi
		sb3.insert(0, "Hi");
		
		sb3.replace(0, 2, "Hello");
		
		System.out.println(sb3);
		System.out.println(sb3);
		
		
		
		
		
		
		
		
		
	}

}
