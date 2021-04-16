package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {

//customer methods	
	public List<Customer> getCustomer();

	public void addCustomer(Customer c);

	
//for admin
	public List<Customer> getCustomers();

	public List<Customer> getCustomerid();

}
