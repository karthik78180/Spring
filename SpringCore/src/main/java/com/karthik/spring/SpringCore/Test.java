package com.karthik.spring.SpringCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//create a spring container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		//get the bean b method ctx.getbean 
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee ID:"+emp.getId());
		System.out.println("employee name "+emp.getName());
		

	}

}
