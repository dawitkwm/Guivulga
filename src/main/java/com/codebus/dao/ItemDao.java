package com.codebus.dao;

import java.util.List;

import com.codebus.domain.Item;
import com.codebus.domain.User;

public interface ItemDao extends GenericDao<Item> {
      
	public List<Item> findBySellerOrBuyer(Integer price, User buyer, User seller);
	public List<Item> findByCategoryName(String categoryName);
	public List<Item> findItemCriteria(Integer initialPrice, User buyer, User seller);
}
