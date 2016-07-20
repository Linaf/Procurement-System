/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Yoni
 */
@Entity
@Table(name = "Item")
public class Item implements Serializable{
     @Id
    @GeneratedValue
    @Column(name = "itemId")
    private long id;

    
    @NotEmpty
    @Column(name = "serialNo", unique = true, nullable = false)
    private String serialNo;
    
    @Size(min = 3, max = 100)
    @Column(name = "name", nullable = false)
    private String name;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryId")
    private Category category;
    
   
   

   @OneToOne(cascade = CascadeType.ALL) 
   private Specification specification;
 
//    @JsonIgnore
//    @OneToOne(fetch=FetchType.EAGER,  cascade = CascadeType.ALL) 
//    @PrimaryKeyJoinColumn
//    private RequestItem requestItem;
    

    public Item() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "item", cascade = CascadeType.ALL)
    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

//    public RequestItem getRequestItem() {
//        return requestItem;
//    }
//
//    public void setRequestItem(RequestItem requestItem) {
//        this.requestItem = requestItem;
//    }
    
  
    

}
