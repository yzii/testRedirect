/**
 * 2015-5-28
 *testDelay
 *LoginAction2.java
 */
package com.action;

/**
 * @author zy
 *
 */
public class LoginAction2 {
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
	public void outPut(){
		System.out.println(username);
		System.out.println(password);
	}
	
}
