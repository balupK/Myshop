package com.myshop.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.CustomerDao;
import com.myshop.entities.Customer;
import com.myshop.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

   
    @Autowired
    CustomerDao  customerDao;

    @Override
    public Customer createCustomer(Customer customer) {
        customerDao.save(customer);
        return customer;
    }

}
