package corejava;

/**
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class ThrowException {
	// function to check if person is eligible to vote or not
	public static void validate(int age) {

		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote");
		}

		else {
			System.out.println("Person Is Eligible to vote");

		}
	}

	
	public static void main(String[] args) {
		// function calling
		validate(15);
		System.out.println("Rest Of Code");
	}

}
