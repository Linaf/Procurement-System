/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.controller;

import edu.mum.domain.Category;
import edu.mum.domain.Item;
import edu.mum.domain.Specification;
import edu.mum.service.CategoryService;
import edu.mum.service.ItemService;
import edu.mum.service.SpecificationService;
import static java.lang.System.in;
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
 @RequestMapping(value="/items")
public class ItemController {

    @Autowired
    ItemService itemService;
   
    @Autowired
    SpecificationService specificationService;

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String getNewItem( Model  model) {
        Item item = new Item();
        //Specification spec = new Specification();
        model.addAttribute("item", item);
        //model.addAttribute("spec", spec);
        return "addItemPage";
    } 
    @RequestMapping(value="/itemList", method = RequestMethod.GET)
    public String getItemsList( Model model) {
        return "itemlist";
    } 
    
    @RequestMapping(value="/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem(@RequestBody  Item item) {
        Specification specInital = item.getSpecification();
        specificationService.save(specInital);
      long max = 0; 
      for(Specification specification : specificationService.findAll() ){
          if(max < specification.getId())
              max = specification.getId();
      }
      
      specInital.setId(max);
      item.setSpecification(specInital);
       itemService.saveItem(item);
       
    } 
     @RequestMapping(value="/get", method = RequestMethod.GET)
    public @ResponseBody List<Item>  getItems() {
       return itemService.findAll();
     } 
      
    @RequestMapping("/")
    public String start(){
        return "redirect:/itemlist"; 
    }
    @RequestMapping(value = "/itemlist", method = RequestMethod.GET)
	public String getItems(Model model) {
        //    itemList = new ArrayList<>();
		List<Item>itemList = itemService.findAll();
		model.addAttribute("itemList", itemList);
		return "itemlist";
	}

	@RequestMapping(value = "/export", method = RequestMethod.GET)
	public ModelAndView getExcel() {
		//List<Item> itemList = itemservice.getItemList();
                
		return new ModelAndView("ItemListExcel", "itemList", itemService.findAll());
	}
        
}
