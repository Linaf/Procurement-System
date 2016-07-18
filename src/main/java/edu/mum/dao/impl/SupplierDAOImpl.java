/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao.impl;

import edu.mum.dao.SupplierDAO;
import edu.mum.domain.Request;
import edu.mum.domain.RequestItem;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Birhanu Gebresenbet
 */
@SuppressWarnings("unchecked")
@Repository
public class SupplierDAOImpl  extends GenericDAOImpl<RequestItem> implements SupplierDAO{
public SupplierDAOImpl(){
    super.setDaoType(RequestItem.class);
}

    
    
}