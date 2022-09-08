package corejava;

/**
 * Write a abstraction program to find shape of circle.
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
        Shape shape;
        shape = new Circle(); // Object is provided through method
        shape.draw();
    }

}
