package com.krotos.space_flight_manager.controller;

import com.krotos.space_flight_manager.model.Reservation;
import com.krotos.space_flight_manager.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("/reservation")
    public boolean addReservation(@RequestBody Reservation reservation) {
        boolean success = reservationService.addFlightToTourist(reservation.getTouristId(), reservation.getFlightId());
        return success;
    }

    @DeleteMapping("/reservation")
    public void deleteReservation(@PathVariable("touristId") long touristId, @PathVariable("flightId") long flightId){
        reservationService.deleteFlightFromTourist(touristId,flightId);
    }

}
