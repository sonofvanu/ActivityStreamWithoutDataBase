package com.activity.stream.restservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {
	
	@RequestMapping("/")
	public String gotoIndex()
	{
		return "index";
	}

}
