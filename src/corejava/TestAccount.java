package corejava;

/**
 * Write a program to demonstrate encapsulation for bank account. 
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class TestAccount {

    public static void main(String[] args) {

        // Creating instance of Account class
        Account account = new Account();

        // Setting values of setter methods
        account.setAccountNo(123456789L);
        account.setName("Darshit Patel");
        account.setEmail("darshitpatel123@gmail.com");

        // Getting values of getter methods
        System.out.println(account.getAccountNo() + " " + account.getName() + " " + account.getEmail());
    }

}
