package com.marcos.blog.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* WebsiteController
* @author: marcos
* @createDate: 2022/12/27
*/
@RestController
public class WebsiteController {

	@Value("${website.title}")
	private String title;

	/** 获取网站 title */
	@GetMapping("/getTitle")
	public String getTitle(){
		return title;
	}
	
}
