package org.wdba.wdba.bean;

public class Roles {

	
	int role_id;
	String role_description;
	
	
	
	
	public Roles() {
		
		 role_id=0;
		 role_description="";
		
	}



	public Roles(int role_id, String role_description) {
		super();
		this.role_id = role_id;
		this.role_description = role_description;
	}




	public int getRole_id() {
		return role_id;
	}




	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}




	public String getRole_description() {
		return role_description;
	}




	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
