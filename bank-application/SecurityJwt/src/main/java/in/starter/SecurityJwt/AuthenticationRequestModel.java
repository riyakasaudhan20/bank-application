package in.starter.SecurityJwt;

public class AuthenticationRequestModel {
	
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public AuthenticationRequestModel() {
	
	}
	public AuthenticationRequestModel(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}
	
	
	
	
	
	
}
