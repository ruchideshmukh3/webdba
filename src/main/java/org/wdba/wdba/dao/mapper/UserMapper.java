package org.wdba.wdba.dao.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.wdba.wdba.bean.User;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
	

	
		User user = new User();

		user.setIdUser(rs.getInt("ID_USER"));
		user.setFirstName(rs.getString("FIRST_NAME"));
		user.setLastName(rs.getString("LAST_NAME"));
		user.setUsername(rs.getString("USERNAME"));
		user.setPassword(rs.getString("PASSWORD"));
		user.setPhone(rs.getInt("PHONE"));
		
		return user;
	
	
	
}
}