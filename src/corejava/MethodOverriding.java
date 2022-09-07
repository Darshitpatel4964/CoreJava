package corejava;

/**
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

class Bank {
	float getRateOfInterest() {
		return 0;

	}
}

class SBI extends Bank {
	float getRateOfInterest() {
		return 8.0f;

	}
}

class ICICI extends Bank {
	float getRateOfInterest() {
		return 7.9f;

	}
}

class AMCO extends Bank {
	float getRateOfInterest() {
		return 8.9f;

	}
}

public class MethodOverriding {
	public static void main(String[] args) {

		Bank b;// reference Variable Of Superclass
		b = new SBI();
		System.out.println("SBI Bank Interest Is" + b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI Bank Interest Is" + b.getRateOfInterest());
		b = new AMCO();
		System.out.println("AMCO Bank Interest Is" + b.getRateOfInterest());
	}

}
