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
		
		
	}

}
