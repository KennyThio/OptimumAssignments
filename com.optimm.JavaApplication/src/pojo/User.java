package pojo;

public class User {
	
	private String emailAddress;
	private String password;
	private String securityKey;
	private static int amount=100;
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {

		this.amount = amount;
		
	}
	public String getEmailAddress() {
		//System.out.println(emailAddress);
		return this.emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurityKey() {
		return securityKey;
	}
	public void setSecurityKey(String securityKey) {
		this.securityKey = securityKey;
	}
	

}
