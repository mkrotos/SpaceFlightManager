package com.krotos.space_flight_manager.service;


public interface ReservationService {

    boolean addFlightToTourist(long touristId, long flightId);

    boolean deleteFlightFromTourist(long touristId, long flightId);
}
