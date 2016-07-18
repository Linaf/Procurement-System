/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao.impl;

import edu.mum.dao.RoleDAO;
import edu.mum.domain.Role;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yoni
 */

@SuppressWarnings("unchecked")
@Repository
public class RoleDAOImpl extends GenericDAOImpl<Role> implements RoleDAO{

    public RoleDAOImpl() {
       super.setDaoType(Role.class);
	
    }

    @Override
    public List<Role> findByType() {
     return null;  
    } // this is to add additional feature to CRUD, Makesure you also add to RoleDAO interface
    
    
    
}
