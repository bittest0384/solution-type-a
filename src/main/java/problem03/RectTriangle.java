package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		System.out.println("");
		return width * height / 2;
	}

	@Override
	public double getPerimeter() {
		double peri = (width * width) + (height * height);		
		return Math.sqrt(peri) + width + height;
	}
}
