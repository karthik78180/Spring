package com.karthik.spring.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/karthik/spring/dependencycheck/config.xml");
		// ApplicationContext class does not have the registration code to configure the
		// pre shutdown hook
		// so we will go for abstractApllicationcontext
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("com/karthik/spring/LifeCycle/config.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println(prescription);

	}

}
