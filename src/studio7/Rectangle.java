package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {//constructor initializes instance variables
		this.length = length;
		this.width = width;
		
	}
	
	public double computeArea() {
		return this.length * this.width;
	}
	
	public double computePerimeter() {
		return 2 * this.length + 2 * this.width;
	}
	
	public boolean isSquare() {
		return this.length == this.width;
	}
	
	public boolean isSmaller(Rectangle other) {
		return this.computeArea() < other.computeArea();
	}
	
	
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setLength(double length) {
		//can even include if-statement here for more control
		this.length = length;
	}
	
	public String toString() {
		return "length: " + this.length + ", width: " + this.width;
	}
	
}
