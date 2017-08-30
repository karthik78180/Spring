package com.karthik.spring.constinjection;

public class Employee {
	private int id;
	private Address address;

	public Employee(int id, Address address) {
		this.id = id;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + getId() + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
