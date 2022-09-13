package org.wdba.wdba.bean;

import java.util.Date;
import java.util.Objects;

public class User {

	int idUser;
	String firstName;
	String lastName;
	String username;
	String password;
	int phone;
	
	public User() {

	}
	public User(int idUser, String firstName, String lastName, String username, String password, int phone) {
		super();
		this.idUser = idUser;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.phone = phone;
		
	}

	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

	
	
	
	
	

	
	@Override
	public int hashCode() {
		return Objects.hash(firstName, idUser, lastName, password, phone, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(firstName, other.firstName) && idUser == other.idUser
				&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
				&& phone == other.phone && Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", phone=" + phone + "]";
	}
}
