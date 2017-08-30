package com.karthik.spring.LifeCycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/karthik/spring/LifeCycle/annotations/config.xml");
		 // ApplicationContext class does not have the registration code to configure the pre shutdown hook
		// so we will go for abstractApllicationcontext 
	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/karthik/spring/LifeCycle/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		//configuring preshutdown hook
		context.registerShutdownHook();
		

	}

}
