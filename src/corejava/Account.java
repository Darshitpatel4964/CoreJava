package corejava;

/**
 * Write a program to demonstrate encapsulation for bank account. 
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class Account {

    // Private Data member
    private Long accountNo;
    private String name;
    private String email;

    // Generate Getter And Setter Method
    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}