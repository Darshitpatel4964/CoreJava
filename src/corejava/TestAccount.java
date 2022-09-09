/**
 * Write a program to demonstrate encapsulation for bank account. 
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class TestAccount {

    public static void main(String[] args) {
        // Creating instance of Account class
        Account accountDetails = new Account();

        // Setting values of setter methods
        accountDetails.setAccountNo(123456789L);
        accountDetails.setName("Darshit Patel");
        accountDetails.setEmail("darshitpatel123@gmail.com");

        // Getting values of getter methods
        System.out.println(accountDetails.getAccountNo() + " " + accountDetails.getName() + " " + accountDetails.getEmail());
    }

}
