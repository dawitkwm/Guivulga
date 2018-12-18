package com.codebus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codebus.domain.TranData;

@Repository
public interface TransactionRepository extends CrudRepository<TranData, Long> {

}
