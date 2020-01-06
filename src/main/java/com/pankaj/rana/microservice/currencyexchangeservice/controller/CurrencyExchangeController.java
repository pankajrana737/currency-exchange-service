package com.pankaj.rana.microservice.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue reteriveExchangeValue(@PathVariable String from, @ PathVariable String to) {
		return new ExchangeValue(100L, "USD", "INR",  new BigDecimal("65"));
	}
	

}
