package corejava;

/**
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");
	}

	class Square extends Shape {
		void draw() {
			System.out.println("Drawing Square");
		}
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Shape s;
		s = new Circle();// object is provided through method
		s.draw();

	}

}
