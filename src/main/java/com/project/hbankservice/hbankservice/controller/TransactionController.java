package com.project.hbankservice.hbankservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hbankservice.hbankservice.repository.AccountRepository;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	AccountRepository accountRepository;
	
	public TransactionController(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		
		
		
	}
}
