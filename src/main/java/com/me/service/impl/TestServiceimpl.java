package com.me.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.dao.TestMapper;
import com.me.model.USERS;
import com.me.service.TestService;

@Service("testService")
public class TestServiceimpl implements TestService {

	@Autowired
	private TestMapper testMapper;
	
	@Override
	public void insertUsers(USERS users) {
		testMapper.insertUsers(users);
	}
}
