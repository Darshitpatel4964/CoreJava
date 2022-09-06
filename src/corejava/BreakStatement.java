package corejava;

public class BreakStatement {
	public static void main(String[] args) {

		// using for loop
		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				break; // breaking for loop
			}

			System.out.println(i);
		}
	}

}
