package com.krotos.space_flight_manager.controller;

import com.krotos.space_flight_manager.model.Tourist;
import com.krotos.space_flight_manager.service.ReservationService;
import com.krotos.space_flight_manager.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class TouristController {

    @Autowired
    private TouristService touristService;

    @Autowired
    private ReservationService reservationService;

    @GetMapping("tourists/")
    public List<Tourist> getAllTourists(){
        System.out.println("++++++ Get ");
        return touristService.findAll();
    }

    @PostMapping("tourists/")
    public Tourist addTourist(@RequestBody Tourist tourist){
        System.out.println("+++++++++++++++++ Post "+tourist.toString());
        Tourist savedTourist= touristService.add(tourist);

        return savedTourist;
    }
    @DeleteMapping("tourists/{id}")
    public void deleteTourist(@PathVariable Long id){
        touristService.deleteById(id);
    }


}
