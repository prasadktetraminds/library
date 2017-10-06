/**
 * 
 */
package com.purplemint.lms.api.entities;

import org.springframework.data.annotation.Id;

/**
 * @author mmalyala
 *
 */
public class Employee {
	
	@Id
	private String id;
	
	private String name;
	private String username;
	private String password;
	private String device;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	
	

}
