/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.domain;


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
@Table(name = "Budget")
public class Budget {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    
    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "year", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate year;
    
    
    @Columns(columns = {@Column(name = "currency"), @Column(name = "grossAmount")})
    @Type(type = "org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyAmountAndCurrency")
    private Money grossAmount; // could be used for localization of our system in to different currencies with indepencence of buisness logic

   
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "orgUnitId")
    private OrgUnit orgUnit;
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Money getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Money grossAmount) {
        this.grossAmount = grossAmount;
    }

    public OrgUnit getOrgUnit() {
        return orgUnit;
    }

    public void setOrgUnit(OrgUnit orgUnit) {
        this.orgUnit = orgUnit;
    }

    @Override
    public String toString() {
        return "Budget{" + "id=" + id + ", year=" + year + ", grossAmount=" + grossAmount + ", orgUnit=" + orgUnit + '}';
    }
    
   
    
         
}
