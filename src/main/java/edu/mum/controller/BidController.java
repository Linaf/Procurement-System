/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.controller;

import edu.mum.domain.Item;
import edu.mum.domain.Request;
import edu.mum.domain.RequestStatus;
import edu.mum.domain.SupplierBid;
import edu.mum.service.RequestService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Birhanu Gebresenbet
 */
@Controller
@RequestMapping(value = "/bids")

public class BidController {

    @Autowired
    RequestService requestService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getBid(Model model) {
       SupplierBid bid= new SupplierBid();
      // List<Request> reqs = requestService.findByStat(RequestStatus.approved);
      //  System.out.print(reqs.size());
        model.addAttribute("bid",bid);
        // model.addAttribute("categories", re categoryService.findAll());
        //model.addAttribute("spec", spec);
        return "bidPage";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem(@RequestBody SupplierBid item) {
        
       // item.setSpecification(spec);
  //  requestService.save(request);    itemService.saveItem(item);

    }

    @RequestMapping(value = "/get/{status}", method = RequestMethod.GET)
    public @ResponseBody
    List<Request> getBids(@PathVariable("status") RequestStatus status) {
        List<Request> reqs = requestService.findByStat(status);
        return reqs;// requestService.findByStat(RequestStatus.approved);
        //  return itemService.findAll();
    }
}
