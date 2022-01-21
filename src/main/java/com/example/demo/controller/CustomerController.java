package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customer")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addCustomer(@RequestBody @Valid Customer customer) {
		customerService.addUser(customer);
		
		
			System.out.println(customer.getName());
			System.out.println(customer.getGender());
			System.out.println(customer.getDob());
			System.out.println(customer.getAddress());
			System.out.println(customer.getCity());
			System.out.println(customer.getState());
			System.out.println(customer.getPin());
			System.out.println(customer.getTelephone());
			System.out.println(customer.getFax());
			System.out.println(customer.getEmail());
		customerService.saveCustomer(customer);
		
	}
}