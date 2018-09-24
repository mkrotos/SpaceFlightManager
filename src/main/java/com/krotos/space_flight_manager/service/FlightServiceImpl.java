package com.krotos.space_flight_manager.service;

import com.krotos.space_flight_manager.model.Flight;
import com.krotos.space_flight_manager.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Override
    public List<Flight> findAll() {
        flightRepository.findAll();
        return null;
    }

    @Override
    public Flight add(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public void deleteById(Long id) {
        flightRepository.deleteById(id);
    }
}
