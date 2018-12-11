package com.project.hbankservice.hbankservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.hbankservice.hbankservice.entity.Account;


public interface AccountRepository extends MongoRepository<Account, Long> {
		

}
