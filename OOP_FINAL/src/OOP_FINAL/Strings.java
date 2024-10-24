package OOP_FINAL;

public class Strings {
	
	public static void main (String args []) {
		
	//String literal
		String str = "Ah patiyoooo!";		
		System.out.println(str);
	
	//Using array of characters
		char [] charArrayName = {'H','E', 'L', 'L','O'};	
		
		String StringObject = new String(charArrayName);
		System.out.println(StringObject );
		
		
		//Printing using a For Loop
		for(int i =0; i< charArrayName.length; i++) {
			System.out.println(charArrayName[i]);
		}
		
	
	}
}
