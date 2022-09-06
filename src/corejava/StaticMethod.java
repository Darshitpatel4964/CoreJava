package corejava;

class Professor {
	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable
	static void change() {
		college = "BBDIT";
	}

	// constructor to initialize the variable
	Professor(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

//Test class to create and display the values of object  
public class StaticMethod {
	public static void main(String args[]) {
		Professor.change();// calling change method
		// creating objects
		Professor p1 = new Professor(111, "Karan");
		Professor p2 = new Professor(222, "Aryan");
		Professor p3 = new Professor(333, "Sonoo");
		// calling display method
		p1.display();
		p2.display();
		p3.display();
	}
}