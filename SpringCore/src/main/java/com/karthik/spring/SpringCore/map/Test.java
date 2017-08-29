package com.karthik.spring.SpringCore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//create a spring container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/karthik/spring/SpringCore/map/config.xml");
		//get the bean b method ctx.getbean 
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println(customer);
	}

}
