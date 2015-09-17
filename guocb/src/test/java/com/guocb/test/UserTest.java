package com.guocb.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.guocb.service.UserService;

public class UserTest extends BaseTest {

	@Autowired
	UserService userService;

	@Test
	public void test_search_user() throws Exception {
		userService.searchUsers();
	}
}
