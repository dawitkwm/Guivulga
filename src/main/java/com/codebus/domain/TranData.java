package com.codebus.domain;

public class TranData {
	private String fromIBAN;
	private String toIBAN;
	
	private String bankName;
	private String accountName;
	
	private Double amount;
	private String currency;
	private String desc;
	
	public String getFromIBAN() {
		return fromIBAN;
	}
	public void setFromIBAN(String fromIBAN) {
		this.fromIBAN = fromIBAN;
	}
	public String getToIBAN() {
		return toIBAN;
	}
	public void setToIBAN(String toIBAN) {
		this.toIBAN = toIBAN;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
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

/**
 * 
 * An example of an IBAN code in at Great Britain’s National Westminster Bank is GB 29 NWBK 601613 31926819
 * 
 * A two-letter country code.
 * A two-digit transaction number.
 * A four-letter bank code.
 * A six-digit bank sort code.
 * A unique number specific to the bank account.
 * 
 */
