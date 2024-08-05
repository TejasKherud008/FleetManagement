package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.demo.Services.CityMasterManagerImpl;
import com.example.demo.entities.CityMaster;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cities")
public class CityMasterController {

    @Autowired
    private CityMasterManagerImpl service;

    @GetMapping
    public List<CityMaster> getAllCities() {
        return service.getAllCities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CityMaster> getCityById(@PathVariable int id) {
        Optional<CityMaster> city = service.getCityById(id);
        if (city.isPresent()) {
            return ResponseEntity.ok(city.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public CityMaster createCity(@RequestBody CityMaster city) {
        return service.saveCity(city);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<CityMaster> updateCity(@PathVariable int id, @RequestBody CityMaster cityDetails) {
//        Optional<CityMaster> city = service.getCityById(id);
//        if (city.isPresent()) {
//            CityMaster updatedCity = city.get();
//            updatedCity.setCityName(cityDetails.getCityName());
//          updatedCity.setStateId(cityDetails.getStateId());
//            service.saveCity(updatedCity);
//            return ResponseEntity.ok(updatedCity);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCity(@PathVariable int id) {
        if (service.getCityById(id).isPresent()) {
            service.deleteCity(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

