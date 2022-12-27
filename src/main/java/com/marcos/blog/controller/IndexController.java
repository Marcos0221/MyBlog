package com.marcos.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* IndexController
* @author: marcos
* @createDate: 2022/12/26
*/
@Controller
public class IndexController {

	@Autowired
	private ApiController api;

	/** 映射 index */
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("title", api.getTitle());
		model.addAttribute("icon", api.getIcon());
		model.addAttribute("signature", api.getSignature());
		model.addAttribute("name", api.getName());
		return "index";
	}
	
}
