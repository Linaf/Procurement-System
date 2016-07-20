/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.domain;

import edu.mum.domain.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Yoni
 */
@Entity
@Table(name = "Organization")
public class Organization {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Size(min = 3, max = 100)
    @Column(name = "name", nullable = false)
    private String name;
    
    @Size(min = 3, max = 255)
    @Column(name = "logo", nullable = false)
    private String logo;
    
    
    @Column(name = "description", nullable = false)
    private String description;
    
    @Size(min = 3, max = 255)
    @Column(name = "moto", nullable = false)
    private String moto;
    
   
    @OneToMany(mappedBy = "organization", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<OrgUnit> orgUnits = new ArrayList<OrgUnit>();

   

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public List<OrgUnit> getOrgUnits() {
        return orgUnits;
    }

    public void setOrgUnits(List<OrgUnit> orgUnits) {
        this.orgUnits = orgUnits;
    }

    @Override
    public String toString() {
        return "Organization{" + "id=" + id + ", name=" + name + ", logo=" + logo + ", description=" + description + ", moto=" + moto + ", orgUnits=" + orgUnits + '}';
    }

    
    
}
