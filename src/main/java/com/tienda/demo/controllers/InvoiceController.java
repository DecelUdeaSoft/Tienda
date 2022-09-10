package com.tienda.demo.controllers;

import com.tienda.demo.entities.Invoice;
import com.tienda.demo.services.InvoiceService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoiceController {

    InvoiceService service;

    public InvoiceController(InvoiceService service){
        this.service = service;
    }


/*    @GetMapping("/invoices")
    public List<Invoice> invoice(){
        return this.service.getInvoice();
    }*/

    @PostMapping("/invoices")
    public Invoice createInvoice(@ModelAttribute @DateTimeFormat(pattern = "YYYY-MM-DD") Invoice invoice, Model model){
        model.addAttribute(invoice);

        return this.service.createInvoice(invoice);
    }

}
