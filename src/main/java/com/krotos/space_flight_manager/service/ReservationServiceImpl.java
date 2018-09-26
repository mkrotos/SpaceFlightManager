package com.krotos.space_flight_manager.service;

import com.krotos.space_flight_manager.model.Flight;
import com.krotos.space_flight_manager.model.Tourist;
import com.krotos.space_flight_manager.repository.FlightRepository;
import com.krotos.space_flight_manager.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private TouristRepository touristRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Override
    @Transactional
    public boolean addFlightToTourist(long touristId, long flightId) {
        Optional<Flight> thisFlight = flightRepository.findById(flightId);
        Optional<Tourist> thisTourist = touristRepository.findById(touristId);
        if (!thisFlight.isPresent()||!thisTourist.isPresent()) {
            return false;
        }
        int numberOfSeatsInFlight = thisFlight.get().getNumberOfSeats();
        int seatsReserved = thisFlight.get().getTouristList().size();
        if (seatsReserved >= numberOfSeatsInFlight) {
            return false;
        }
        thisTourist.get().getFlightList().add(thisFlight.get());
        return true;
    }

    @Override
    @Transactional
    public boolean deleteFlightFromTourist(long touristId, long flightId) {
        System.out.println(flightId);
        Optional<Flight> thisFlight = flightRepository.findById(flightId);
        Optional<Tourist> thisTourist = touristRepository.findById(touristId);
        System.out.println(thisFlight);
        System.out.println(thisTourist);
        if(!thisFlight.isPresent()||!thisTourist.isPresent()){
            return false;
        }
        return thisTourist.get().getFlightList().remove(thisFlight.get());
    }
}
