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
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Yoni
 */
@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
 
    @Size(min = 3, max = 100)
    @Column(name = "userName", nullable = false)
    private String userName;
    
    @Size(min = 3, max = 200)
    @Column(name = "password", nullable = false)
    private String password;
    
    @ManyToOne(fetch=FetchType.EAGER,  cascade = CascadeType.ALL) 
    @JoinColumn(name="roleId") 
    private Role role;  
    
    Boolean enabled;
    
  

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

        
    @Override
    public String toString() {
        return "";
//  return "Account{" + "id=" + id + ", userName=" + userName + ", password=" + password + ", role=" + role + '}';
    }

    

   
}
