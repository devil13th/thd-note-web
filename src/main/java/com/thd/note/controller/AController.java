package com.thd.note.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value="/x")
public class AController {

	@RequestMapping(value="/a")
	public String a(){
		System.out.println("xxx");
		return "index";
	}
}
