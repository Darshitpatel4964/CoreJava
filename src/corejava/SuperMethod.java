package corejava;

/**
 * Write a program to demonstrate the super method.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

// Base class Person 
class Person {
    void message() {
        System.out.println("This is person class");
    }
}

// Subclass Department 
class DepartMent extends Person {
    void message() {
        System.out.println("This is DepartMent class");
    }

    // Note that display() is only in Student class
    void display() {
        // Will invoke or call current class message() method
        message();

        // Will invoke or call parent class message() method
        super.message();
    }
}


class SuperMethod {

    public static void main(String args[]) {
        DepartMent department = new DepartMent();

        // Calling display() of Student
        department.display();
    }

}