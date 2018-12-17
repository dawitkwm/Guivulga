package com.codebus.dao;

import com.codebus.domain.User;

public interface UserDao extends GenericDao<User> {
      
	public User findByEmail(String email);
}
