/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service.impl;

import edu.mum.dao.ItemDAO;
import edu.mum.domain.Item;
import edu.mum.service.ItemService;
import edu.mum.dao.SpecificationDAO;
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
public class ItemServiceImpl implements ItemService{
    	
    @Autowired
    private ItemDAO itemDAO;
    @Autowired
    private SpecificationDAO specDAO;

    public void save( Item item) {  
	itemDAO.save(item);
    }
	
    public void update(Item item) {  		
	itemDAO.update(item);
    }
    public List<Item> findAll() {
		return (List<Item>)itemDAO.findAll();
    }

    public Item findOne(Long id) {
		return itemDAO.findOne(id);
    }
    
    public void saveItem(Item item){
        item.setSpecification(specDAO.findOne((long)1));
        itemDAO.save(item);
    }
}
