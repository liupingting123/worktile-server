package com.worktile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/test")
public class Test {
	@RequestMapping("/index")
	public String test1( )   {
		System.out.println("222");
	return  "index";
	}
	@RequestMapping("/2")
	public String test2( )   {

		return  "redirect:index";
	}
	@RequestMapping("/3")
	public String test3( )   {

		return  "login";
	}
}
