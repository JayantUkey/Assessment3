package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CustomerController {
	
	@RequestMapping("/customer")
	public String sayCustomer()
	{
		return "customerLogin";
	}
	
	@RequestMapping("/register")
	 public String sayHello(@RequestParam("cId") String cId,@RequestParam("name") String name,@RequestParam("phone") String phone,@RequestParam("add") String add,@RequestParam("login") String login,@RequestParam("pass") String pass, Model m)
	 {
		String m1 = "Hello "+name +" you registered successfully";
		  String m2 = "Your's";
		  String m3 = "Customer Id : "+cId;
		  String m4 = "Phone No : "+phone;
		  String m5 = "Address : "+add;
		  String m6 = "Login Id : "+login;
		  String m7="Password : "+pass;
		  
		  m.addAttribute("first",m1);
		  m.addAttribute("second",m2);
		  m.addAttribute("third",m3);
		  m.addAttribute("fourth",m4);
		  m.addAttribute("fifth",m5);
		  m.addAttribute("sixth",m6);
		  m.addAttribute("seventh",m7);
		  
		  return "viewpage";
	 }

}
