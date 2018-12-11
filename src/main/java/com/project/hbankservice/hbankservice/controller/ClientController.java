package com.project.hbankservice.hbankservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.hbankservice.hbankservice.repository.ClientRepository;

@Controller
public class ClientController {
	
	private ClientRepository clientRepository;
	
	
	public ClientController(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	@RequestMapping("/client")
	public String getClients(Model model) {
		model.addAttribute("clientList", this.clientRepository.findAll());
		
		return "client";
	}
	

}
