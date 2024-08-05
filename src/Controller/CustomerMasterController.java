package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Services.CustomerMasterManagerImpl;
import com.example.demo.entities.CustomerMaster;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerMasterController {

    @Autowired
    private CustomerMasterManagerImpl service;

    @GetMapping
    public List<CustomerMaster> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerMaster> getCustomerById(@PathVariable long id) {
        Optional<CustomerMaster> customer = service.getCustomerById(id);
        if (customer.isPresent()) {
            return ResponseEntity.ok(customer.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public CustomerMaster createCustomer(@RequestBody CustomerMaster customer) {
        return service.saveCustomer(customer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerMaster> updateCustomer(@PathVariable long id, @RequestBody CustomerMaster customerDetails) {
        Optional<CustomerMaster> customer = service.getCustomerById(id);
        if (customer.isPresent()) {
            CustomerMaster updatedCustomer = customer.get();
            updatedCustomer.setCustName(customerDetails.getCustName());
            updatedCustomer.setAddress1(customerDetails.getAddress1());
            updatedCustomer.setAddress2(customerDetails.getAddress2());
            updatedCustomer.setCity(customerDetails.getCity());
            updatedCustomer.setState(customerDetails.getState());
            updatedCustomer.setPin(customerDetails.getPin());
            updatedCustomer.setPhone(customerDetails.getPhone());
            service.saveCustomer(updatedCustomer);
            return ResponseEntity.ok(updatedCustomer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable long id) {
        if (service.getCustomerById(id).isPresent()) {
            service.deleteCustomer(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
