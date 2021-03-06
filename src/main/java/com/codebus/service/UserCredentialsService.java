package com.codebus.service;

import java.util.List;

import com.codebus.domain.UserCredentials;
 
public interface UserCredentialsService {

	public void save(UserCredentials userCredentials);
	public UserCredentials update(UserCredentials userCredentials);
	public List<UserCredentials> findAll();
	public UserCredentials findByUserName(String userName);
 }
