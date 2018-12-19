package com.codebus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codebus.domain.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
