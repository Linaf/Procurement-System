/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service;


import edu.mum.domain.RequestItem;
import java.util.List;

/**
 *
 * @author Lina
 */
public interface RequestItemService {
        public void save(RequestItem requestItem);
	public void update(RequestItem requestItem);
	public List<RequestItem> findAll();
 	public RequestItem findOne(Long id);
    
}
