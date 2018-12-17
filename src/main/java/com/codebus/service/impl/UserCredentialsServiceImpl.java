package com.codebus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codebus.dao.GenericDao;
import com.codebus.dao.UserCredentialsDao;
import com.codebus.domain.UserCredentials;

@Service
@Transactional 
public class UserCredentialsServiceImpl implements com.codebus.service.UserCredentialsService {
	
 	@Autowired
	private UserCredentialsDao userCredentialsDao;

 	
     public void save( UserCredentials userCredentials) {  		
  		userCredentialsDao.save(userCredentials);
 	}
  	
  	
	public List<UserCredentials> findAll() {
		return (List<UserCredentials>)userCredentialsDao.findAll();
	}

	public UserCredentials findByUserName(String userName) {
		return userCredentialsDao.findByUserName(userName);
	}


	@Override
	public UserCredentials update(UserCredentials userCredentials) {
		return userCredentialsDao.update(userCredentials);
	
	}

}
