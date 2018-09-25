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
        return reservationService.addFlightToTourist(reservation.getTouristId(), reservation.getFlightId());
    }

    @DeleteMapping("/reservation")
    public boolean deleteReservation(@RequestBody Reservation reservation){
        return reservationService.deleteFlightFromTourist(reservation.getTouristId(),reservation.getFlightId());
    }

}
