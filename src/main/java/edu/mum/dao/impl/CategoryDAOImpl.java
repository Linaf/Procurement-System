/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao.impl;

import org.springframework.stereotype.Repository;
import edu.mum.dao.CategoryDAO;
import edu.mum.domain.Category;

/**
 *
 * @author lina
 */

@SuppressWarnings("unchecked")
@Repository
public class CategoryDAOImpl extends GenericDAOImpl<Category> implements CategoryDAO{

    public CategoryDAOImpl() {
       super.setDaoType(Category.class);
	
    }


    
}
