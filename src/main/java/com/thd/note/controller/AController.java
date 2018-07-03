package com.thd.note.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value="/x")
public class AController {
	
	/**
	 * url : http://127.0.0.1:8000/thd-note-web/x/a
	 * @param req
	 * @return
	 */
	@RequestMapping(value="/a")
	public String a(HttpServletRequest req){
		HttpSession sess = req.getSession();
		sess.setAttribute("name","devil13th");
		
		System.out.println(sess.getAttribute("name"));
		System.out.println("xxx");
		return "index";
	}
}
