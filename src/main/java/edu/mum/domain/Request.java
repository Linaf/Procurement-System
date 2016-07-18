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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Yoni
 */

    
@Entity
@Table(name="Request")
public class Request {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

//    @NotNull
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
//    @Column(name = "requestedDate", nullable = false)
//    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
     @Column(name = "requestedDate")
    private String requestedDate;    
   
   
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
//    @Column(name = "approvedDate", nullable = false)
//    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
     @Column(name = "approvedDate")
     private String approvedDate;
    
    
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
//    @Column(name = "declinedDate", nullable = false)
//    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
      @Column(name = "declinedDate")
    private String declinedDate;
    
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
//    @Column(name = "purchasedDate", nullable = false)
//    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    @Column(name = "purchasedDate")
    private String purchasedDate;
   
     
    @Column(columnDefinition = "enum('requested','approved','pending','declined','purchased')")
    @Enumerated(EnumType.STRING)
    private RequestStatus requestStatus = RequestStatus.requested;

    //requestedBy
//    @ManyToOne(fetch=FetchType.EAGER,  cascade = CascadeType.ALL) 
//    @JoinColumn(name="requestingEmployeeId") 
//    Employee requestingEmployeeId; 
//    
//    //approvedBy
//    @ManyToOne(fetch=FetchType.EAGER,  cascade = CascadeType.ALL) 
//    @JoinColumn(name="approvingEmployeeId") 
//    Employee approvingEmployeeId;
    
        
   //Requesting OrgUnit
    @ManyToOne(fetch=FetchType.EAGER) 
    @JoinColumn(name="requestingOrgUnit")
    private OrgUnit requestingOrgUnit;
    
    @ManyToOne(fetch=FetchType.EAGER) 
    @JoinColumn(name="approvingOrgUnit")
    OrgUnit approvingOrgUnit;
    
    
   
   @OneToMany(mappedBy="request", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
   List<RequestItem> items = new ArrayList<RequestItem>(); 

   @OneToMany(mappedBy="request", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
   List<SupplierBid> supplierBids = new ArrayList<SupplierBid>(); 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(String approvedDate) {
        this.approvedDate = approvedDate;
    }

    public String getDeclinedDate() {
        return declinedDate;
    }

    public void setDeclinedDate(String declinedDate) {
        this.declinedDate = declinedDate;
    }

    public String getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(String purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

   

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public List<RequestItem> getItems() {
        return items;
    }

    public void setItems(List<RequestItem> items) {
        this.items = items;
    }

    public OrgUnit getRequestingOrgUnit() {
        return requestingOrgUnit;
    }

    public void setRequestingOrgUnit(OrgUnit requestingOrgUnit) {
        this.requestingOrgUnit = requestingOrgUnit;
    }

    public OrgUnit getApprovingOrgUnit() {
        return approvingOrgUnit;
    }

    public void setApprovingOrgUnit(OrgUnit approvingOrgUnit) {
        this.approvingOrgUnit = approvingOrgUnit;
    }

    
    public List<SupplierBid> getSupplierBids() {
        return supplierBids;
    }

    public void setSupplierBids(List<SupplierBid> supplierBids) {
        this.supplierBids = supplierBids;
    }



   
    
    @Override
    public String toString() {
        //return "Request{" + "requestNo=" + requestNo + ", requestedDate=" + requestedDate + ", approvedDate=" + approvedDate + ", declinedDate=" + declinedDate + ", purchasedDate=" + purchasedDate + ", requestStatus=" + requestStatus + ", requestingEmployeeId=" + requestingEmployeeId + ", approvingEmployeeId=" + approvingEmployeeId + ", requestingOrgUnit=" + requestingOrgUnit + ", approvingOrgUnit=" + approvingOrgUnit + ", items=" + items + ", supplierBid=" + supplierBid + '}';
        return "";
    }

    
    
}
