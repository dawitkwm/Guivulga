package com.codebus.dao;

import com.codebus.domain.UserCredentials;

public interface UserCredentialsDao extends GenericDao<UserCredentials> {
  
	public UserCredentials findByUserName(String userName);
}
