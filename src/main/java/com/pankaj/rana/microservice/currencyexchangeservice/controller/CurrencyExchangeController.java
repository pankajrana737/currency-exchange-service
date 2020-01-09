package com.pankaj.rana.microservice.currencyexchangeservice.controller;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pankaj.rana.microservice.currencyexchangeservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	 private Logger logger= LoggerFactory.getLogger(this.getClass());
	@Autowired
	private Environment  environment;
	@Autowired
	private ExchangeValueRepository exchangeRepository;
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue reteriveExchangeValue(@PathVariable String from, @ PathVariable String to) {
		logger.info("inside  "+ "getCurrencyConversionbeanFeign");
		ExchangeValue exchangeValue = exchangeRepository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}
	
	@GetMapping("/currency-exchange/all")
	public List<ExchangeValue> allExhcnageValues() {
		List<ExchangeValue> exchgValList = exchangeRepository.findAll();
		for(ExchangeValue e:exchgValList) {
			e.setPort(Integer.parseInt( environment.getProperty("local.server.port")));
		}

		return exchgValList;
	}
	

}
