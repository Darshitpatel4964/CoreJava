package corejava;

public class ForLoop {
	public static void main(String[] args) {

		int i;
		int j;
		int row = 5;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
