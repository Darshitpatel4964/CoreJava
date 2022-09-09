/**
 * Write a program of this keyword.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

class Doctor {
	
    int id;
    String name;
    float fee;
    
    // Constructor
    Doctor(int id, String name, float fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(id + " " + name + " " + fee);
    }
    
}

class ThisKeyword {
    
	public static void main(String args[]) {
        Doctor doctorOneDetails = new Doctor(1, "Ankit", 500f);
        Doctor doctorTwoDetails = new Doctor(2, "Sumit", 600f);
        doctorOneDetails.display();
        doctorTwoDetails.display();
    }
	
}