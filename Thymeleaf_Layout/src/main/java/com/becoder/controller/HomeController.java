package com.becoder.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.becoder.entity.User;

import org.springframework.ui.Model;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(Model m)
	
	{
		return "index";
	}
	
	@GetMapping("/profile")
	public String profile(Model m)
	
	{
		return "profile";
	}
	@GetMapping("/about")
	public String about(Model m)
	
	{
		return "about";
	}



}
