/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.controller;

import edu.mum.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Yoni
 */
@Controller
public class RoleController {

    @Autowired
    RoleService roleService;
    
    
	@RequestMapping("/roles")
	public String roles(Model model) {
               model.addAttribute("roles",roleService.findAll());
		return "roles";
	}
 
}
