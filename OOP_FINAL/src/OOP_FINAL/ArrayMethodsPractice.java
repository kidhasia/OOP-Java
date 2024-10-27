package OOP_FINAL;

class array{
	
	public int calculateSum(int [] numbers) {
		
		int sum =0;
		
		for(int num: numbers) {
			
			sum += num;
		}
		
		
		return sum;
		
	}
}


public class ArrayMethodsPractice {
	

	public static void main(String[] args) {
		
		int arrayNum [] = {1,2,3,4,5};
		
		//Creating an instance for class array to use methods
		array arrayObj = new array ();
		
		//Calculate the total
		int total = arrayObj.calculateSum(arrayNum);
		
		System.out.println(total);
		
		
		
	}

}
