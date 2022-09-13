package org.wdba.wdba.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.wdba.wdba.service.LoginService;

@Controller
public class LoginController {
	/*
	@Autowired
	LoginService loginService;
	
	@GetMapping({"/","LoginPage"})
	public String index() {
		System.out.println("show Login page");
		return "LoginPage";
	}
	
	@PostMapping("/LoginDashboard")
	public ModelAndView show(@RequestParam("email") String email,
			                 @RequestParam("password") String password) {

		System.out.println(email + " " + password );

		String result = loginService.doLogic(email, password);
		
        System.out.printf("validation completed: %s %n",result);
        
      if(result.contains("admin"))
      {

		return new ModelAndView("LoginDashboard","res", result);
      }
      else {
    	  return new ModelAndView("LoginPage","res", result);
    	  
      }
      
      
	}
	*/

}
