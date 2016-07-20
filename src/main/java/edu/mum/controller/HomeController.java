package edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
  
@Controller
public class HomeController {

 
	@RequestMapping({"/","/welcome"})
	public String welcome(Model model) {
		
		model.addAttribute("greeting", "Welcome to our community, Kimosabe!!");
		model.addAttribute("tagline", "The one and only place to live, work and play!!");
		
		return "base.definition";
	}
        @RequestMapping("/bid")
	public String loadBid(Model model) {
		return "bidPage";
	}
        
        
        
        
        
    
    
        
 
}
