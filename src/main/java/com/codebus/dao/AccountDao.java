package com.codebus.dao;

import com.codebus.domain.Account;

public interface AccountDao extends GenericDao<Account> {
	public Account findByAccountNo(String accountNo);
}
