package com.project.hbankservice.hbankservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.project.hbankservice.hbankservice.entity.Account;


public interface AccountRepository extends MongoRepository<Account, Long> {
		

	@Query("{ 'id' : ?0 }")
	Account findByNumberAccount(String account);

}
