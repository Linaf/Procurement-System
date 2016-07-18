/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.controller;

import edu.mum.domain.Category;
import edu.mum.domain.Item;
import edu.mum.domain.Request;
import edu.mum.domain.RequestItem;
import edu.mum.domain.Specification;
import edu.mum.service.CategoryService;
import edu.mum.service.ItemService;
import edu.mum.service.RequestItemService;
import edu.mum.service.RequestService;
import edu.mum.service.SpecificationService;
import static java.lang.System.in;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
 @RequestMapping(value="/requests")
public class RequestController {

    @Autowired
    RequestService requestService;
   
    @Autowired
    RequestItemService requestItemService;

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String getNewItem( Model  model) {
        Request item = new Request();
        //Specification spec = new Specification();
        model.addAttribute("item", item);
        //model.addAttribute("spec", spec);
        return "requestPage";
    } 
    @RequestMapping(value="/requestList", method = RequestMethod.GET)
    public String getItemsList( Model model) {
        return "itemlist";
    } 
    
    @RequestMapping(value="/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem(@RequestBody  Request item) {
              List<RequestItem> requestList =new ArrayList<RequestItem>();
      for(RequestItem s : item.getItems() ){
          
          requestList.addAll(item.getItems());
      }
        for(RequestItem i: item.getItems()){
            requestItemService.save(i);
        }
      

      
      item.setItems(requestList);
       requestService.save(item);
       
    } 
     @RequestMapping(value="/get", method = RequestMethod.GET)
    public @ResponseBody List<Request>  getItems() {
       return requestService.findAll();
     } 
      
    @RequestMapping("/")
    public String start(){
        return "redirect:/requestlist"; 
    }
    @RequestMapping(value = "/requestlist", method = RequestMethod.GET)
	public String getItems(Model model) {
        //    itemList = new ArrayList<>();
		List<Request>itemList = requestService.findAll();
		model.addAttribute("requestList", itemList);
		return "requestlist";
	}

	@RequestMapping(value = "/export", method = RequestMethod.GET)
	public ModelAndView getExcel() {
		//List<Item> itemList = itemservice.getItemList();
                
		return new ModelAndView("requestListExcel", "itemList", requestService.findAll());
	}
        
}
