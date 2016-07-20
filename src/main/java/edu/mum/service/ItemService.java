/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service;

import edu.mum.domain.Item;
import edu.mum.domain.Role;
import java.util.List;

/**
 *
 * @author Lina
 */
public interface ItemService {
        public void save(Item item);
	public void update(Item item);
	public List<Item> findAll();
 	public Item findOne(Long id);
        public void saveItem(Item item);
    
}
