package corejava;

/* Base class Person */
class Person {
	void message() {
		System.out.println("This is person class");
	}
}

/* Subclass Student */
class DepartMent extends Person {
	void message() {
		System.out.println("This is DepartMent class");
	}

	// Note that display() is only in Student class
	void display() {
		// will invoke or call current class message() method
		message();

		// will invoke or call parent class message() method
		super.message();
	}
}

/* Driver program to test */
class SuperMethod {
	public static void main(String args[]) {
		DepartMent d = new DepartMent();

		// calling display() of Student
		d.display();
	}
}