package com.karthik.spring.constinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/karthik/spring/constinjection/config.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}

}
