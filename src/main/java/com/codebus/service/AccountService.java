package com.codebus.service;

import java.util.List;

import com.codebus.domain.Account;

public interface AccountService {

	public void save(Account account);

	public List<Account> findAll();

	public Account findOne(String accountNo);

	public Account update(Account account);

	public void updateBalance(String accountNo, Double amount)  throws Exception;
	
	public String getIban(String accountNo);

	public void saveFull(Account account);

}
