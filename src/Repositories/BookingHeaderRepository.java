package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.BookingHeader;

public interface BookingHeaderRepository extends JpaRepository<BookingHeader, Long> {
}
