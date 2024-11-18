package DesignPattern;

import java.util.Scanner;

public class ShapeFactory {
	
	public static ShapeFP createShape(String type) {
		
		Scanner sc = new Scanner(System.in);
		
		if(type.equalsIgnoreCase("Circle")){
			System.out.print("Enter radius: ");
			double r= sc.nextDouble();
			
			
			return new CircleFP(r);
			
		}
		if(type.equalsIgnoreCase("Rectangle")) {
		
			System.out.println("Enter Height: ");
			double h = sc.nextDouble();
			
			System.out.println("Enter Width: ");
			double w = sc.nextDouble();
			
			
			
			return new RectangleFP(w,h);
		}
		
		return null;
		
	}

}
