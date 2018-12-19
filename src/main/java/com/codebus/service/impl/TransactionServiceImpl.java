package com.codebus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebus.domain.Transaction;
import com.codebus.repository.TransactionRepository;
import com.codebus.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository repo;
		
	@Override
	public Transaction interCountry(Transaction tran) {
		// TODO Auto-generated method stub
		return persist(tran);
	}

	@Override
	public Transaction interBank(Transaction tran) {
		// TODO Auto-generated method stub
		return persist(tran);
	}

	@Override
	public Transaction interAccount(Transaction tran) {
		// TODO Auto-generated method stub
		return persist(tran);
	}
	
	private Transaction persist(Transaction tran) {
		return repo.save(tran);
	}
}
