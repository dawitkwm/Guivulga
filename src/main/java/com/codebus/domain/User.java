package com.codebus.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity(name="User")
@Table(name = "USERS")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Long id = null;

	@Version
	private int version = 0;

	@Size(min=4, max=19, message="{Size.user.firstName}")
	@Column(name = "firstname", nullable = false)
	private String firstName;

	@NotEmpty
	@Column(name = "lastname", nullable = false)
	private String lastName;

	@NotEmpty
	@Email
	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "is_admin", nullable = false)
	private boolean admin = false;

	@Valid
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	private UserCredentials userCredentials;

	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "user")
	private List<Address> addresses = new ArrayList<Address>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void addAddress(Address address) {
		this.addresses.add(address);
		address.setUser(this);
	}
}