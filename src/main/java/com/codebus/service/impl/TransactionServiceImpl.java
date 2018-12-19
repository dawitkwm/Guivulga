package com.codebus.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebus.domain.TranData;
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
	
	@Override
	public void receive(TranData tran) {
		System.out.println("Received Money !!!!");
	}
	
	private Transaction persist(Transaction tran) {
		tran.setDate(new Date());
		
		return repo.save(tran);
	}

	@Override
	public List<Transaction> statement() {
		return (List<Transaction>) repo.findAll();
	}
}
