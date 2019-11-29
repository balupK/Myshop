package com.myshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myshop.entities.Invoice;
import com.myshop.exception.ErrorCode;
import com.myshop.exception.MyshopException;
import com.myshop.services.InvoiceService;

@RestController
@RequestMapping(value = "/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping(value = "/createinvoice")
    public ResponseEntity<?> createInvoice(@RequestBody Invoice invoice) throws MyshopException {
        Invoice inv = null;
        if (invoice != null) {
            try {
                inv = invoiceService.createInvoice(invoice);
            } catch (NullPointerException e) {
                throw new MyshopException("Invoice data empty", ErrorCode.BAD_DATA);
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(inv);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(inv);
    }
}
