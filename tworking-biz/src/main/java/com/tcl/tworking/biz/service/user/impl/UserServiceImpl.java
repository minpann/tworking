package com.tcl.tworking.biz.service.user.impl;

import com.tcl.tworking.biz.service.user.UserService;
import com.tcl.tworking.persistence.dao.UserDao;
import com.tcl.tworking.persistence.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

}
