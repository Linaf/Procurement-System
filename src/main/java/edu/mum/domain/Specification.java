/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Yoni
 */
@Entity
@Table(name = "Specification")
public class Specification {

    
    @Id
    @Column(name="specId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

//    @JsonSerialize(using = LocalDateSerializer.class)
//    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    //@JsonDeserialize(using = LocalDateDeserializer.class)
//    @JsonDeserialize(using=LocalDateDeserializer.class)
    
   // @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "year")
    private String year;
    
   
    @Column(name = "bestBefore")
    private String bestBefore;
    
    @Column(name = "price" , precision=19, scale=2)
    private double price; 
    
   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(String bestBefore) {
        this.bestBefore = bestBefore;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Specification{" + "id=" + id + ", year=" + year + ", bestBefore=" + bestBefore + ", estimatedPice=" + price +  '}';
       
    }
    
    
    
    

    
}
