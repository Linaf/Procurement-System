/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao.impl;

import edu.mum.dao.SpecificationDAO;
import edu.mum.domain.Specification;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lina
 */

@SuppressWarnings("unchecked")
@Repository
public class SpecificationDAOImpl extends GenericDAOImpl<Specification> implements SpecificationDAO{

    public SpecificationDAOImpl() {
       super.setDaoType(Specification.class);
	
    }


    
}
