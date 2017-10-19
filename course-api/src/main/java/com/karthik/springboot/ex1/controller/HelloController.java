package com.karthik.springboot.ex1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
		@RequestMapping("/helloa")
		public String sayHi() {
			return "HI";		
		}
}
