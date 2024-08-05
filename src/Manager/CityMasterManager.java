package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.CityMaster;

public interface CityMasterManager {
	
	List<CityMaster> getAllCities();
	Optional<CityMaster> getCityById(int id);
	CityMaster saveCity(CityMaster city);
	void deleteCity(int id);
}
