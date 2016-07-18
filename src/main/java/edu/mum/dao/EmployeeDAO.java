/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao;

import edu.mum.domain.Employee;
import edu.mum.domain.Position;
import edu.mum.domain.Role;
import java.util.List;

/**
 *
 * @author Lina
 */
public interface EmployeeDAO extends GenericDAO<Employee> {
    public List<Employee> findByPosition(); //remove this if you want regular CRUD
    public Position findPosition(Employee e);
   
    
}
