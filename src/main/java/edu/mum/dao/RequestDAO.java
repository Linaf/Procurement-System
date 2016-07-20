/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao;

import edu.mum.domain.Request;
import edu.mum.domain.RequestStatus;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Lina
 */
public interface RequestDAO extends GenericDAO<Request> {
    public List<Request> findByDate(Date requestDate);
    public List<Request> findByStat(RequestStatus stat);
    public List<Request> findByListStat(List<RequestStatus> stats);
    
}