package com.shoukue.sqlite.pojo;

import java.io.Serializable;

/****
 * @Author:admin
 * @Description:User构建
 * @Date 2019/6/14 19:13
 *****/
public class User implements Serializable{
	private Long id;

	private String username;//用户名

	private String password;//密码，加密存储

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
}
