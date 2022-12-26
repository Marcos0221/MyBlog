package com.marcos.blog.entity;

import java.util.Date;

/**
* Blog
* @author: marcos
* @createDate: 2022/12/26
*/
public class Blog {

	// 博客标题
	private String blog_title;

	// 博客内容
	private String blog_content;

	// 博客 发表/更新 时间
	private Date blog_date;

	// 博客标签
	private String[] blog_tag;

	// 博客访问次数
	private int blog_times;	

}
