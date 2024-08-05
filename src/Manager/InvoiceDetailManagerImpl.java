package com.example.demo.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.InvoiceDetail;
import com.example.demo.repositories.InvoiceDetailRepository;

@Service
public class InvoiceDetailManagerImpl implements InvoiceManager{

    @Autowired
    private InvoiceDetailRepository invoiceDetailRepository;

    public List<InvoiceDetail> getAllInvoiceDetails() {
        return invoiceDetailRepository.findAll();
    }

    public Optional<InvoiceDetail> getInvoiceDetailById(Long id) {
        return invoiceDetailRepository.findById(id);
    }

    public InvoiceDetail saveInvoiceDetail(InvoiceDetail invoiceDetail) {
        return invoiceDetailRepository.save(invoiceDetail);
    }

    public void deleteInvoiceDetail(Long id) {
        invoiceDetailRepository.deleteById(id);
    }
}
