/**
 * Write a program of method overriding bcz this call the reference varible of superclass.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

class Bank {
	
    float getRateOfInterest() {
        return 0f;
    }
    
}

class Sbi extends Bank {
	
    float getRateOfInterest() {
        return 8.0f;
    }
    
}

class Icici extends Bank {
	
    float getRateOfInterest() {
        return 7.9f;
    }
    
}

class Amco extends Bank {
	
    float getRateOfInterest() {
        return 8.9f;
    }
    
}

public class MethodOverriding {

    public static void main(String[] args) {

        Bank bankInterest; // Reference Variable Of Superclass
        bankInterest = new Sbi();
        System.out.println("SBI Bank Interest Is" + bankInterest.getRateOfInterest());
        bankInterest = new Icici();
        System.out.println("ICICI Bank Interest Is" + bankInterest.getRateOfInterest());
        bankInterest = new Amco();
        System.out.println("AMCO Bank Interest Is" + bankInterest.getRateOfInterest());
    }

}
