package com.codebus.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "account")
public abstract class Account implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Size(min=10, max=40)
	@Column(name = "acntno", length = 40)
	private String accountNo;

	@NotNull
	@Column(length = 34)
	private String iban; // international bank account number: country-code + branch-code + accountNumber

	@NotNull
	@Column
	private Double balance;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer")
	private Customer customer;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "branch")
	private Branch branch;

	public Account() {

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
