package com.example.demo.Services;



import com.example.demo.entities.CarMaster;
import com.example.demo.repositories.CarMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarMasterManagerImpl implements CarMasterManager {

    @Autowired
    private CarMasterRepository carMasterRepository;

    public List<CarMaster> getAllCars() {
        return carMasterRepository.findAll();
    }

    public Optional<CarMaster> getCarById(Long carId) {
        return carMasterRepository.findById(carId);
    }

    public CarMaster saveCar(CarMaster carMaster) {
        return carMasterRepository.save(carMaster);
    }

    public void deleteCar(Long carId) {
        carMasterRepository.deleteById(carId);
    }

    // Additional business logic can be added here
}

