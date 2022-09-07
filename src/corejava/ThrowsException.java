package corejava;

/**
@author Darshit Patel
@version 1.01 2022-09-07
*/

import java.io.IOException;

public class ThrowsException {

	void m() throws IOException {
		throw new IOException("error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		ThrowsException obj = new ThrowsException();
		obj.p();
		System.out.println("normal exception");
	}

}
