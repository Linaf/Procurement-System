/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao.impl;

import edu.mum.dao.EmployeeDAO;
import edu.mum.dao.RoleDAO;
import edu.mum.domain.Employee;
import edu.mum.domain.Position;
import edu.mum.domain.Role;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lina
 */

@SuppressWarnings("unchecked")
@Repository
public class EmployeeDAOImpl extends GenericDAOImpl<Employee> implements EmployeeDAO{

    public EmployeeDAOImpl() {
       super.setDaoType(Employee.class);
	
    }

    @Override
    public List<Employee> findByPosition() {
     return null;  
    } // this is to add additional feature to CRUD, Makesure you also add to RoleDAO interface

    @Override
    public Position findPosition(Employee e) {
        return e.getPosition();
    }
    
    
    
}
