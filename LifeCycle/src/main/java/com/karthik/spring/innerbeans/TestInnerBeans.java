package com.karthik.spring.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerBeans {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/karthik/spring/innerbeans/config.xml");
		Employee employee=(Employee) context.getBean("employee");
		System.out.println(employee);

	}

}
