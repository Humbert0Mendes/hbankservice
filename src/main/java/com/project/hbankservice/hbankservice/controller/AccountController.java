package com.project.hbankservice.hbankservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.hbankservice.hbankservice.entity.Account;
import com.project.hbankservice.hbankservice.repository.AccountRepository;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountRepository accountRepository;
	
	public AccountController(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public List<Account> getAccounts(){
		return accountRepository.findAll();
		
	}
	
	@RequestMapping(value="",method = RequestMethod.POST)
	public Account save(@RequestBody Account account) {
		return accountRepository.save(account);
	}
	
}
