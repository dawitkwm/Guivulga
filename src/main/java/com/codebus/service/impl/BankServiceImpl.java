package com.codebus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codebus.dao.BankDao;
import com.codebus.domain.Bank;
import com.codebus.service.BankService;

@Service
@Transactional 
public class BankServiceImpl implements BankService {

	@Autowired
	private BankDao bankDao;
	
	@Override
	public List<Bank> findAll() {
		return bankDao.findAll();
	}

}
