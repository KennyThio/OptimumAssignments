package service;

import dao.UserDAO;
import pojo.User;

public class ApplicationService implements JavaAppInterface {

	private String email;
	private String password;
	private String securityKey;
	
	UserDAO refUserDAO;
	
	@Override
	public void setRegEmail(User refUser, String email) {
		// TODO Auto-generated method stub
		this.email = email;
		refUser.setEmailAddress(email); 
	}
	
	@Override
	public void setRegPass(User refUser, String password) {
		// TODO Auto-generated method stub
		this.password = password;
		refUser.setPassword(password);
	}
	@Override
	public void setRegSecure(User refUser, String secureKey) {
		// TODO Auto-generated method stub
		this.securityKey = secureKey;
		refUser.setSecurityKey(secureKey);
	}
	

	@Override
	public void userLogout() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getEmail(User refUser) {
		// TODO Auto-generated method stub
		
		email = refUser.getEmailAddress();
		
	}

	@Override
	public void getPass(User refUser) {
		// TODO Auto-generated method stub
		password = refUser.getPassword();
	}

	@Override
	public void getSkey(User refUser) {
		// TODO Auto-generated method stub
		securityKey = refUser.getSecurityKey();
	}

	@Override
	public boolean validatePass(User refUser) {
		// TODO Auto-generated method stub
		refUserDAO = new UserDAO();
		return(refUserDAO.getValidatePass(refUser));
	}
	

	
}
