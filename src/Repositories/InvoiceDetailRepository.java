package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.InvoiceDetail;

@Repository
public interface InvoiceDetailRepository extends JpaRepository<InvoiceDetail, Long> {

}