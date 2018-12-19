package com.codebus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codebus.dao.AccountDao;
import com.codebus.domain.Account;
import com.codebus.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public void save(Account account) {
		accountDao.save(account);
	}

	@Override
	public List<Account> findAll() {
		return accountDao.findAll();
	}

	@Override
	public Account findOne(String accountNo) {
		return accountDao.findByAccountNo(accountNo);
	}

	@Override
	public Account update(Account account) {
		return accountDao.update(account);
	}

	@Override
	public void saveFull(Account account) {
		accountDao.save(account);

	}

	@Override
	public void updateBalance(String accountNo, Double amount) throws Exception {
		Account account = this.findOne(accountNo);
		if (account.getBalance() + amount < 0)
			throw new Exception("Insufficient fund!");
		account.setBalance(account.getBalance() + amount);
		accountDao.update(account);
	}

	@Override
	public String getIban(String accountNo) {
		return this.findOne(accountNo).getIban();
	}

}
