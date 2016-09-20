package com.tcl.tworking.biz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcl.tworking.biz.service.UserService;
import com.tcl.tworking.persistence.dao.UserDao;
import com.tcl.tworking.persistence.model.User;

@Service("exampleService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

}
