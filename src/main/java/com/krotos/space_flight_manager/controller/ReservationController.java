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
        long touristId = reservation.getTouristId();
        long flightId = reservation.getFlightId();
        return reservationService.addFlightToTourist(touristId, flightId);
    }

    @DeleteMapping("/reservation")
    public boolean deleteReservation(@RequestBody Reservation reservation){
        long touristId = reservation.getTouristId();
        long flightId = reservation.getFlightId();
        return reservationService.deleteFlightFromTourist(touristId, flightId);
    }

}
