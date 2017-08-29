package com.karthik.Assignment.SpringAssign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/karthik/Assignment/SpringAssign/config.xml");
		ShoppingCart shoppingcart =(ShoppingCart) context.getBean("shoppingcart");
		
		System.out.println(shoppingcart);
	}

}
