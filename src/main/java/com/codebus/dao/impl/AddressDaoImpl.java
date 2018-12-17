package com.codebus.dao.impl;

 

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.codebus.dao.AddressDao;
import com.codebus.domain.Address;


@SuppressWarnings("unchecked")
@Repository
public class AddressDaoImpl extends GenericDaoImpl<Address> implements AddressDao {

	public AddressDaoImpl() {
		super.setDaoType(Address.class );
		}

 
 }