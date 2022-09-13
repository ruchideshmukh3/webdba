package org.wdba.wdba.service;



import java.math.MathContext;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	
	//@Autowired
	//LoginDao loginDao;
	
	
	String str="";
	public String doLogic(String email,
            String password) {

		if(email.contains("admin@gmail.com")&& password.contains("admin"))
		{
			System.out.println("Welcome Admin");
			
			str="admin";
		
		}
		else{
			str= "false";
		}
		
	return str;
	}
	
	

}
