//package pack;

public class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(double radius){
		super(radius);
	}
	public void resize(int percent){
		double radius = super.getRadius() + (super.getRadius()*(double)(percent))/100;
		super.setRadius(radius);
	}
}	