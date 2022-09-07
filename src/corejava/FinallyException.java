package corejava;

/**
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

class FinallyException {
	public static void main(String args[]) {
		try {
			// below code not throw exception
			int data = 30 / 5;
			System.out.println(data);
		}
		// catch don't be executed
		catch (NullPointerException e) {
			System.out.println(e);
		}
		// executed the  exception occurred or not
		finally {
			System.out.println("finally block is executed");
		}

		System.out.println("rest of phe code...");
	}
}
