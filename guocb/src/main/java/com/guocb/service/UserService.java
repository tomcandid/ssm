package com.guocb.service;

import java.util.List;

import com.guocb.entity.User;

public interface UserService {

	List<User> searchUsers() throws Exception;
}
