package org.wdba.wdba.bean;

public class Permission {
	
	
	
	int permission_id;
	String per_description;

	
	
	public Permission() {
		
		 permission_id=0;
		per_description="";
		
	}
	
	
	

	public Permission(int permission_id, String per_descriptio) {
		super();
		this.permission_id = permission_id;
		this.per_description = per_descriptio;
	}




	public int getPermission_id() {
		return permission_id;
	}




	public void setPermission_id(int permission_id) {
		this.permission_id = permission_id;
	}




	public String getPer_descriptio() {
		return per_description;
	}




	public void setPer_descriptio(String per_descriptio) {
		this.per_description = per_descriptio;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
