/**
 * 2015-5-13
 *testSSH
 *LoginAction.java
 */
package com.action;


import com.opensymphony.xwork2.ActionSupport;

/**
 * @author zy
 *
 */
@SuppressWarnings("deprecation")
public class LoginAction extends ActionSupport{
	private String username=null;
	private String password=null;
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String execute() throws Exception {  
	    if(!getUsername().equals("admin") || !getPassword().equals("admin")){  
	            addActionError("Invalid user name or password! Please try again!");
	            username="shit!";
	            password="shit!";
	            return ERROR;  
	    }  
	    if(getUsername().equals("admin") || getPassword().equals("admin")){  
	      return SUCCESS;  
	    }else{  
	      return NONE;  
	    }  
	  }  

}
