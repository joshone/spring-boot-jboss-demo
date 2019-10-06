package com.example.demo.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@RequestMapping
@RestController
public class HelloController {

	@RequestMapping("/")
	@GetMapping
	public String index() {
		return "index";
	}

	@GetMapping("/hello")
	public String sayHello() {
//		model.addAttribute("name", name);
		return "hello";
	}
}
