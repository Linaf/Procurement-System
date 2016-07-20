/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao;

import edu.mum.domain.Request;
import edu.mum.domain.RequestStatus;
import java.util.List;
import org.joda.time.LocalDate;

/**
 *
 * @author Lina
 */
public interface RequestDAO extends GenericDAO<Request> {
    public List<Request> findByStatus(RequestStatus s); //remove this if you want regular CRUD
   public List<Request> findByDate(String requestDate);
   
    
}
