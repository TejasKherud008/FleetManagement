package com.example.demo.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.CustomerMaster;
import com.example.demo.repositories.CustomerMasterRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerMasterManagerImpl {

    @Autowired
    private CustomerMasterRepository customerMasterRepository;

    public List<CustomerMaster> getAllCustomers() {
        return customerMasterRepository.findAll();
    }

    public Optional<CustomerMaster> getCustomerById(Long id) {
        return customerMasterRepository.findById(id);
    }

    public CustomerMaster saveCustomer(CustomerMaster customer) {
        return customerMasterRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
    	customerMasterRepository.deleteById(id);
    }
}

