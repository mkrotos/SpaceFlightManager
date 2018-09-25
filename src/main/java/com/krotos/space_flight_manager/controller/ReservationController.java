package com.krotos.space_flight_manager.controller;

import com.krotos.space_flight_manager.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("reservation/{touristId}/(flightId}")
    public boolean addReservation(@PathVariable("touristId") long touristId, @PathVariable("flightId") long flightId) {
        boolean success = reservationService.addFlightToTourist(touristId, flightId);
        return success;
    }

    @DeleteMapping("reservation/{touristId}/(flightId}")
    public void deleteReservation(@PathVariable("touristId") long touristId, @PathVariable("flightId") long flightId){
        reservationService.deleteFlightFromTourist(touristId,flightId);
    }

}
