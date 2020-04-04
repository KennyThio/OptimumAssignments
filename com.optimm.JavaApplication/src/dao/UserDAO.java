package dao;

import pojo.User;
import service.JavaAppInterface;

public class UserDAO {

	private boolean passStatus;
	
	//validates the user password for login
	public boolean getValidatePass(User refUser)
	{
		if(!(refUser.getPassword()).equals("abc123"))
		{
			passStatus = false;
		}
		else
		{
			passStatus = true;
		}
		
		
		return passStatus;
	}
	
}
