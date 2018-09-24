package com.krotos.space_flight_manager.service;

import com.krotos.space_flight_manager.model.Flight;

import java.util.List;

public interface FlightService {

    List<Flight> findAll();

    Flight add(Flight flight);

    void deleteById(Long id);
}
