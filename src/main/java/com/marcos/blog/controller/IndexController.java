package com.marcos.blog.controller;

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

	/** 映射 index */
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("msg", "测试内容");
		return "index";
	}
	
}
