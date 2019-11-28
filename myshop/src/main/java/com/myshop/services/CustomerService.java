package com.myshop.services;

import com.myshop.Error.ErrorHandler;
import com.myshop.entities.Customer;

public interface CustomerService {
    
    public Customer createCustomer(Customer customer);
    
    public Customer updateCustomer(Customer customer);
    
    public ErrorHandler validateCustomer(Customer customer);
    
    

}
