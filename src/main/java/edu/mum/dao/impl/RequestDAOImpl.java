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
import java.util.List;
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
public class RequestDAOImpl extends GenericDAOImpl<Request> implements RequestDAO{

    public RequestDAOImpl() {
       super.setDaoType(Request.class);
	
    }

    @Override
    public List<Request> findByStatus(RequestStatus s) {
        List<Request> temp = this.findAll();
         List<Request> result =new ArrayList<Request>();
        for(Request r:temp){
             if(r.getRequestStatus()==s)
                 result.add(r);
        }
        
        return result;
        
    }
    public List<Request> findByStat(RequestStatus s){
         CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		  CriteriaQuery<Request> criteriaQuery = cb.createQuery(Request.class);
		  Root<Request> c = criteriaQuery.from(Request.class);
		  ParameterExpression<RequestStatus> p = cb.parameter(RequestStatus.class);
		  criteriaQuery.select(c).where( 
                                         cb.equal(c.get("requestStatus"),s)
                                    );
		 
	 	  List<Request> requests =  entityManager.createQuery(criteriaQuery).getResultList();
		  return requests;
    }

//    @Override
//    public List<Request> findByDate(LocalDate requestDate) {
//           List<Request> temp = this.findAll();
//         List<Request> result =new ArrayList<Request>();
//        for(Request r:temp){
//             if(r.getRequestedDate().toDate().compareTo(requestDate.toDate())==0)
//                 result.add(r);
//        }
//        
//        return result;
//    }

    
   @Override
    public List<Request> findByDate(String requestDate) {
           List<Request> temp = this.findAll();
         List<Request> result =new ArrayList<Request>();
//        for(Request r:temp){
//             if(r.getRequestedDate().compareTo(requestDate.toDate())==0)
//                 result.add(r);
//        }
//        
        return result;
    }
    
    
    
}
