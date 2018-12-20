package com.codebus.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class TranData implements Serializable{
	
	private static final long serialVersionUID = 1L;

	// Destination info
	private String toIBAN;
	
	// Source info
	private String fromIBAN;
	private String accountName;
	
	// Transaction info
	private Double amount;
	private String currency;
	private String desc;
	
	public String getToIBAN() {
		return toIBAN;
	}
	public void setToIBAN(String toIBAN) {
		this.toIBAN = toIBAN;
	}
	public String getFromIBAN() {
		return fromIBAN;
	}
	public void setFromIBAN(String fromIBAN) {
		this.fromIBAN = fromIBAN;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}