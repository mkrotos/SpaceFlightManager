package com.krotos.space_flight_manager.repository;

import com.krotos.space_flight_manager.model.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristRepository extends JpaRepository<Tourist,Long> {
}
