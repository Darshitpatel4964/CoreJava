package corejava;

/**
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class TryCatchException {

	public static void main(String[] args) {
		try {
			int data = 60 / 0; // throw exception
		}

		// Handling Exception
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}

		System.out.println("Rest Of Code");
	}

}
