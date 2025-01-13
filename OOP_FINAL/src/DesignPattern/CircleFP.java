package DesignPattern;

public class CircleFP implements ShapeFP {

	double radius = 0;
	
	
	public CircleFP(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.print("This is a Circle!");		
	}

	@Override
	public double calculateArea() {
		double area = Math.PI*radius*radius;
		System.out.print("Circle area is :"+area);
		return area;
	}

	
}
