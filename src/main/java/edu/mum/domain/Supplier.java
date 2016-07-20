/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.domain;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 *
 * @author Yoni
 */
@Entity
@Table(name = "Supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    
    @Size(min = 3, max = 200)
    @Column(name = "name", nullable = false)
    private String name;
     
    
    @Min(0)
    @Max(10)
    @Column(name="rank", columnDefinition="Decimal(2,2) default '0.00'")
    private int rank;
    
    @Size(min = 10, max = 200)
    @Column(name = "businessRegNo", nullable = false)
    private String businessRegNo;
    
    @Size(min = 3, max = 200)
    @Column(name = "buisnessType", nullable = false)
    private String buisnessType;
    
    
    
    @OneToMany(mappedBy="supplier", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    List<SupplierBid> supplierBid = new ArrayList<SupplierBid>(); 
     
    
    @OneToMany(mappedBy = "supplier", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Address> addresses = new ArrayList<Address>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "requestId")
    private Request request;
   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getBusinessRegNo() {
        return businessRegNo;
    }

    public void setBusinessRegNo(String businessRegNo) {
        this.businessRegNo = businessRegNo;
    }

    public String getBuisnessType() {
        return buisnessType;
    }

    public void setBuisnessType(String buisnessType) {
        this.buisnessType = buisnessType;
    }

    public List<SupplierBid> getSupplierBid() {
        return supplierBid;
    }

    public void setSupplierBid(List<SupplierBid> supplierBid) {
        this.supplierBid = supplierBid;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", name=" + name + ", rank=" + rank + ", businessRegNo=" + businessRegNo + ", buisnessType=" + buisnessType + ", supplierBid=" + supplierBid + ", addresses=" + addresses + '}';
    }

    
   

}
