package corejava;

public class StringMethod {

	public static void main(String[] args) {

		String s = "Darshit";
		String s1 = "Patel";
		String s2 = "Darshit";

		// print String s char index
		System.out.println(s.charAt(0));
		// print String s1 char index
		System.out.println(s1.charAt(0));

		// Concatenating one string
		String s3 = s.concat(s1);
		System.out.println(s3);

		// String is equal or not
		System.out.println(s.equals(s2)); // true because content and case is same
		System.out.println(s2.equals(s3));// false because case is not same

	}

}
