package DesignPattern;

public class RectangleFP implements ShapeFP {

	double a=0;
	double b=0;

	public RectangleFP(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void draw() {
		System.out.println("This is a Rectangle!");
	}

	@Override
	public double calculateArea() {
		double a = 0,b =0;
		return a*b;
	}

}
