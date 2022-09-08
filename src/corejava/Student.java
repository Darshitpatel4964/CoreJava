package corejava;

/**
 * Write a program to demonstrate the example of  default constructor.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class Student {
    int id;
    String name;

    // Method to display the value of id and name
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        // Creating objects
        Student studentOne = new Student();
        Student studentTwo = new Student();
        // Displaying values of the object
        studentOne.display();
        studentTwo.display();
    }

}
