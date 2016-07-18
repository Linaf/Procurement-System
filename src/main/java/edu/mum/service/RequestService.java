/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service;

import edu.mum.domain.Request;
import edu.mum.domain.RequestStatus;
import java.util.List;
import org.joda.time.LocalDate;

/**
 *
 * @author Lina
 */
public interface RequestService {
        public void save(Request request);
	public void update(Request request);
	public List<Request> findAll();
 	public Request findOne(Long id);
        public List<Request> SearchByDate(String requestDate); 
        public List<Request> SearchByStatus(RequestStatus s);
}
