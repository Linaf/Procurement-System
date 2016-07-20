/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.domain;


import java.util.Date;
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
@Table(name = "Budget")
public class Budget {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    
    @NotNull
   
    @Column(name = "year", nullable = false)
    private Date year;
    
    
    @Column(name = "grossAmount", nullable = false)
    private double grossAmount; // could be used for localization of our system in to different currencies with indepencence of buisness logic

   
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "orgUnitId")
    private OrgUnit orgUnit;
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getYear() {
        return  new java.sql.Date(year.getTime());
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
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
