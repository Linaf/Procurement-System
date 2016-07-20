/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service.impl;

import edu.mum.dao.RoleDAO;
import edu.mum.domain.Role;
import edu.mum.service.RoleService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yoni
 */
@Service
@Transactional 
public class RoleServiceImpl implements RoleService{
    	
    @Autowired
    private RoleDAO roleDAO;

    public void save( Role role) {  		
	roleDAO.save(role);
    }
	
    public void update(Role role) {  		
	roleDAO.update(role);
    }
    public List<Role> findAll() {
		return (List<Role>)roleDAO.findAll();
    }

    public Role findOne(Long id) {
		return roleDAO.findOne(id);
    }
}
