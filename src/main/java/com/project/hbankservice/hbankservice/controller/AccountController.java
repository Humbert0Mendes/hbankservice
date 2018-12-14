package com.project.hbankservice.hbankservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.hbankservice.hbankservice.entity.Account;
import com.project.hbankservice.hbankservice.entity.Client;
import com.project.hbankservice.hbankservice.repository.AccountRepository;
import com.project.hbankservice.hbankservice.repository.ClientRepository;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	ClientRepository clientRepository;
	ClientController clientController = new ClientController(clientRepository);
	
	public AccountController(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public List<Account> getAccounts(){
		return accountRepository.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.POST)
	public Account save(@RequestBody Account account, @PathVariable String id) {
			
		validaIdClient(id, account);
		return accountRepository.save(account);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		accountRepository.deleteById(id);
	}
	
	@RequestMapping(value="", method = RequestMethod.PUT)
	public Account update(@RequestBody Account account) {
		return accountRepository.save(account);
	}
	
	@RequestMapping(value="/{id}/{balance}", method = RequestMethod.PATCH)
	public Account deposit(@PathVariable String id, @PathVariable Double balance) {
		
		Account accountNumber = new Account();
		accountNumber = accountRepository.findByNumberAccount(id);
		accountNumber.setBalance( accountNumber.getBalance() + balance );
		return accountRepository.save(accountNumber);
	}
		
	public void validaIdClient(String id, Account cAccount) {
		
		Client client = new Client();
		client = clientRepository.findByIdClient(id);
		cAccount.setClient(client);
		if(client.getId() == null) {
			System.out.println("Id do usuário informado não existe");
		}		
	}
	
}
