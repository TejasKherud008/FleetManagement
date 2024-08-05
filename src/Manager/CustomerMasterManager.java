package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.CustomerMaster;

public interface CustomerMasterManager {
	List<CustomerMaster> getAllCustomers();
	Optional<CustomerMaster> getCustomerById(int id);
	CustomerMaster saveCustomer(CustomerMaster customer);
	void deleteCustomer(int id);
}
