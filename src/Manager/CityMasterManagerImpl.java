package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.CityMaster;
import com.example.demo.repositories.CityMasterRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CityMasterManagerImpl {

    @Autowired
    private CityMasterRepository repository;

    public List<CityMaster> getAllCities() {
        return repository.findAll();
    }

    public Optional<CityMaster> getCityById(int id) {
        return repository.findById(id);
    }

    public CityMaster saveCity(CityMaster city) {
        return repository.save(city);
    }

    public void deleteCity(int id) {
        repository.deleteById(id);
    }
}

