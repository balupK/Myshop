package com.myshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myshop.entities.Invoice;

@Repository
public interface InvoiceDao extends JpaRepository<Invoice, Integer>{

}
