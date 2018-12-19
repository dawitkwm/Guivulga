package com.codebus.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.codebus.dao.AccountDao;
import com.codebus.domain.Account;
import com.codebus.domain.User;

@Repository
public class AccountDaoImpl extends GenericDaoImpl<Account> implements AccountDao  {
	public AccountDaoImpl() {
		super.setDaoType(Account.class);
	}
	
	public Account findByAccountNo(String accountNo) {
	     
		Query query = entityManager.createQuery("select a from account a  where a.accountNo = :acntno");
		return (Account) query.setParameter("acntno", accountNo).getSingleResult();

	}
}
