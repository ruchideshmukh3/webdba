package org.wdba.wdba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.wdba.wdba.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping({"/","/LoginPage"})
	public String index() {
		System.out.println("show Login page");
		return "LoginPage";
	}
	
	

}
