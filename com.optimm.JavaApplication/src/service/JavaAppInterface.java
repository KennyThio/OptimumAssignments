package service;

import pojo.User;

public interface JavaAppInterface {
	
	void setRegEmail(User refUser, String email);
	void setRegPass(User refUser, String password);
	void setRegSecure(User refUser, String secureKey);
	void getEmail(User refUser);
	void getPass(User refUser);
	void getSkey(User refUser);
	//void userLogin();
	//void userForgetPass(User refUser);
	//void useBankApp();
	void userLogout();
	boolean validatePass(User refUser);
	
}
