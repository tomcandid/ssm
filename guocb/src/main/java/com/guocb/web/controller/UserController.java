package com.guocb.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guocb.entity.User;
import com.guocb.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("list")
	public String list(Model model) throws Exception {
		model.addAttribute("users", userService.searchUsers());
		return "user_list";
	}

	@RequestMapping("json")
	@ResponseBody
	public List<User> userList() throws Exception{
		return userService.searchUsers();
	}
}
