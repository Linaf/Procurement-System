/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service;

import edu.mum.domain.Employee;
import java.util.List;

/**
 *
 * @author Lina
 */
public interface EmployeeService {
        public void save(Employee employee);
	public void update(Employee employee);
	public List<Employee> findAll();
 	public Employee findOne(Long id);
    
}
