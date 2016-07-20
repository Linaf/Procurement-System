/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service.impl;

import edu.mum.dao.EmployeeDAO;
import edu.mum.domain.Employee;
import edu.mum.service.EmployeeService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lina
 */
@Service
@Transactional 
public class EmployeeServiceImpl implements EmployeeService{
    	
    @Autowired
    private EmployeeDAO employeeDAO;

    public void save( Employee employee) {  		
	employeeDAO.save(employee);
    }
	
    public void update(Employee employee) {  		
	employeeDAO.update(employee);
    }
    public List<Employee> findAll() {
	return (List<Employee>)employeeDAO.findAll();
    }

    public Employee findOne(Long id) {
	return employeeDAO.findOne(id);
    }


}
