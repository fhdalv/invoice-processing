package com.invoiceprocessing.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //to auto create table in database using hibernate
public class Invoice {

    @Id //indicating id as primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // to auto generate random value in id.
    private long id;
    private String  vendor;
    private String  produck;
    private int amount;
    private String date;
    private String action;

    public Invoice() {}

    public Invoice(long id, String vendor, String produck, int amount, String date, String action) {
        this.id = id;
        this.vendor = vendor;
        this.produck = produck;
        this.amount = amount;
        this.date = date;
        this.action = action;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProduck() {
        return produck;
    }

    public void setProduck(String produck) {
        this.produck = produck;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
