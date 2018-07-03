package com.thd.note.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/x")
public class AController {

	@RequestMapping(value="/a")
	public String a(HttpServletRequest req){
		HttpSession sess = req.getSession();
		sess.setAttribute("name","devil13th");
		
		System.out.println(sess.getAttribute("name"));
		System.out.println("xxx");
		return "index";
	}
}
