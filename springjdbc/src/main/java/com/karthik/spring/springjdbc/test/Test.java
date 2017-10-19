package com.karthik.spring.springjdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.karthik.spring.springjdbc.dao.EmployeeDao;
import com.karthik.spring.springjdbc.dto.Employee;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/karthik/spring/springjdbc/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");

/*		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("karthik2");
		employee.setLastName("kavuru");
		//int result = dao.create(employee);
		//int result2 = dao.update(employee);
		//int result3=dao.delete(employee);
*/		Employee employee = dao.read(1);

		//System.out.println("no of records inserted :" + result);
		//System.out.println("number of records updated :"+result2);
		System.out.println("Employee Record :"+employee);
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
