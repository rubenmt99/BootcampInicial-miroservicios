package com.everis.bootcamp.priceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootcamp.priceservice.model.Prices;
import com.everis.bootcamp.priceservice.service.PriceService;

@RestController
@RequestMapping("api")
public class PriceController {

	@Autowired
	private PriceService priceService;

	// Petición de tipo GET para obtener el precio del elemento con el "id" especificado
	@GetMapping(value= "/get-price/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Prices getPrice(@PathVariable Integer id) {
		return priceService.get(id);
		
	}
	
	// Petición de tipo GET para obtener todos los precios
	@GetMapping(value="/get-all-prices", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Prices> getAllPrices() {
		return priceService.getAllPrices();
	}

}
