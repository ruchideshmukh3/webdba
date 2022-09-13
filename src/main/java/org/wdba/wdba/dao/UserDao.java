package org.wdba.wdba.dao;

import java.util.ArrayList;
import java.util.List;

import org.wdba.wdba.bean.*;
import org.wdba.wdba.util.*;

import org.wdba.wdba.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	//List<User> users;

		@Autowired
		JdbcTemplate jdbcTemplate;


		public List<User> listUsers(){

			String sql = "SELECT * FROM USER";

			return jdbcTemplate.query(sql, new UserMapper());
		}

		public User findUser(int idUser) {

			String sql = "SELECT * FROM USER WHERE ID_USER = ?";

			return jdbcTemplate.queryForObject(sql, new UserMapper(), idUser);
		}
		public User findByUsername(String username) {
			
			
			System.out.println("username"+username);
			
			List<User> users;
			String sql = "SELECT * FROM USER WHERE USERNAME =?";

			users = jdbcTemplate.query(sql, new UserMapper(),username);

			return users.isEmpty()?null:users.get(0);
		}
	public User findPassword(String username) {
			
			
			System.out.println("username in find password dao"+username);
			
			//List<User> users;
			String sql = "SELECT * FROM USER WHERE USERNAME =?";

			
			return jdbcTemplate.queryForObject(sql, new UserMapper(), username);
			
		}
	public int findTotal() {
		
		
		System.out.println("in find total dao");
		
	
		
		//String s1="select count(*) AS ? from USER";
	
		
		int result = jdbcTemplate.queryForObject(
			    "SELECT COUNT(*) FROM USER", Integer.class);
		return result;
		
	}
	
	
	/*
	
	public int findTotalAdmin() {
		
		
		System.out.println("in find total admin dao");
		
	
		
		//String s1="select count(*) AS ? from USER";
	
		
		int result = jdbcTemplate.queryForObject(
			    "SELECT COUNT(*) FROM USER WHERE ROLE=ADMIN'", Integer.class);
		return result;
		
	}
	
	public int findTotalUser() {
		
		
		System.out.println("in find total user dao");
		
	
		
		//String s1="select count(*) AS ? from USER";
	
		
		int result = jdbcTemplate.queryForObject(
			    "SELECT COUNT(*) FROM USER WHERE ROLE='USER'", Integer.class);
		return result;
		
	}
	public int findTotalGuest() {
		
		
		System.out.println("in find total guest dao");
		
	
		
		//String s1="select count(*) AS ? from USER";
	
		
		int result = jdbcTemplate.queryForObject(
			    "SELECT COUNT(*) FROM USER WHERE ROLE='GUEST'", Integer.class);
		return result;
		
	}
	*/
	
		
		public void createUser(User user) {

	        String sql = "INSERT USER(USERNAME,PASSWORD,FIRST_NAME,LAST_NAME,PHONE) " +
	                     "VALUES(?,?,?,?,?)";

	        jdbcTemplate.update(sql,new Object[] {user.getUsername(), user.getPassword(), user.getFirstName(),
	        		                              user.getLastName(), user.getPhone()});
		}

	    public void modifyUser(User user) {

	        String sql = "UPDATE USER SET USERNAME = ?, FIRST_NAME = ?, LAST_NAME = ?, PHONE = ? " +
	                     "WHERE ID_USER = ?";

	        jdbcTemplate.update(sql,new Object[] {user.getUsername(), user.getFirstName(),
	                user.getLastName(), user.getPhone(), user.getIdUser()});
	    }

	    public void deleteUser(int idUser) {

			String sql = "DELETE FROM USER WHERE ID_USER = ?";

	        jdbcTemplate.update(sql,new Object[] {idUser});
	    }



}
