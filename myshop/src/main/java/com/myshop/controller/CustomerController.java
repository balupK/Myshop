package com.myshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myshop.Error.ErrorHandler;
import com.myshop.entities.Customer;
import com.myshop.services.CustomerService;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    
    @PostMapping(value="/custdetails")
    public ResponseEntity<?> createCustomer(@RequestBody Customer customer){
    	
    	ErrorHandler errorHandler = customerService.validateCustomer(customer);
    	if (errorHandler != null) {
    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorHandler);
    	}
        
    	Customer customerResponse = customerService.createCustomer(customer);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(customerResponse);
    }
}
