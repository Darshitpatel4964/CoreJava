package corejava;

/**
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

//Account class and TestAccount class is a encapsulation Example

public class Account {

	// private Data member
	private Long acc_no;
	private String name;
	private String email;

	// Generate Getter And Setter Method
	public Long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(Long acc_no) {
		this.acc_no = acc_no;
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
