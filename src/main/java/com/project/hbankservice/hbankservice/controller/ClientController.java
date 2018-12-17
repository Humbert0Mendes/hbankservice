package com.project.hbankservice.hbankservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.hbankservice.hbankservice.entity.Client;
import com.project.hbankservice.hbankservice.repository.ClientRepository;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	ClientRepository clientRepository;
	
	public ClientController(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public List<Client> getClients() {
		
			return clientRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Client> save(@RequestBody Client client) {
		
		
		return new ResponseEntity<>(clientRepository.save(client), HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		clientRepository.deleteById(id);
	}
	
	@RequestMapping(value="", method = RequestMethod.PUT)
	public Client update(@RequestBody Client client) {
		return clientRepository.save(client);
	}
}
