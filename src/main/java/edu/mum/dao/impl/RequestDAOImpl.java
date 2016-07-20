/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao.impl;

import edu.mum.dao.RequestDAO;
import edu.mum.domain.Item;
import edu.mum.domain.Request;
import edu.mum.domain.RequestStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import org.joda.time.LocalDate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lina
 */
@SuppressWarnings("unchecked")
@Repository
public class RequestDAOImpl extends GenericDAOImpl<Request> implements RequestDAO {

    public RequestDAOImpl() {
       super.setDaoType(Request.class);
	
    }

    public List<Request> findByStat(RequestStatus stat) {
         CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		  CriteriaQuery<Request> criteriaQuery = cb.createQuery(Request.class);
		  Root<Request> c = criteriaQuery.from(Request.class);
		  ParameterExpression<RequestStatus> p = cb.parameter(RequestStatus.class);
        criteriaQuery.select(c).where(cb.equal(c.get("requestStatus"), stat)
                                    );
		 
        List<Request> requests = entityManager.createQuery(criteriaQuery).getResultList();
		  return requests;
    }

     public List<Request> findByListStat(List<RequestStatus> stats) {
        //TODO :: Add the method
        return null;
    }

   @Override
    public List<Request> findByDate(Date requestDate) {
    
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Request> criteriaQuery = cb.createQuery(Request.class);
        Root<Request> c = criteriaQuery.from(Request.class);
        ParameterExpression<RequestStatus> p = cb.parameter(RequestStatus.class);
        criteriaQuery.select(c).where(
                cb.equal(c.get("requestedDate"), requestDate)
        );
    
        List<Request> requests = entityManager.createQuery(criteriaQuery).getResultList();
        return requests;
    
}

}
