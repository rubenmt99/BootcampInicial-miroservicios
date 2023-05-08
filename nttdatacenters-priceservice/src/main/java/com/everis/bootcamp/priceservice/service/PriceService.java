package com.everis.bootcamp.priceservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.bootcamp.priceservice.model.Prices;
import com.everis.bootcamp.priceservice.repository.PriceRepository;

@Service
public class PriceService {

	@Autowired
	private PriceRepository priceRepository;

	public Prices get(Integer priceId) {
		return priceRepository.findById(priceId).orElse(new Prices());
	}

	public List<Prices> getAllPrices() {
		return priceRepository.findAll();
	}

}
