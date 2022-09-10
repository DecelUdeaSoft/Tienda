package com.tienda.demo.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invoice_id")
    private long id;
    @Column(name= "amount")
    private double amount;
    @Column(name = "invoice_Date")
    private LocalDate invoiceDate;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;
    public Invoice(){

    }
    public Invoice(double amount, LocalDate invoiceDate, User user ) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getInvoice() {
        return invoiceDate;
    }

    public void setInvoice(LocalDate invoice) {
        this.invoiceDate = invoice;
    }
}
