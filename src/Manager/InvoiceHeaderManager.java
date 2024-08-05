package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.InvoiceHeader;

public interface InvoiceHeaderManager {
	void deleteInvoiceHeader(Long id);
	List<InvoiceHeader> getAllInvoiceHeaders();
	Optional<InvoiceHeader> getInvoiceHeaderById(Long id);
	InvoiceHeader saveInvoiceHeader(InvoiceHeader invoiceHeader);
}
