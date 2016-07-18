/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao.impl;

import edu.mum.dao.RequestItemDAO;
import edu.mum.domain.RequestItem;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lina
 */

@SuppressWarnings("unchecked")
@Repository
public class RequestItemDAOImpl extends GenericDAOImpl<RequestItem> implements RequestItemDAO{

    public RequestItemDAOImpl() {
       super.setDaoType(RequestItem.class);
	
    }


    
}
