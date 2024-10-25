package OOP_FINAL;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap();
		
		//Putting value to studentMap
	for(int i=0; i<10; i++) {
		studentMap.put(i, "Student "+i);
	}
	
	//Displaying content 
	
	for(int i=0; i<studentMap.size(); i++) {
		
		System.out.println("ID :" +i +", Name: "+studentMap.get(i) );
		
	}
	
	

	
	
	
	
	
	
	
	}
	
	
	
	}

