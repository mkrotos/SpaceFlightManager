package com.krotos.space_flight_manager.controller;

import com.krotos.space_flight_manager.model.Flight;
import com.krotos.space_flight_manager.service.FlightService;
import com.krotos.space_flight_manager.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightService flightService;

    @Autowired
    private ReservationService reservationService;

    @GetMapping("flights/")
    public List<Flight> getAllFlights(){
        System.out.println("++++++ Get ");
        return flightService.findAll();
    }

    @PostMapping("flights/")
    public Flight addFlight(@RequestBody Flight flight){
        System.out.println("+++++++++++++++++ Post "+flight.toString());
        Flight savedFlight= flightService.add(flight);

        return savedFlight;
    }
    @DeleteMapping("flights/{id}")
    public void deleteFlight(@PathVariable Long id){
        flightService.deleteById(id);
    }


}
