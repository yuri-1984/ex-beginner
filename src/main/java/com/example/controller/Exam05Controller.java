package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repository.MemberRepository;

@Controller
@RequestMapping("/exam05")
public class Exam05Controller {
	
	@Autowired
	private MemberRepository repository;
	
	
	@RequestMapping("")
	public String index() {
		return "exam05";
		
		
	}
	
	@RequestMapping("/excute")
	public String excute() {
		
		repository.findAll().forEache();
		
		
		
		
		
	}
	
	
	

}
