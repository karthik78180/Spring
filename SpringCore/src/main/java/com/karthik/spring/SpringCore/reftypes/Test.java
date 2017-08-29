package com.karthik.spring.SpringCore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//create a spring container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/karthik/spring/SpringCore/reftypes/config.xml");
		//get the bean b method ctx.getbean 
		Student student  = (Student) ctx.getBean("student");
		System.out.println(student);
	}

}

