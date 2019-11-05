package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	
	@Autowired
	private HttpSession session;
	

	@RequestMapping("")
	public String index() {
		return "exam02";

	}

	@RequestMapping("/date")
	public String receiveDate(Integer num1, Integer num2) {
		Integer answer = num1 + num2;

		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", answer);

		return "exam02-result";

	}

	@RequestMapping("/page1")
	public String result1() {
		return "exam02-result";

	}

	@RequestMapping("/page2")
	public String result2() {
		return "exam02-result2";

	}

}
