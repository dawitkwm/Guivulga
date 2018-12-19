package com.codebus.mts;


import com.codebus.domain.MtsTranDataEnvelope;
import com.codebus.domain.TranData;

public interface MoneyTranserService {
	public void publish(TranData tranData);
	public void listen(MtsTranDataEnvelope mtsTranData);
}
