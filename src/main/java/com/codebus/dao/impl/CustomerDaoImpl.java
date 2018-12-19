package com.codebus.dao.impl;

import org.springframework.stereotype.Repository;

import com.codebus.dao.CustomerDao;
import com.codebus.domain.Customer;
import com.codebus.domain.User;

@Repository
public class CustomerDaoImpl extends GenericDaoImpl<Customer> implements CustomerDao {
	public CustomerDaoImpl() {
		super.setDaoType(Customer.class);
	}
}
