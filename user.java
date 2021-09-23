package signin;

public class user {
		
	private int userId;
	private String username;
	private String firstname;
	private String lastname;
	private String emailId;
	private int phoneNo;

	public void setUserId(int userId) {
		this.userId = userId;
		
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	public void setLastName(String lastname) {
		this.lastname =lastname;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getUserId() {
		return this.userId;
		
	}
	public String getUserName() {
		return this.username;
		}
	public String getFirstName() {
		return this.firstname;
		
	}
	public String getLastName() {
		return this.lastname;
	
	}	
	public String getemailId() {
		return this.emailId;
	
	}
	public int getphoneNo() {
		return this.phoneNo;
	
	}
	}		



