package com.karthik.spring.constinjection.ambiguity;

public class Addition {
	Addition (int a, int b){
		System.out.println("inside constructor integer");
	}
	
	public Addition(double a, double b) {
		System.out.println("inside double constructor");
	}
	public Addition(String a, double b) {
		System.out.println("inside String constructor");
	}
	

}
