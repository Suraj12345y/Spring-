package com.becoder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.becoder.entity.User;
import com.becoder.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	private UserService  userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/signin")
	public String login() {
		return "login";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User user,HttpSession session) {
		//System.out.println(user);
		
		User u=userService.saveUser(user);
		if(u!=null) {
			//System.out.println("save success...");
			session.setAttribute("msg", "Register Successfully");
		}else {
			//System.out.println("Error in server");
			session.setAttribute("msg", "something wrong on server");
			
		}
		
		
		return "redirect:/register";
	}
	
	
	
	
	

}
