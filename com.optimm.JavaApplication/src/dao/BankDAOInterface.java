package dao;

import pojo.User;

public interface BankDAOInterface {
	void checkAccount(User refUser);
	void deposit(User refUser);
	void withdraw(User refUser);

}
