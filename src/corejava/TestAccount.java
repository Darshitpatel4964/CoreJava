package corejava;

/**
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

//A Java class to test the encapsulated class Account.  
public class TestAccount {

	public static void main(String[] args) {

		// creating instance of Account class
		Account a = new Account();

		// setting values of setter methods
		a.setAcc_no(123456789L);
		a.setName("Darshit Patel");
		a.setEmail("darshitpatel123@gmail.com");

		// getting values of getter methods
		System.out.println(a.getAcc_no() + " " + a.getName() + " " + a.getEmail());

	}

}
