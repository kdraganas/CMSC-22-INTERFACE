//package pack;

public class Circle implements GeometricObject{
	protected double radius;
	public Circle(){
		radius = 1.0;
	}
	public Circle(double radius){
		setRadius(radius);
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getPerimeter(){
		return ((2*3.14159265359) * radius);
	}
	public double getArea(){
		return ((radius*radius) * 3.14159265359);
	}
	public String toString(){
		return "A Circle with a radius of " + radius + " has a perimeter and area of " + getPerimeter() + " and " + getArea() + " respectively.";
	}
}