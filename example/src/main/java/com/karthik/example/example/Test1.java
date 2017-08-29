package com.karthik.example.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/karthik/example/example/configu.xml");
		ShoppingCar shoppingcar = (ShoppingCar) context.getBean("shoppingcar");
		System.out.println(shoppingcar);

	}

}
