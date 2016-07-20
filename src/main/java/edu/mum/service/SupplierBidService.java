/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service;

import edu.mum.domain.SupplierBid;
import java.util.List;

/**
 *
 * @author Birhanu Gebresenbet
 */
public interface SupplierBidService {
        public void save(SupplierBid supplierBid);
	public void update(SupplierBid supplierBid);
	public List<SupplierBid> findAll();
 	public SupplierBid findOne(Long id);
       
}
