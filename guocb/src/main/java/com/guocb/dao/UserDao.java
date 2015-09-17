package com.guocb.dao;

import java.util.List;

import com.guocb.entity.User;

public interface UserDao {

	List<User> searchAll() throws Exception;
}
