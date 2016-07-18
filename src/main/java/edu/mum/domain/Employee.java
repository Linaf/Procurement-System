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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

/**
 *
 * @author Yoni
 */
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;


    @Size(min = 3, max = 100)
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Size(min = 3, max = 100)
    @Column(name = "middleName", nullable = false)
    private String middleName;

    @Size(min = 3, max = 100)
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(columnDefinition = "enum('male','female')")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Size(min = 5, max = 100)
    @Column(name = "email", nullable = false)
    private String email;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "DOB", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate DOB;

    
    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Address> addresses = new ArrayList<Address>();


    @ManyToOne(fetch=FetchType.EAGER,  cascade = CascadeType.ALL) 
    @JoinColumn(name="roleId")
    Role role;
        
    //all request and approvals through orgunits
    @ManyToOne(fetch=FetchType.EAGER,  cascade = CascadeType.ALL) 
    @JoinColumn(name="positionId")
    Position position;
//    
    


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        //return "Employee{" + "personnelNumber=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", gender=" + gender + ", email=" + email + ", DOB=" + DOB + ", addresses=" + addresses + ", position=" + position + ", role=" + role + '}';
        return "";
    }

  
   

}
