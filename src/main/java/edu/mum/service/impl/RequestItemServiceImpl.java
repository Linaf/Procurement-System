/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service.impl;

import edu.mum.dao.RequestItemDAO;
import edu.mum.domain.RequestItem;
import edu.mum.service.RequestItemService;
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
public class RequestItemServiceImpl implements RequestItemService{
    	
    @Autowired
    private RequestItemDAO requestItemDAO;

    public void save( RequestItem requestItem) {  		
	requestItemDAO.save(requestItem);
    }
	
    public void update(RequestItem requestItem) {  		
	requestItemDAO.update(requestItem);
    }
    public List<RequestItem> findAll() {
	return (List<RequestItem>)requestItemDAO.findAll();
    }

    public RequestItem findOne(Long id) {
	return requestItemDAO.findOne(id);
    }


}
