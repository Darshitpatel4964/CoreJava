package corejava;

/**
 * Write a program to demonstrate the super constructor.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

// Superclass Bike 
class Bike {
    Bike() {
        System.out.println("Bike Is Created");
    }
}

// Subclass Honda extending the Bike class 
class Honda extends Bike {
    Honda() {
        super();
        System.out.println("Honda Is Created");
    }

}

// Driver program to SuperConstructor 
public class SuperConstructor {

    public static void main(String[] args) {
        Honda honda = new Honda();
    }

}
