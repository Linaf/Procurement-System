/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.controller;

import edu.mum.domain.SupplierBid;
import edu.mum.service.SupplierBidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Birhanu Gebresenbet
 */
@Controller 
@RequestMapping(value="/supplierBids")
public class SupplierBidController {
     @Autowired
     SupplierBidService supplierBidService;
     
     
    @RequestMapping(value="/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addBid(@RequestBody  SupplierBid supplierBid) {
        //check if the bid has not been  yet submitted  ... SupplierID + requestID Say You cant submit a bid twice
        supplierBidService.save(supplierBid);
       
    } 
    
   
}

