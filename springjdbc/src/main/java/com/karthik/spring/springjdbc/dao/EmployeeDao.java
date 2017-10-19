package com.karthik.spring.springjdbc.dao;

import com.karthik.spring.springjdbc.dto.Employee;

public interface EmployeeDao {
	
	int create(Employee employee);
	int update(Employee employee);
	int delete(Employee employee);
	
	Employee read(int id);
}
