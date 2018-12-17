package com.project.hbankservice.hbankservice.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Transaction {
	
	
	@Id
	private String id;
	private String bankDestiny;
	private String bankSender;
	private String idAccDestiny;
	private String idAccSender;
	private Date dtTransfer;
	private String value;	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBankDestiny() {
		return bankDestiny;
	}
	public void setBankDestiny(String bankDestiny) {
		this.bankDestiny = bankDestiny;
	}
	public String getBankSender() {
		return bankSender;
	}
	public void setBankSender(String bankSender) {
		this.bankSender = bankSender;
	}
	public Date getDtTransfer() {
		return dtTransfer;
	}
	public void setDtTransfer(Date dtTransfer) {
		this.dtTransfer = dtTransfer;
	}
	public String getIdAccDestiny() {
		return idAccDestiny;
	}
	public void setIdAccDestiny(String idAccDestiny) {
		this.idAccDestiny = idAccDestiny;
	}
	public String getIdAccSender() {
		return idAccSender;
	}
	public void setIdAccSender(String idAccSender) {
		this.idAccSender = idAccSender;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	

}
