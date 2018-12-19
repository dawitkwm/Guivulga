package com.codebus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codebus.dao.BankDao;
import com.codebus.domain.Bank;
import com.codebus.service.BankService;

public class BankServiceImpl implements BankService {

	@Autowired
	private BankDao bankDao;
	
	@Override
	public List<Bank> findAll() {
		return bankDao.findAll();
	}

}
