//package pack;
import java.util.*;
public class Tester{
	public static void main(String args[]){
		Movable m1 = new MovablePoint(5, 6, 10, 2);
		System.out.println(m1); 
		m1.moveLeft();
		System.out.println(m1);
		   
		Movable m2 = new MovableCircle(2, 1, 2, 20, 5);
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);

		Movable m3 = new MovableRectangle(2, 3, 4, 5, 4, 2);
		System.out.println(m3);
		m3.moveRight();
		System.out.println(m3);
	}
}