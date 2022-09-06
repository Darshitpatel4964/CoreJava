package corejava;

public class ContinueStatement {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				// using continue statement
				continue;// it will skip the rest statement
			}

			System.out.println(i);
		}
	}

}
