package com.project.hbankservice.hbankservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.project.hbankservice.hbankservice.entity.Client;
import com.project.hbankservice.hbankservice.repository.ClientRepository;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// TODO Auto-generated method stub
		
		createClient("Beto", "10000000");
		Client client = clientRepository.findByNameQualquerCoisa("Humberto");
		System.out.println("Serviço inicializado com sucesso." + client.getName());
	}
	
	public void createClient(String name, String cpf) {
		
		Client client = new Client(name, cpf);
		clientRepository.save(client);
	}
	

}
