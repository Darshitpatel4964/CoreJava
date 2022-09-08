package corejava;

/**
 * Write a program of Static method.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

class Professor {
    int rollno;
    String name;
    static String college = "ITS";

    // Static method to change the value of static variable
    static void change() {
        college = "BBDIT";
    }

    // Constructor to initialize the variable
    Professor(int rno, String nm) {
        rollno = rno;
        name = nm;
    }

    // Method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

//Test class to create and display the values of object  
public class StaticMethod {

    public static void main(String args[]) {
        Professor.change(); // Calling change method
        // Creating objects
        Professor professorOne = new Professor(111, "Karan");
        Professor professorTwo = new Professor(222, "Aryan");
        Professor professorThree = new Professor(333, "Sonoo");
        // Calling display method
        professorOne.display();
        professorTwo.display();
        professorThree.display();
    }

}