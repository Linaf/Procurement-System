/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service;

import edu.mum.domain.Role;
import java.util.List;

/**
 *
 * @author Yoni
 */
public interface RoleService {
        public void save(Role role);
	public void update(Role role);
	public List<Role> findAll();
 	public Role findOne(Long id);
    
}
