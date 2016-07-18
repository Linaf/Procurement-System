/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service;

import edu.mum.domain.Category;
import java.util.List;

/**
 *
 * @author Lina
 */
public interface CategoryService {
        public void save(Category category);
	public void update(Category category);
	public List<Category> findAll();
 	public Category findOne(Long id);
    
}
