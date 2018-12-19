package com.codebus.service;

import java.util.List;

import com.codebus.domain.Customer;

public interface CustomerService {

	public void save(Customer user);

	public List<Customer> findAll();

	public Customer findOne(Long id);

	public Customer update(Customer user);

	public void saveFull(Customer user);

}
