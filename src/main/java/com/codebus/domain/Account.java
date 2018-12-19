package com.codebus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "account")
public abstract class Account {
	@Id
	@Size(min=10, max=40)
	@Column(name = "acntno", length = 40)
	private int accountNo;

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

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
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
