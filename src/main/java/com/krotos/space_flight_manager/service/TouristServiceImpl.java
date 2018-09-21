package com.krotos.space_flight_manager.service;

import com.krotos.space_flight_manager.model.Tourist;
import com.krotos.space_flight_manager.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void add(Tourist tourist) {
        touristRepository.save(tourist);
    }

    @Override
    public void deleteById(Long id) {
        touristRepository.deleteById(id);
    }

}
