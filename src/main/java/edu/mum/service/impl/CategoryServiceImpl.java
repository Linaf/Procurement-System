/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service.impl;

import edu.mum.dao.CategoryDAO;
import edu.mum.dao.ItemDAO;
import edu.mum.domain.Category;
import edu.mum.domain.Category;
import edu.mum.service.CategoryService;
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
public class CategoryServiceImpl implements CategoryService{
    	
    @Autowired
    private CategoryDAO categoryDAO;

    public void save( Category category) {  		
	categoryDAO.save(category);
    }
	
    public void update(Category category) {  		
	categoryDAO.update(category);
    }
    public List<Category> findAll() {
	return (List<Category>)categoryDAO.findAll();
    }

    public Category findOne(Long id) {
	return categoryDAO.findOne(id);
    }


}
