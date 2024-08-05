package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.CarMaster;

public interface CarMasterManager {
	List<CarMaster> getAllCars();
	Optional<CarMaster> getCarById(Long carId);
	CarMaster saveCar(CarMaster carMaster);
	void deleteCar(Long carId);
}
