package com.everis.bootcamp.priceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.bootcamp.priceservice.model.Prices;

@Repository
public interface PriceRepository extends JpaRepository<Prices, Integer> {
}