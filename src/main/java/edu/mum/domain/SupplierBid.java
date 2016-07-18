/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.domain;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Type;
import org.joda.money.Money;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

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
  
    @NotNull
    @Columns(columns = {@Column(name = "currency"), @Column(name = "amount")})
    @Type(type = "org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyAmountAndCurrency")
    private Money amount; // could be used for localization of our system in to different currencies with indepencence of buisness logic


    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "date", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate date;

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

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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
