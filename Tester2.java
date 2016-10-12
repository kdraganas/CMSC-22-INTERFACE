//package pack;
import java.util.*;
public class Tester2{
	public static void main(String args[]){
		GeometricObject m1 = new Circle(100);
		System.out.println(m1);

		ResizableCircle c1 = new ResizableCircle(50);
		System.out.println(c1);		
		c1.resize(10);
		System.out.println(c1);		

		Circle rc = (Circle) c1;
		System.out.println(rc);
	}
}