package com.softech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OffersController {
	
	@RequestMapping("/")
	public String showhome(){
		
		return "head";
	}

	
	@RequestMapping("/milan")
	public String showhome1(){
		
		return "milan";
	}
	
}
