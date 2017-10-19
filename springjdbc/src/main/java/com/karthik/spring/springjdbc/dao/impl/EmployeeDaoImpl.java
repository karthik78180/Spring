package com.karthik.spring.springjdbc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.karthik.spring.springjdbc.dao.EmployeeDao;
import com.karthik.spring.springjdbc.dao.rowmapper.EmployeeRowMapper;
import com.karthik.spring.springjdbc.dto.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());

		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql= "update employee set firstname=?, lastname=? where id=?";
		int result2 = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result2;
	}
	
	@Override
	public int delete(Employee employee) {
		String sql= "delete from employee  where id=?";
		int result3 = jdbcTemplate.update(sql, employee.getId());
		return result3;
	}
	
	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowMapper= new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper,id);
		return employee;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}




}
