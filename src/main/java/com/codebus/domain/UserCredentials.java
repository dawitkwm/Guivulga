package com.codebus.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name = "Authentication")
@Table(name = "AUTHENTICATION")
public class UserCredentials implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER", nullable = false, unique = true, length = 127)
	@NotEmpty
	String userName;

	@Column(name = "PASSWORD", nullable = false, length = 32)
	@Size(min=8, max=20, message = "{Size.user.userCredentials.password}")
	String password;
	
	@Column(nullable = true, length = 32)
	String verifyPassword;
	Boolean enabled;

	@OneToOne(mappedBy = "userCredentials", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private User user;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "credential_authority", joinColumns = {
			@JoinColumn(name = "credential_id") }, inverseJoinColumns = {
					@JoinColumn(name = "authority_id", unique = true) })
	List<Authority> authority = new ArrayList<Authority>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(List<Authority> authority) {
		this.authority = authority;
	}

}
