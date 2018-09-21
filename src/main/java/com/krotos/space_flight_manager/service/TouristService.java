package com.krotos.space_flight_manager.service;

import com.krotos.space_flight_manager.model.Tourist;

import java.util.List;

public interface TouristService {

    List<Tourist> findAll();
    void add(Tourist tourist);
    void deleteById(Long id);
}
