package com.me.model;

import org.springframework.stereotype.Component;

/**
 * 用户信息模型
 * 
 * @author liutao liutao2017年7月8日
 */
@Component
public class USERS {

	private int ID;
	private String name;
	private String sex;
	private int my_code;
	private int given_code;

	public USERS() {

	}

	public USERS(int iD, String name, String sex, int my_code) {
		super();
		ID = iD;
		this.name = name;
		this.sex = sex;
		this.my_code = my_code;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getMy_code() {
		return my_code;
	}

	public void setMy_code(int my_code) {
		this.my_code = my_code;
	}

	public int getGiven_code() {
		return given_code;
	}

	public void setGiven_code(int given_code) {
		this.given_code = given_code;
	}

}