package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nit.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	
	 @RequestMapping(value ="/reg", method= RequestMethod.GET)
	public String loadForm(Model model)
	{
		 
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		
	      
		return "register";
	
	}
	
	 @RequestMapping(value="/show", method = RequestMethod.POST)
	 public String dataForm( @ModelAttribute("employee") Employee employee,Model model)
	 {
		 
		 model.addAttribute("employee", employee);
		 
		 return "data";
		 
	 }
	
	
}
