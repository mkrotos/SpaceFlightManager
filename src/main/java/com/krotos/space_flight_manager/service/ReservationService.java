package com.krotos.space_flight_manager.service;

import com.krotos.space_flight_manager.model.Flight;
import com.krotos.space_flight_manager.model.Tourist;

public interface ReservationService {

    void addFlightToTourist(Tourist tourist, Flight flight);
    void deleteFlightFromTourist(Tourist tourist, Flight flight);
}
