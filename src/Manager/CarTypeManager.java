package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.CarType;

public interface CarTypeManager {

	List<CarType> getAllCarTypes();
	Optional<CarType> getCarTypeById(Long id);
	CarType saveCarType(CarType carType);
	void deleteCarType(Long id);
	
}
