/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.controller;

import edu.mum.domain.Category;
import edu.mum.domain.Item;
import edu.mum.service.CategoryService;
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
 @RequestMapping(value="/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;
       

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value="/get", method = RequestMethod.GET)
    public @ResponseBody List<Category>  getCatagories() {
       return categoryService.findAll();
     } 
    
    @RequestMapping(value="/get/{id}", method = RequestMethod.GET)
    public @ResponseBody Category  getCatagory(long id) {
        return categoryService.findOne(id);     
    } 
   
        
}
