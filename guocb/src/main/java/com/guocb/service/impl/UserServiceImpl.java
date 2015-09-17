package com.guocb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guocb.dao.UserDao;
import com.guocb.entity.User;
import com.guocb.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	public List<User> searchUsers() throws Exception {
		return userDao.searchAll();
	}

}
