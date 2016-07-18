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
import javax.validation.constraints.Size;

/**
 *
 * @author Yoni
 */
@Entity
@Table(name = "OrgUnit")
public class OrgUnit {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
 
    @Size(min = 3, max = 100)
    @Column(name = "name", nullable = false)
    private String name;
    
    @Size(min = 3, max = 100)
    @Column(name = "accountNo", nullable = false)
    private String accountNo;
    
   @ManyToOne(fetch=FetchType.LAZY,  cascade = CascadeType.ALL) 
   @JoinColumn(name="organizationId") 
   Organization organization;
    
    
   
   @OneToMany(mappedBy="orgUnit", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
   List<Budget> budgets = new ArrayList<Budget>();       
    
   
   @OneToMany(mappedBy="requestingOrgUnit", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
   List<Request> requests = new ArrayList<Request>();      
   
   @OneToMany(mappedBy="approvingOrgUnit", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
   List<Request> approvals = new ArrayList<Request>();      


 
  

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

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public List<Budget> getBudgets() {
        return budgets;
    }

    public void setBudgets(List<Budget> budgets) {
        this.budgets = budgets;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public List<Request> getApprovals() {
        return approvals;
    }

    public void setApprovals(List<Request> approvals) {
        this.approvals = approvals;
    }

   

    @Override
    public String toString() {
    //    return "OrgUnit{" + "id=" + id + ", name=" + name + ", accountNo=" + accountNo + ", organization=" + organization + ", budgets=" + budgets + ", requests=" + requests + ", approvals=" + approvals + '}';
      return "";  
    }


   
    
}
