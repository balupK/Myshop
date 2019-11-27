package com.myshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myshop.entities.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>  {

}
