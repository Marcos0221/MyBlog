package com.marcos.blog.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: marcos
 * @createDate: 2022/12/25
*/
@RestController
@RequestMapping("/api")
public class ApiController {

	@Value("${user.config.qq}")
	private String qq;

	@Value("${user.config.signature}")
	private String signature;

	@Value("${user.config.background_music}")
	private String music;

	@Value("${website.title}")
	private String title;

	@Value("${user.config.name}")
	private String name;

	/** 获取 QQ 头像链接 */
	@GetMapping("/getIcon")
	public String getIcon(){
		return String.format("https://q1.qlogo.cn/g?b=qq&nk=%s&s=640", qq);
	}

	/** 获取 QQ 个性签名 */
	@GetMapping("/getSignature")
	public String getSignature(){
		return signature;
	}

	/** 获取背景音乐 */
	@GetMapping("/getMusic")
	public String getMusic(){
		return music;
	}

	/** 获取网站 title */
	@GetMapping("/getTitle")
	public String getTitle(){
		return title;
	}

	/** 获取 QQ 昵称 */
	@GetMapping("/getName")
	public String getName(){
		return name;
	}

}
