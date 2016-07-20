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
@RequestMapping(value = "/requests")

public class RequestController {

    @Autowired
    RequestService requestService;

   
    @RequestMapping(value = "/get/{status}", method = RequestMethod.GET)
    public @ResponseBody
    List<Request> getRequests(@PathVariable("status") RequestStatus status) {
        List<Request> reqs = requestService.findByStat(status);
        return reqs;
    }
}
