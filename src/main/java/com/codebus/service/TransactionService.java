package com.codebus.service;

import com.codebus.domain.TranData;

public interface TransactionService {
	
	// International
	public TranData interCountry(TranData tran);
	
	// Between Bank
	public TranData interBank(TranData tran);
	
	// Between Account
	public TranData interAccount(TranData tran);
}
