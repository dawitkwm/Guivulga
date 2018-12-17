package com.codebus.service;

import java.util.List;

import com.codebus.domain.User;
 
public interface UserService {

	public void save(User user);
	public List<User> findAll();
	public User findOne(Long id);
	public User findByEmail(String email);
	public User update(User user);
	public void saveFull( User user);		

}
