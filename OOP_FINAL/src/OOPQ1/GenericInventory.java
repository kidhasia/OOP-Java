package OOPQ1;

public class GenericInventory <T extends Number> {
	
	public double calculateAverage(T [] arrayNumb) {
		
		double sum= 0;
		
		for(int i=0; i<arrayNumb.length; i++) {
			sum = arrayNumb[i].doubleValue()+ sum;
		}
		double average = sum/ arrayNumb.length;
		
		return average;
		
		
	}
	
	public double calculateMinimum(T arrayNumb []) {
		double min =arrayNumb[0].doubleValue();
		
		for(int i=0; i<arrayNumb.length; i++) {
			if(min > arrayNumb[i].doubleValue()) {
				min = arrayNumb[i].doubleValue(); 
			}
		}
		return min;
	}
	
	

}



