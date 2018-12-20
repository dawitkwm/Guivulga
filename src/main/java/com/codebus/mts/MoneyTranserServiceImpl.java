package com.codebus.mts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;

import com.codebus.domain.MtsTranDataEnvelope;
import com.codebus.domain.TranData;
import com.codebus.service.TransactionService;

public class MoneyTranserServiceImpl implements MoneyTranserService {
	@Autowired
	private ApplicationContext appContext;
	
	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	@Qualifier("mtsRabbitTemplate")
	RabbitTemplate mtsRabbitTemplate;
	
	@Override
	public void publish(TranData tranData) {

        mtsRabbitTemplate.convertAndSend("mtsDirectExchange", "codebus.guivulga.key", tranData);
	}

	@Override
	public void listen(MtsTranDataEnvelope mtsTranData) {
		TranData tranData = mtsTranData.getTranData();
    	//TODO implement this as AOP
    	System.out.println("Money to be Transfered via Guivulga");
    	System.out.println("Destination Country: " + countryCodeToName(tranData.getToIBAN().substring(0, 2)));
//    	System.out.println("Destination bank name: " + tranData.getBankName());
    	System.out.println("Amount: " + tranData.getAmount());
//    	transactionService.receive(tranData);
		
	}
	
	private String countryCodeToName(String countryCode) {
    	String countryName = null;
    	if(countryCode.equals("us")) {
    		countryName  = "USA";
    	} else if (countryCode.equals("mn")) {
    		countryName  = "MONGOLIA";
    	} else if (countryCode.equals("et")) {
    		countryName  = "ETHIOPIA";
    	} 
    	return countryName;
    }
}
