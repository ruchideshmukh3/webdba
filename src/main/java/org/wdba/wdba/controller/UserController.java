package org.wdba.wdba.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.wdba.wdba.service.*;
import org.wdba.wdba.bean.User;
import org.wdba.wdba.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	
	@GetMapping("/list")
	public ModelAndView listUsers() {
		System.out.println("List Users");

		List<User> users = this.userService.listUsers();
		


		return new ModelAndView("list","users", users);
	}
	
	
	
	//Get mapping and post mapping for create
	
	@GetMapping("/create")
	public String showCreate() {
		System.out.println("Show Create");

		return "create";
	}

	@PostMapping("/create")
	public String createUser(HttpServletRequest request) {
		System.out.println("Create User");

		String first = request.getParameter("first");
		String last = request.getParameter("last");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");

        User user = this.createUser(null,first, last, username, password, phone);
        

        this.userService.createUser(user);

		return "redirect:/list";
	}

	
	
	//get mapping for delete
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		
		System.out.println("delete User");
		this.userService.deleteUser(id);
		return "redirect:/list";
	}
	
	
	//get mapping and post mapping for update
	@GetMapping("/update/{id}")
	public ModelAndView showUpdate(@PathVariable("id") int id) {

		System.out.println("Show Update");

		User user = this.userService.findUser(id);

		return new ModelAndView("update","user",user);
	}
	
	@PostMapping("/update")
	public String updateUser(HttpServletRequest request) {
		System.out.println("Update User");

		String id = request.getParameter("id");
		String first = request.getParameter("first");
		String last = request.getParameter("last");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");

		User user = this.createUser(id,first, last, username, password, phone);

		this.userService.modifyUser(user);

		return "redirect:/list";
	}

	
	
	
	private User createUser(String id, String first, String last, String username, String password, String phone) {

		User user = new User(Util.parseId(id),first.trim(),last.trim(),username.trim(),password,Util.parseId(phone));

		return user;
	}
	
	@GetMapping({"/chatbot"})
	public String chat() {
		System.out.println("show chat page");
		return "chatbot";
	}
	
	@GetMapping({"/forget"})
	public String forgetPassword() {
		//System.out.println("hhhhhhjjkkkkk");
		System.out.println("show forgetPassword page");
		return "forget";
	}
	
	@PostMapping("/forget")
	public ModelAndView getforget(@RequestParam("username")String username) {
		
		System.out.println("forget Users");

		User user = this.userService.forgetPass(username);
		


		return new ModelAndView("forget","users", user);
	}
	
	
	@GetMapping({"/AdminDashboard"})
	public ModelAndView admin() {
		
		
		
		int user = this.userService.admincount();
		
  System.out.println(user);

		return new ModelAndView("AdminDashboard","users", user);
		//System.out.println("show AdminDashboard page");
		//return "AdminDashboard";
	}
	/*
	@GetMapping({"/Roles"})
	public String roles() {
		System.out.println("show roles page");
		return "Roles";
	}
	
	*/
	
	@GetMapping("/Roles")
	public ModelAndView roles() {
		System.out.println("List Users");

		List<User> users = this.userService.listUsers();
		


		return new ModelAndView("Roles","users", users);
	}
	
	@GetMapping({"/","/LoginDashboard"})
	public String loginsh() {
		System.out.println("show------ loginsh page");
		return "LoginDashboard";
	}
	

	
	
}
