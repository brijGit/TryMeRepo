package com.app.web.controller;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.pojo.Categories;
import com.app.pojo.Customers;
import com.app.web.ServiceApi.ICustomerService;



@Controller
public class HomeController {
	
	@Autowired
	ICustomerService service;
	
	@RequestMapping("/index")	
	public ModelAndView index(){
		String message = "Hello World, Spring 3.0!";
        return new ModelAndView("index", "message", message); 
	}
	
	@RequestMapping("/formsub")	
	public ModelAndView formSub(){
		
		List lst=service.getCategories();
		String message = "Hello World, Spring 3.0!";
        return new ModelAndView("home", "Product_list", lst); 
	}
}
	