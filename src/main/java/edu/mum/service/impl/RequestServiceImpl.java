/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service.impl;

import edu.mum.dao.RequestDAO;
import edu.mum.domain.Request;
import edu.mum.domain.RequestStatus;

import edu.mum.service.RequestService;
import java.util.List;
import javax.transaction.Transactional;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lina
 */
@Service
@Transactional 
public class RequestServiceImpl implements RequestService{
    	
    @Autowired
    private RequestDAO requestDAO;

    public void save( Request request) {  		
	requestDAO.save(request);
    }
	
    public void update(Request request) {  		
	requestDAO.update(request);
    }
    public List<Request> findAll() {
	return (List<Request>)requestDAO.findAll();
    }

    public Request findOne(Long id) {
	return requestDAO.findOne(id);
    }

    @Override
    public List<Request> SearchByDate(String requestDate) {
        return requestDAO.findByDate(requestDate);
    }

    @Override
    public List<Request> SearchByStatus(RequestStatus s) {
        return requestDAO.findByStatus(s);
    }


}
