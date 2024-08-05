package com.example.demo.repositories;



import com.example.demo.entities.CarMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarMasterRepository extends JpaRepository<CarMaster, Long> {
    // Custom query methods (if needed) can be defined here
}
