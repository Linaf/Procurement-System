/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service.impl;

import edu.mum.dao.ItemDAO;
import edu.mum.domain.Item;
import edu.mum.service.ItemService;
import edu.mum.dao.SpecificationDAO;
import edu.mum.dao.SupplierBidDAO;
import edu.mum.domain.SupplierBid;
import edu.mum.service.SupplierBidService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Birhanu Gebresenbet
 */
@Service
@Transactional 
public class SupplierBidServiceImpl implements SupplierBidService{

        @Autowired
        SupplierBidDAO supplierBidDAO;
    @Override
    public void save(SupplierBid supplierBid) {
        supplierBidDAO.save(supplierBid);
    }

    @Override
    public void update(SupplierBid supplierBid) {
      supplierBidDAO.update(supplierBid);
    }

    @Override
    public List<SupplierBid> findAll() {
        return (List<SupplierBid>)supplierBidDAO.findAll();
    }

    @Override
    public SupplierBid findOne(Long id) {
      return supplierBidDAO.findOne(id);
    }

    

}
