package OOP_FINAL;

import java.util.ArrayList;


public class Collections {
	public static void main (String args []) {
		
		ArrayList <String> fruits =  new ArrayList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add(1,"Papaya");
		
		
		
		for(int i =0; i<fruits.size(); i++) {
			//In array list you cannot use .length only in arrays
			
			System.out.println(fruits.get(i));
		}
		System.out.println("Size of this array: "+fruits.size());
		
		
		//Integer array
		int sum =0;
		
		ArrayList <Integer> numbers = new ArrayList();
		for(int i=0; i<=10; i++) {
			numbers.add(i);
			sum = numbers.get(i)+sum;
		}
		System.out.println("Total is: "+ sum);
		
		//Convert ArrayList to an Array
		
		ArrayList <Integer> convertIntoArray = new ArrayList();
		for(int i =0; i<10; i++) {
			convertIntoArray.add(i);
		}
		
		int alSize = convertIntoArray.size()	;
		
		System.out.println(alSize);
		
		//Create an Array
		
		Integer [] newArray = new Integer[alSize];
		
		newArray = convertIntoArray.toArray(newArray);
		
		for(Integer number : newArray) {
			 System.out.print(number + " ");
		}
		System.out.println();
		
		
		//Creating an array list and converting it into a array
		
		ArrayList<String> Animals = new ArrayList();
		Animals.add("Lion");
		Animals.add("Tiger");
		Animals.add("Cat");
		Animals.add("Dog");
		
		for(int i =0; i<Animals.size(); i++) {
			System.out.println(Animals.get(i));
		}
		
		String [] conArray = new String[Animals.size()];
		
		conArray = Animals.toArray(conArray);
		//New_array_name = ArraListName.toarray(new_array_name);
		
		
		//Using for each to display outputs
		System.out.println();
		for(String animal: Animals) {
		
			System.out.println(animal);
			
			System.out.println();
		}
		
		//syntax: For(data_type element: Array/ArralyList_name)
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
