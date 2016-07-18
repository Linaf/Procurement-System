package edu.mum.controller;


import edu.mum.domain.Item;
import edu.mum.domain.RequestItem;
import edu.mum.domain.Specification;
import edu.mum.service.CategoryService;
import edu.mum.service.RequestItemService;
import edu.mum.service.SpecificationService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Lina
 */
@Controller
@RequestMapping(value="/requestItems")
public class RequestItemsController {

    @Autowired
    RequestItemService requestItemService;

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value="/get", method = RequestMethod.GET)
    public @ResponseBody List<RequestItem>  getRequestItems() {
       return requestItemService.findAll();
     } 
    
    @RequestMapping(value="/get/{id}", method = RequestMethod.GET)
    public @ResponseBody RequestItem  getRequestItem(long id) {
        return requestItemService.findOne(id);     
    } 
   
        
}
