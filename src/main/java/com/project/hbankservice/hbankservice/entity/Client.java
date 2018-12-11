package com.project.hbankservice.hbankservice.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client {
	
	@Id
	private String id;
	private String name;
	private String cpf;
	
	public Client(String name, String cpf){
		super();
		this.name = name;
		this.cpf = cpf;	
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	
}
