package com.myshop.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.Error.ErrorHandler;
import com.myshop.dao.CustomerDao;
import com.myshop.entities.Customer;
import com.myshop.services.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	Logger log = LoggerFactory.getLogger("CustomerService");

   
    @Autowired
    CustomerDao  customerDao;

    @Override
    public Customer createCustomer(Customer customer) {
    	//customer.setCreated_date(new Date().toString());
        Customer cus = customerDao.saveAndFlush(customer);
        return cus;
    }
    
    public ErrorHandler validateCustomer(Customer customer) {
    	
    	ErrorHandler err = null;
    	List<String> errorMessages = new ArrayList<String>();
    	
		if (customer.getName()== null) {
			errorMessages.add("Customer name should not be empty");
		}
		
		if (customer.getShopname()== null) {
			errorMessages.add("Customer shop name should not be empty");
		}
//		if (customer.getMobile1() < 1000000000) {
//			errorMessages.add("Customer mobile should not be empty");
//		}
		if (customer.getGstno()== null || customer.getGstno().length() !=14) {
			errorMessages.add("Customer Gstno should not be empty");
		}
		if (customer.getPincode() <  100000) {
			errorMessages.add("Customer Pincode should not be empty");
		}
		if (customer.getState()== null) {
			errorMessages.add("Customer State should not be empty");
		}
		
		if (errorMessages.size() > 0) {
			err = new ErrorHandler();
			err.setErrorMessagesDetails(errorMessages);
			err.setMessage("Failed to create customer");
			err.setDate(new Date().toString());
			log.info("Failed to create customer");
		} else {
			log.info("Customer validated successfully");	
		}
		
		return err;
		
	}

	@Override
    public Customer updateCustomer(Customer customer) {
        Customer cus = customerDao.saveAndFlush(customer);
        log.info("Customer saved and id is :" , cus.getCsid());
        return cus;
    }

}
