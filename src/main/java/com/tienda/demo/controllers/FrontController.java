package com.tienda.demo.controllers;

import com.tienda.demo.entities.Invoice;
import com.tienda.demo.services.InvoiceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {

    InvoiceService service;

    public FrontController(InvoiceService service){
        this.service = service;
    }



    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/invoices")
    public String invoices(Model model){
        List<Invoice> invoices = this.service.getInvoice();
        model.addAttribute("invoices", invoices);
        return "invoices";
    }

    @GetMapping("/invoices/new")
    public String newInvoice(){
        return "new-invoice";
    }

}
