package com.myshop.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.InvoiceDao;
import com.myshop.entities.Invoice;
import com.myshop.services.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService{
    
    @Autowired
    InvoiceDao invoiceDao;

    @Override
    public Invoice createInvoice(Invoice invoice) {
        Invoice inv = invoiceDao.save(invoice);
        return inv;
    }

}
