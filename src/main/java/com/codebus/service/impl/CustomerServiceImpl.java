package com.codebus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codebus.dao.CustomerDao;
import com.codebus.domain.Account;
import com.codebus.domain.Customer;
import com.codebus.service.AccountService;
import com.codebus.service.AddressService;
import com.codebus.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

 	@Autowired
	private CustomerDao customerDao;

 	@Autowired
	private AddressService addressService;
 	
 	@Autowired
	private AccountService accountService;
 	
	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public void saveFull(Customer customer) {
		for (Account account : customer.getAccounts()) {
			accountService.save(account);
		}
		addressService.save(customer.getAddress());
		customerDao.save(customer);
	}

	@Override
	public List<Customer> findAll() {
		return (List<Customer>) customerDao.findAll();
	}

	@Override
	public Customer findOne(Long id) {
		return customerDao.findOne(id);
	}

	@Override
	public Customer update(Customer customer) {
		return customerDao.update(customer);
	}

}
