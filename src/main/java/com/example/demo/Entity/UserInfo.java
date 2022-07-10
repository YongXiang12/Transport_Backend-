package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="User_signup_info")

public class UserInfo {

	@Id
	private Integer id ; 
	@Column(name = "email")
	private String email ;
	@Column(name = "password")
	private String password ;
	
	UserInfo(){
		
	}
	
	UserInfo(Integer id ,String email , String password){
		this.id = id ;
		this.email = email ;
		this.password = password ;
	}
	
	


	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
}
