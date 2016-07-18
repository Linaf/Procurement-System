/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service.impl;

import edu.mum.dao.SpecificationDAO;
import edu.mum.domain.Specification;
import edu.mum.service.SpecificationService;
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
public class SpecificationServiceImpl implements SpecificationService{
    	
    @Autowired
    private SpecificationDAO specificationDAO;

    public void save( Specification specification) {  		
	specificationDAO.save(specification);
    }
	
    public void update(Specification specification) {  		
	specificationDAO.update(specification);
    }
    public List<Specification> findAll() {
	return (List<Specification>)specificationDAO.findAll();
    }

    public Specification findOne(Long id) {
	return specificationDAO.findOne(id);
    }


}
