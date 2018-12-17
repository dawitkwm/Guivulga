package com.codebus.domain;

import java.util.List;

public class Bank {
	
	private String name;
	
	private String bic; //bank identifier code
	
	private List<Branch> branches;
	
	public Bank() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	
	

}
