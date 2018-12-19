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

@Entity
public class TranData implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	// Destination info
	@Column(name = "TO_IBAN", length = 34)
	private String toIBAN;
	
	// Source info
	@Column(name = "FROM_IBAN", length = 34)
	private String fromIBAN;
	@Column(length = 50)
	private String accountName;
	
	// Transaction info
	private Double amount;
	@Column(length = 3)
	private String currency;
	@Column(length = 100)
	private String desc;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}