package org.wdba.wdba.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.wdba.wdba.bean.User;
//import org.wdba.wdba.service.LoginDashboardService;
import org.wdba.wdba.service.UserService;

@Controller
public class LoginDashboardController {
	
	//LoginDashboardService  loginDashSer;

	@Autowired
	UserService userService;
	/*
	@GetMapping({"/chatbot"})
	public String chat() {
		System.out.println("show chat page");
		return "chatbot";
	}
	

	@GetMapping({"/LoginDashboard"})
	public String index() {
		System.out.println("Show Dashboard Page");

		return "LoginDashboard";
	}

	
	@GetMapping({"/forget"})
	public String forgetPassword() {
		System.out.println("show forgetPassword page");
		return "forget";
	}
	
	@PostMapping("/forget")
	public ModelAndView show(@RequestParam("email") String email) {

		//System.out.println(num1 + " " + num2 + " " + operation);


        //BigDecimal result = userService.doLogic(num1, num2, operation);
		
       // System.out.printf("Calculation completed: %s %n",result);

		System.out.println("Show forget");

		User user = this.userService.find(email);
		System.out.println(user);
		return new ModelAndView("forget","user",user);
	}
	
	
	@GetMapping({"/AdminDashboard"})
	public String admin() {
		System.out.println("show AdminDashboard page");
		return "AdminDashboard";
	}
	
	@GetMapping({"/Roles"})
	public String roles() {
		System.out.println("show roles page");
		return "Roles";
	}
	
	
	@GetMapping({"/LoginDashboard"})
	public String loginsh() {
		System.out.println("show loginsh page");
		return "LoginDashboard";
	}
	
	
	
	@GetMapping("/create")
	public String showCreate() {
		System.out.println("Show Create");

		return "create";
	}
	@GetMapping("/Roles")
	public String showRoles() {
		System.out.println("Roles");

		return "Roles";
	}
	*/
}
