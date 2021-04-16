package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
@Service(value="customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	public CustomerRepository customerRepository;

	

	@Override
	public List<Customer> getCustomer() {
		return customerRepository.findAll();
		
		
	}

	@Override
	public void addCustomer(Customer c) {
		customerRepository.save(c);
		
	}

	@Override
	public List<Customer> getCustomers() {
		
		return customerRepository.findAll();
	}

	@Override
	public List<Customer> getCustomerid() {
	  return customerRepository.findAll();
	}

}
