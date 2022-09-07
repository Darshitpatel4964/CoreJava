package corejava;

/**
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

class One {
	void print_a() {
		System.out.println("Print A");
	}
}

//class Inherit the other Class is call single Inheritance
class Two extends One {
	void print_b() {
		System.out.println("Print B");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {

		Two t = new Two();
		t.print_a();
		t.print_b();
	}
}
