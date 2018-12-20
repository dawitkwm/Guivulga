package com.codebus.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.codebus.domain.TranData;
import com.codebus.domain.Transaction;
import com.codebus.mts.MoneyTranserService;
import com.codebus.repository.TransactionRepository;
import com.codebus.service.AccountService;
import com.codebus.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository repo;
	
	@Autowired
	MoneyTranserService transfer;
	
	@Autowired
	AccountService account;
		
	@Override
	public Transaction interCountry(Transaction tran) {
		
		TranData data = new TranData();
		
		data.setFromIBAN(account.getIban(tran.getFromAccount()));
		data.setToIBAN(account.getIban(tran.getToAccount()));
		data.setAmount(tran.getAmount());
		data.setCurrency(tran.getCurrency());
		data.setDescription(tran.getDescription());
		
		System.out.println("TO IBAN: " + data.getToIBAN());
		
		transfer.publish(data);
		
		return persist(tran);
	}

	@Override
	public Transaction interBank(Transaction tran) {
		// TODO Auto-generated method stub
		return persist(tran);
	}

	@Override
	public Transaction interAccount(Transaction tran) {
		return persist(tran);
	}
	
	@Override
	public void receive(TranData data) {		
		// us-bankone-branchone-1000000000
		
		String[] toInfo = data.getToIBAN().split("-");
		String[] fromInfo = data.getFromIBAN().split("-");
		
		Transaction tran = new Transaction();
		tran.setToAccount(toInfo[3]);
		tran.setToBank(toInfo[1]);
		tran.setToCountry(toInfo[0]);
		tran.setFromAccount(fromInfo[3]);
		tran.setAmount(data.getAmount());
		tran.setDescription(data.getDescription());
		
		interAccount(tran);
	}

	@Override
	public List<Transaction> statement() {		
		return (List<Transaction>) repo.findAll();
	}
	
	private Transaction persist(Transaction tran) {
		tran.setDate(new Date());
		
		try {
			account.updateBalance(tran.getFromAccount(), Double.valueOf(tran.getAmount()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return repo.save(tran);
	}
}
