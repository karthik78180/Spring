package com.karthik.spring.SpringCore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.karthik.spring.SpringCore.reftypes.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//create a spring container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/karthik/spring/SpringCore/properties/config.xml");
		//get the bean b method ctx.getbean 
		CountriesandLanguages countriesandLangs  = (CountriesandLanguages) ctx.getBean("countriesandLangs");
		System.out.println(countriesandLangs);
	}

}