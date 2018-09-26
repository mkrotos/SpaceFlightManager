package com.krotos.space_flight_manager.controller;

import com.krotos.space_flight_manager.model.Tourist;
import com.krotos.space_flight_manager.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TouristController {

    @Autowired
    private TouristService touristService;

    @GetMapping("tourists/")
    public List<Tourist> getAllTourists(){
        return touristService.findAll();
    }

    @PostMapping("tourists/")
    public Tourist addTourist(@RequestBody Tourist tourist){
        return touristService.add(tourist);
    }
    @DeleteMapping("tourists/{id}")
    public void deleteTourist(@PathVariable Long id){
        touristService.deleteById(id);
    }


}
