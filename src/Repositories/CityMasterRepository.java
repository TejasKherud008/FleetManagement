package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.CityMaster;

public interface CityMasterRepository extends JpaRepository<CityMaster, Integer> {
}

