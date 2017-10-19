package com.kavuru.springBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseApiController {
	
	@RequestMapping("/hello")
	public String SampleApi () {
		return "Hi ";
		
	}

}
