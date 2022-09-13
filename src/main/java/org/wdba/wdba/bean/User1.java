package org.wdba.wdba.bean;


public class User1 {
	String username;
	String password;
	String first_name;
	String last_name;
	String email_id;
	int phone_no;
	byte photo;
	
	
	
	public User1() {
		String username="";
		String password="";
		String first_name="";
		String last_name="";
		String email_id="";
		int phone_no=0;
		byte photo=0;
		
	}




	public User1(String username, String password, String first_name, String last_name, String email_id, int phone_no,
			byte photo) {
		super();
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
		this.phone_no = phone_no;
		this.photo = photo;
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




	public String getFirst_name() {
		return first_name;
	}




	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}




	public String getLast_name() {
		return last_name;
	}




	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}




	public String getEmail_id() {
		return email_id;
	}




	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}




	public int getPhone_no() {
		return phone_no;
	}




	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}




	public byte getPhoto() {
		return photo;
	}




	public void setPhoto(byte photo) {
		this.photo = photo;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
