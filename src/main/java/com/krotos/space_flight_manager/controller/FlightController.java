package com.krotos.space_flight_manager.controller;

import com.krotos.space_flight_manager.model.Flight;
import com.krotos.space_flight_manager.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("flights/")
    public List<Flight> getAllFlights(){
        return flightService.findAll();
    }

    @PostMapping("flights/")
    public Flight addFlight(@RequestBody Flight flight){
        return flightService.add(flight);
    }
    @DeleteMapping("flights/{id}")
    public void deleteFlight(@PathVariable Long id){
        flightService.deleteById(id);
    }


}
