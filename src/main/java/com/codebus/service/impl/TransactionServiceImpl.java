package com.codebus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebus.domain.TranData;
import com.codebus.repository.TransactionRepository;
import com.codebus.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository repo;
		
	@Override
	public TranData interCountry(TranData tran) {
		// TODO Auto-generated method stub
		return persist(tran);
	}

	@Override
	public TranData interBank(TranData tran) {
		// TODO Auto-generated method stub
		return persist(tran);
	}

	@Override
	public TranData interAccount(TranData tran) {
		// TODO Auto-generated method stub
		return persist(tran);
	}
	
	private TranData persist(TranData tran) {
		return repo.save(tran);
	}
}
