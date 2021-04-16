package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class RestAPIController {
	@Autowired
	public CustomerService customerService;
	
	@GetMapping("/customer")
	
	public List<Customer> allCustomers() {
		return this.customerService.getCustomers();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Integer id)
	{
		int count=0;
	    List<Customer> customer=customerService.getCustomerid();
	   Customer c2=new Customer();
	    for(Customer c3:customer)
	    {
	    	if(c3.getId()==id)
	    	{
	    		System.out.println(id);
	    		//c3=c4;
	    		
	    	    //return c3;
	    		c2=c3;
	    	    count=count+1;
	    	    break;
	    	}
	    	
	    }
	    if(count>=1)
	    {
	    	return c2;
	    }
	    else
	    {
	    	return null;
	    }
		
	}

}
