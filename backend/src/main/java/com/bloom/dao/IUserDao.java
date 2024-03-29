package com.bloom.dao;

import java.util.List;

import com.bloom.model.User;

public interface IUserDao {
	List<User> getAllUser();

	User getUserByNum(long num);

	int createUser(User user);

	int updateEntered(User user);

	int obtainAuth(long num);

	int updateUser(User user);

	int loseAuth(long num);
}
