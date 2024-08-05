package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.InvoiceDetail;

public interface InvoiceManager {
	List<InvoiceDetail> getAllInvoiceDetails();
	Optional<InvoiceDetail> getInvoiceDetailById(Long id);
	InvoiceDetail saveInvoiceDetail(InvoiceDetail invoiceDetail);
	void deleteInvoiceDetail(Long id);
}
