package com.krotos.space_flight_manager.model;

public class Reservation {
    private long touristId;
    private long flightId;

    public long getTouristId() {
        return touristId;
    }

    public void setTouristId(long touristId) {
        this.touristId = touristId;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }
}
