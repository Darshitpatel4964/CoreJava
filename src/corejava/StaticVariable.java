package corejava;

class Prof {
	int id;// instance variable
	String name;
	String college ="HGCE";
	
	/*
	 * static String college = "ITS";// static variable
	 */	// constructor

	/*
	 * Prof(int r, String n) { id = r; name = n; }
	 */
	Prof(int id, String name,String college) {
		this.id = id;
		this.name = name;
		this.college = college;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name + " " + college);
	}
}

//StaticVariable class to show the values of objects  
public class StaticVariable {
	public static void main(String args[]) {
		/*
		 * Prof p1 = new Prof(111, "Karan"); Prof p2 = new Prof(222, "Aryan");
		 */
		Prof p1 = new Prof(111, "Karan", "HGCE");
		Prof p2 = new Prof(222, "Aryan","HGCE");
		// we can change the college of all objects by the single line of code
		
		p1.display();
		p2.display();
	}
}
