package com.example.demo.controllers;



import com.example.demo.Services.CarMasterManager;
import com.example.demo.entities.CarMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarMasterController {

    @Autowired
    private CarMasterManager carMasterService;

    @GetMapping
    public List<CarMaster> getAllCars() {
        return carMasterService.getAllCars();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarMaster> getCarById(@PathVariable("id") Long carId) {
        Optional<CarMaster> carMaster = carMasterService.getCarById(carId);
        return carMaster.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public CarMaster createCar(@RequestBody CarMaster carMaster) {
        return carMasterService.saveCar(carMaster);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CarMaster> updateCar(@PathVariable("id") Long carId, @RequestBody CarMaster carMaster) {
        if (!carMasterService.getCarById(carId).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        carMaster.setCarId(carId);
        return ResponseEntity.ok(carMasterService.saveCar(carMaster));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable("id") Long carId) {
        if (!carMasterService.getCarById(carId).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        carMasterService.deleteCar(carId);
        return ResponseEntity.noContent().build();
    }
}
