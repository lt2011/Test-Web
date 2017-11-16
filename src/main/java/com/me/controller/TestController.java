package com.me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.me.model.USERS;
import com.me.service.TestService;

@Controller
public class TestController {
		
	@Autowired
	private TestService testService;
	/***
	 * 处理注册的表单提交
	 */
	@RequestMapping(value="testAdd.do")
	public String add(@ModelAttribute USERS users){
//		testService.insertUsers(users);
		return "ok.html";
	}
	
}
