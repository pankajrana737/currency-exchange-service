package com.pankaj.rana.microservice.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pankaj.rana.microservice.currencyexchangeservice.controller.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from,String To);
}
