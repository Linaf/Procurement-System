/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao.impl;

import edu.mum.dao.ItemDAO;
import edu.mum.dao.SpecificationDAO;
import edu.mum.domain.Item;
import edu.mum.domain.Request;
import edu.mum.domain.RequestStatus;
import edu.mum.domain.Specification;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lina
 */

@SuppressWarnings("unchecked")
@Repository
public class ItemDAOImpl extends GenericDAOImpl<Item> implements ItemDAO{
     
//    @Autowired
//    private SpecificationDAO specDAO;
    
    public ItemDAOImpl() {
       super.setDaoType(Item.class);
	
    }

//    @Override
//    public void saveItem(Item i) {
//        Specification spec=specDAO.findOne((long)1);
//        i.setSpecification(spec);
//        this.save(i);
//    }

    @Override
    public List<Item> find(Item item) {
          return null;
    }


    
}
