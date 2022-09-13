package org.wdba.wdba.service;

import java.util.List;

import org.wdba.wdba.bean.*;
import org.wdba.wdba.dao.UserDao;
import org.wdba.wdba.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public List<User> listUsers(){

		List<User> users = userDao.listUsers();

		//users.removeIf(user-> user.getStatus()!="A");
		//users.removeIf(user-> !"A".equals(user.getStatus()));
		

		return users;
	}

	public User findUser(int idUser) {

		return userDao.findUser(idUser);
	}

	public void createUser(User user) {

		this.validateUser(user);
		//user.setStatus("A");
        userDao.createUser(user);
	}

    public void modifyUser(User user) {

    	this.validateUser(user);
    	userDao.modifyUser(user);
    }

    public void deleteUser(int idUser) {

    	userDao.deleteUser(idUser);
    }

    
    public int  admincount(){

		System.out.println("in admin count pass service");

		//users.removeIf(user-> user.getStatus()!="A");
		//users.removeIf(user-> !"A".equals(user.getStatus()));
		int a= this.userDao.findTotal();
		
    	return a;
	}
    
    public User forgetPass(String username){

		System.out.println("username in forget pass service="+username);

		//users.removeIf(user-> user.getStatus()!="A");
		//users.removeIf(user-> !"A".equals(user.getStatus()));
		
    	return userDao.findPassword(username);
	}
    private void validateUser(User user) {

    	if (user.getFirstName().isEmpty() ||
    		user.getLastName().isEmpty() ||
    		user.getUsername().isEmpty()) {
    		throw new RuntimeException("Invalid User Data " + user);
    	}
    }
}




