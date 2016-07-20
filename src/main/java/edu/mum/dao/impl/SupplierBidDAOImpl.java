/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao.impl;

import edu.mum.dao.SupplierBidDAO;
import edu.mum.domain.SupplierBid;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Birhanu Gebresenbet
 */
@SuppressWarnings("unchecked")
@Repository
public class SupplierBidDAOImpl  extends GenericDAOImpl<SupplierBid> implements SupplierBidDAO{
public SupplierBidDAOImpl(){
    super.setDaoType(SupplierBid.class);
}

    
    
}