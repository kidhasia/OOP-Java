package DesignPattern;

import java.util.Scanner;

public class ShapeMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter shape type: (Circle | Rectangle): ");
		String shapeType = scanner.next();
		
		ShapeFP shape = ShapeFactory.createShape(shapeType);
		
		if(shape != null) {
			shape.draw();
			shape.calculateArea();
			}
		
	
	
	
	
	}

}
