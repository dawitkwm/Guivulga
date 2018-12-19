package com.codebus.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name="bank")
@Table(name="bank")
public class Bank implements Serializable{

	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String name;
	
	@Id
	@NotEmpty
	@Column(length = 20)
	private String bic; //bank identifier code
	
	@NotEmpty
	@Column(length = 30)
	private String country;
	
	@Valid
	@OneToMany(mappedBy = "bank", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Branch> branches = new ArrayList<>();
	
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
