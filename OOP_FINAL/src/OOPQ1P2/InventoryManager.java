package OOPQ1P2;

 class GenericInventory{
	
	public <T extends Number> void calculateAverage(T numbArray []) {
		
		//Method for calculate the total
		
		double total = 0.0;
		
		for(T element : numbArray) {
			total = total+ element.doubleValue();
		}
		double average = total / numbArray.length;
		
		
	}
	
	public <T extends Number> void calculateMax(T [] numbArray) {
		
		double min = numbArray[0].doubleValue();
		
		for(T element: numbArray) {
			if(min>element.doubleValue()) {
				System.out.println("Minimum number is: "+min);
			}
			
		}
		
		
		
	}
}

public class InventoryManager{
	public static void main(String[] args) {
		
		
	}
}