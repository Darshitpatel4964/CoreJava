/**
 * Write a program to demonstrate the example of Parameterized constructor . 
 * (E.g. Pass two integer parameters and apply any mathematical formula)..
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class Employee {

    int id;
    String name;

    // Creating a parameterized constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display the value of id and name
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        // Creating objects
        Employee employee = new Employee(1, "Darshit");
        Employee employeedata = new Employee(2, "Jay");
        // Displaying values of the object
        employee.display();
        employeedata.display();
    }

}
