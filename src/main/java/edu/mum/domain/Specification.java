/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author Yoni
 */
@Entity
@Table(name = "Specification")
public class Specification implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "specId")  
    private long id;


    @Column(name = "year")
    private Date year;
    
   
    @Column(name = "bestBefore")
    private Date bestBefore;
    
    @Column(name = "price" , precision=19, scale=2)
    private double price; 
    
//    @JsonIgnore
//   @OneToOne(mappedBy="specification", cascade = CascadeType.PERSIST) 
//    private Item item;
    @OneToOne(optional= false , targetEntity=Item.class, mappedBy = "specification")
    @PrimaryKeyJoinColumn   
    private Item item;  

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.sql.Date getYear() {
        // as LocalDate of Java 8 is hard to serallize we can revert to Date and make it immuitable
      return new java.sql.Date(year.getTime()); // now we are creating a new Object using Value and returning a new Date Object ,
                                                   // Now Format is good and immuitable is also preserved!!
     }

    public void setYear(Date year) {
        this.year = year;
    }

    public Date getBestBefore() {
        return new java.sql.Date(bestBefore.getTime()); 
    }

    public void setBestBefore(Date bestBefore) {
        this.bestBefore = bestBefore;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

   
   

    @Override
    public String toString() {
        return "Specification{" + "id=" + id + ", year=" + year + ", bestBefore=" + bestBefore + ", estimatedPice=" + price  + '}';
       
    }
    
    
    
    

    
}
