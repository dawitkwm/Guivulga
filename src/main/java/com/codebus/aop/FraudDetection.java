package com.codebus.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.codebus.domain.Transaction;

@Aspect
@Component
public class FraudDetection {
	
	@Pointcut("execution(* com.codebus.service.impl..*(..))")
	public void financialTransaction() {}
	
	@Before("financialTransaction() && args(tran)")
	public void analyze(Transaction tran) {
		System.out.println("----- FRAUD DETECTION IS RUNNING -----");
		
		// check limit
		final double AMOUNT_LIMIT = 9999;
		
		if (tran.getAmount() > AMOUNT_LIMIT) {
			System.out.println("----- ALERT !!! FRAUD DETECTED !!!");
		} else {
			System.out.println("PASS. NO FRAUD DETECTED.");
		}
		
		System.out.println("----- FRAUD DETECTION IS FINISHED -----");
	}
}
