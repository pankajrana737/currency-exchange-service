package com.pankaj.rana.microservice.currencyexchangeservice.controller;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.Nullable;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	@Column(name = "Currency_from")
	private String from;
	@Column(name = "Currency_to")
	private String to;
	private BigDecimal convertionMultiple;
	@Nullable
	private int port;
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExchangeValue(Long id, String from, String to, BigDecimal convertionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertionMultiple = convertionMultiple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConvertionMultiple() {
		return convertionMultiple;
	}
	public void setConvertionMultiple(BigDecimal convertionMultiple) {
		this.convertionMultiple = convertionMultiple;
	}
	
	
}
