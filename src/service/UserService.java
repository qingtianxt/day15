package service;

import java.sql.SQLException;

import dao.UserDao;
import domain.User;

public class UserService {
/**
 * ����û����Ƿ�ռ��
 * @param username
 * @return
 * @throws SQLException 
 */
	public User CheckUsername4Ajax(String username) throws SQLException {
		return new UserDao().getUserByUsername4Ajax(username);
	}
	
}
