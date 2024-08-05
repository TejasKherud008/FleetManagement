package com.example.demo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.CarType;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface CarTypeRepository extends JpaRepository<CarType, Long> {
    // Additional query methods can be defined here if needed
}
