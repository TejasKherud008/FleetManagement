package com.example.demo.Services;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.CarType;
import com.example.demo.repositories.CarTypeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarTypeManagerImpl implements CarTypeManager {

    private final CarTypeRepository carTypeRepository;

    @Autowired
    public CarTypeManagerImpl(CarTypeRepository carTypeRepository) {
        this.carTypeRepository = carTypeRepository;
    }

    public List<CarType> getAllCarTypes() {
        return carTypeRepository.findAll();
    }

    public Optional<CarType> getCarTypeById(Long id) {
        return carTypeRepository.findById(id);
    }

    public CarType saveCarType(CarType carType) {
        return carTypeRepository.save(carType);
    }

    public void deleteCarType(Long id) {
        carTypeRepository.deleteById(id);
    }
}
