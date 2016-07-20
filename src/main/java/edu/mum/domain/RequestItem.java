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
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Yoni
 */
@Entity
@Table(name="RequestItem")
public class RequestItem {
    

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    @NotEmpty
    @Column(name = "quantity", nullable = false)
    private int quantity;
    
    @ManyToOne(fetch=FetchType.EAGER,  cascade = CascadeType.ALL) 
    @JoinColumn(name="requestId")
    Request request;
    
    @OneToOne(mappedBy="requestItem", cascade = CascadeType.PERSIST)
    private Item item;

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
      //  return "RequestItem{" + "id=" + id + ", quantity=" + quantity + ", request=" + request + ", item=" + item + '}';
      return "";
      }
    
    
    
    
    
    
}
