package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.AirportMaster;

@Repository
public interface AirportMasterRepositories extends JpaRepository<AirportMaster, Long> {
    // You can add custom query methods here if needed
}

