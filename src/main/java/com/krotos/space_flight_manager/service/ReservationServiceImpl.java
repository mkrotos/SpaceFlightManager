package com.krotos.space_flight_manager.service;

import com.krotos.space_flight_manager.model.Flight;
import com.krotos.space_flight_manager.model.Tourist;
import com.krotos.space_flight_manager.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    TouristRepository touristRepository;

    @Override
    public void addFlightToTourist(Tourist tourist, Flight flight) {

        touristRepository.findById(tourist.getId()).get().getFlightList().add(flight);
    }

    @Override
    public void deleteFlightFromTourist(Tourist tourist, Flight flight) {

        touristRepository.findById(tourist.getId()).get().getFlightList().remove(flight);
    }
}
