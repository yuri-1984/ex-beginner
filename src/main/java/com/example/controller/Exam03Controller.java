package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	private static final double TAX_RATE = 1.1;

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";

	}

	@RequestMapping("/date")
	public String date(int num1, int num2, int num3) {
		int answer1 = num1 + num2 + num3;
		int answer2 = (int) (answer1 * TAX_RATE);
		
		application.setAttribute("num1", num1);
		application.setAttribute("num2", num2);
		application.setAttribute("num3", num3);
		application.setAttribute("answer1", answer1);
		application.setAttribute("answer2", answer2);
		return "exam03-result";

	}

}
