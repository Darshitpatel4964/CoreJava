package corejava;

public class Employee {

	int id;
	String name;

	// creating a parameterized constructor
	Employee(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the value of id and name
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects
		Employee e1 = new Employee(1, "Darshit");
		Employee e2 = new Employee(2, "Jay");
		// displaying values of the object
		e1.display();
		e2.display();
	}

}
