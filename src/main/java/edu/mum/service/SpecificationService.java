/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service;

import edu.mum.domain.Specification;
import java.util.List;

/**
 *
 * @author Lina
 */
public interface SpecificationService {
        public void save(Specification specification);
	public void update(Specification specification);
	public List<Specification> findAll();
 	public Specification findOne(Long id);
    
}
