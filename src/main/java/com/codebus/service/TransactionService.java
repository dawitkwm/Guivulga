package com.codebus.service;

import java.util.List;

import com.codebus.domain.Transaction;

public interface TransactionService {
	
	// International
	public Transaction interCountry(Transaction tran);
	
	// Between Bank
	public Transaction interBank(Transaction tran);
	
	// Between Account
	public Transaction interAccount(Transaction tran);
	
	public List<Transaction> statement();
}
