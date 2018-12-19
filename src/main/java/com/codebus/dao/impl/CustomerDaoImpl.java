package com.codebus.dao.impl;

import com.codebus.dao.CustomerDao;
import com.codebus.domain.Customer;
import com.codebus.domain.User;

public class CustomerDaoImpl extends GenericDaoImpl<Customer> implements CustomerDao {
	public CustomerDaoImpl() {
		super.setDaoType(Customer.class);
	}
}
