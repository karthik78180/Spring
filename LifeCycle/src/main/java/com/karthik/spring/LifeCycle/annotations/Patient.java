package com.karthik.spring.LifeCycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void hi() {
		System.out.println("inside init method");
	}

	@PreDestroy
	public void bye() {
		System.out.println("inside destroy method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
