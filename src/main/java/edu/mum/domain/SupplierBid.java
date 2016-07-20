/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.domain;


import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Yoni
 */
@Entity
@Table(name = "SupplierBid")
public class SupplierBid {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
  
    @Column(name = "amount", nullable = false)
    private double amount; 



    @Column(name = "date")
    private Date date;

    @ManyToOne(fetch=FetchType.EAGER,  cascade = CascadeType.ALL) 
    @JoinColumn(name="supplierId")
    private Supplier supplier;
    
   
    @ManyToOne(fetch=FetchType.EAGER,  cascade = CascadeType.ALL) 
    @JoinColumn(name="requestId")
    private Request request;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return  new java.sql.Date(date.getTime());
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }


    @Override
    public String toString() {
        //return "SupplierBid{" + "amount=" + amount + ", date=" + date + ", supplier=" + supplier + ", request=" + request + '}';
        return "";
    }
   
    
    
}
