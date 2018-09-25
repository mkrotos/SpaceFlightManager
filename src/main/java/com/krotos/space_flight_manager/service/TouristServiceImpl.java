package com.krotos.space_flight_manager.service;

import com.krotos.space_flight_manager.model.Tourist;
import com.krotos.space_flight_manager.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class TouristServiceImpl implements TouristService {

    @Autowired
    private TouristRepository touristRepository;

    @Override
    public List<Tourist> findAll() {
        return touristRepository.findAll();
    }

    @Override
    public Tourist add(Tourist tourist) {
        Tourist savedTourist= touristRepository.save(tourist);
        return savedTourist;
    }

    @Override
    public void deleteById(Long id) {
        touristRepository.deleteById(id);
    }

}
