package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.CustomerMaster;

@Repository
public interface CustomerMasterRepository extends JpaRepository<CustomerMaster, Long> {
}
