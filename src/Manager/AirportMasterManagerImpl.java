package com.example.demo.Services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.AirportMaster;
import com.example.demo.repositories.AirportMasterRepositories;

@Service
public class AirportMasterManagerImpl implements AirportMasterManager {

    @Autowired
    private AirportMasterRepositories airportRepository;

    public List<AirportMaster> getAllAirports() {
        return airportRepository.findAll();
    }

    public Optional<AirportMaster> getAirportById(Long id) {
        return airportRepository.findById(id);
    }

    public AirportMaster createOrUpdateAirport(AirportMaster airport) {
        return airportRepository.save(airport);
    }

    public void deleteAirport(Long id) {
        airportRepository.deleteById(id);
    }
}
