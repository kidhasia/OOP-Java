package OOP_FINAL;

import java.util.ArrayList;

public class CollectionsLab {
	public static void main(String[] args) {
		
		//Exercise 01
		int sum=0;
		ArrayList <Integer> numbers = new ArrayList();
		
		if(numbers.isEmpty()) {
			for(int i =0; i< 10; i++) {
				numbers.add(i);
				sum += numbers.get(i);
			}
			System.out.println("Number of indexes: "+numbers.size());
			System.out.println("Total of array give is: "+ sum);
			
		}
		else {
			System.out.println("Array is Full!");
		}
		
		
		
		
		
	}

}
