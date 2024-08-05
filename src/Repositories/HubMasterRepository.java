package com.example.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Hub_Master;
@Repository
@Transactional

public interface HubMasterRepository extends JpaRepository<Hub_Master, Integer>{

}
