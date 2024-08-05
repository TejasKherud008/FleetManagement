package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.BookingDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDetailRepository extends JpaRepository <BookingDetail, Long>{

}