package com.thd.note.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thd.note.pojo.UserModel;

@RestController
@RequestMapping(value="/rest")
public class RestfulController {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/t01",method=RequestMethod.GET)
	public UserModel t01(String username,String password) {
		System.out.println("t01");
		System.out.println("username:" + username);
		System.out.println("password:" + password);
		
		UserModel u = new UserModel();
		u.setUsername(username);
		u.setPassword(password);
		return u;
	}
	
	@RequestMapping(value="/t02",method=RequestMethod.GET)
	public UserModel t02(HttpServletRequest request) {
		System.out.println("t02");
		System.out.println("username:" + request.getParameter("username"));
		System.out.println("password:" + request.getParameter("password"));
		
		UserModel u = new UserModel();
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		return u;
	}
	
	@RequestMapping(value="/t03")
	public UserModel t03(UserModel user) {
		System.out.println("t03");
		System.out.println("username:" + user.getUsername());
		System.out.println("password:" + user.getPassword());
		
		UserModel u = new UserModel();
		u.setUsername(user.getUsername());
		u.setPassword(user.getPassword());
		return u;
	}
	
	@RequestMapping(value="/t04/{username}/{password}",method=RequestMethod.GET)
	public UserModel t04(@PathVariable String username,@PathVariable String password) {
		System.out.println("t04");
		System.out.println("username:" + username);
		System.out.println("password:" + password);
		
		UserModel u = new UserModel();
		u.setUsername(username);
		u.setPassword(password);
		return u;
	}

	@RequestMapping(value="/t05",method=RequestMethod.POST)
	public UserModel t05(@RequestBody  UserModel user) {
		System.out.println("t05");
		System.out.println("username:" + user.getUsername());
		System.out.println("password:" + user.getPassword());
		
		UserModel u = new UserModel();
		u.setUsername(user.getUsername());
		u.setPassword(user.getPassword());
		return u;
	}
}
