package com.project.hbankservice.hbankservice.controller;

import java.util.List;

import javax.websocket.ClientEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
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
	private ClientRepository clientRepository;
	
	
	public ClientController(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public List<Client> getClients() {
		
			return clientRepository.findAll();
	}
	
	@RequestMapping(value="",method = RequestMethod.POST)
	public Client save(@RequestBody Client client) {
		return clientRepository.save(client);
	}

}
