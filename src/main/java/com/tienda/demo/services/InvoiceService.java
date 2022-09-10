package com.tienda.demo.services;

import com.tienda.demo.entities.Invoice;
import com.tienda.demo.repositories.InvoiceRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    private InvoiceRepo repo;

    public InvoiceService(InvoiceRepo repo){
        this.repo = repo;
    }

    public List<Invoice> getInvoice(){
        return this.repo.findAll();
    }

    public Invoice createInvoice(Invoice newInvoice){
        return this.repo.save(newInvoice);
    }
}
