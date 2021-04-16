package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
@Controller
public class HomeController {
	@Autowired
	public CustomerService customerService;
	
	@RequestMapping("/home")
	public String getHome() {
		
		return "index";
	}
	
	
	
	@RequestMapping("/LoginSignupProcess")
	public String loginprocess(@RequestParam String action) {
		if(action.equalsIgnoreCase("Login"))
		{
			return "loginprocess";
		}
		else 
		{
			return "signupprocess";
		}
	}
	
	
	
	@RequestMapping("/loginprocessform")
	
	public String loginprocessform(@RequestParam Integer id,@RequestParam String name,Model model) {
	
		Customer c=new Customer(id,name);
		//Customer c1=new Customer();
		 List<Customer> list=(List<Customer>) customerService.getCustomer();
		
		//System.out.println(customer);
		/*if(c1.getId()==c.getId()) {
		    return "success";
		}
		else {
			return "index";
		}*/
		 
		int count=0;
		for(Customer c3:list) {
			if(c3.equals(c))
			{
			System.out.println(c3);
			c=c3;
			count=count+1;
			break;
			}	
			} 
		
		
		
		if(count>0)
		{
			return "success";
			
		}
		else
		{    
			model.addAttribute("msg","Please signup first");
			return "index";
		}
		
		
		
		
		
	}
	
	    @RequestMapping("/signupprocessform")
	    public String signupprocessform(@RequestParam Integer id,@RequestParam String name){
		    Customer c=new  Customer(id,name);
		    customerService.addCustomer(c);
		    return "index";
		
		}
	
	    @RequestMapping("/success")
	    public String success() {
	    	return "success";
	    }
	    @RequestMapping("/aftersuccess")
	    public String aftermethod(@RequestParam String action) {
	    	if(action.equalsIgnoreCase("casual")){
	    		return "casual";
	    	}
	    	if(action.equalsIgnoreCase("party")) {
	    		return "party";
	    		
	    	}
             if(action.equalsIgnoreCase("retro")) {
            	 return "retro";
	    		
	    	}
             if(action.equalsIgnoreCase("formal")) {
            	 return"formal";
 	    		
 	    	}
             if(action.equalsIgnoreCase("trendy")) {
 	    		
            	 return "trendy";
 	    	}
             else {
 	    		return "fancy";
 	    	}
	    }
	    @RequestMapping("/afterpayment")
	    public String processpayment() {
	    	return "paymentsuccess";
	    }
	    @RequestMapping("/payment")
	    public String payment() {
	    	return "payment";
	    }

	    @RequestMapping("/admin")
	    public String admin() {
	    	return "admin";
	    }
	    
	    @RequestMapping("/adminform")
	    public String adminprocess(@RequestParam String name,@RequestParam String password, Model model) {
	    	
	    	
	    	if(password.equals("ThinkPad@66")) {
	    		
	    	
	    	return "index";
	    	}
	    	else
	    	{
	    		model.addAttribute("msg","Invalid details");
	    		return "admin";
	    	}
	    	
	    	
	    	
	    }
	
	

}
