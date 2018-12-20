package com.codebus.dao.impl;

import org.springframework.stereotype.Repository;

import com.codebus.dao.BankDao;
import com.codebus.domain.Bank;

@Repository
public class BankDaoImpl extends GenericDaoImpl<Bank> implements BankDao {
	public BankDaoImpl() {
		super.setDaoType(Bank.class);
	}
}
