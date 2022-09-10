package com.tienda.demo.controllers;

import com.tienda.demo.entities.Invoice;
import com.tienda.demo.services.InvoiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InvoiceController {

    InvoiceService service;

    public InvoiceController(InvoiceService service){
        this.service = service;
    }


    @GetMapping("/invoices")
    public List<Invoice> invoice(){
        return this.service.getInvoice();
    }

    @PostMapping("/invoices")
    public Invoice createInvoice(@RequestBody Invoice invoice){

        return this.service.createInvoice(invoice);
    }

}
