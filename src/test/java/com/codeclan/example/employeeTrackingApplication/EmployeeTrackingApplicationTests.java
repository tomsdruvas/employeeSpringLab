package com.codeclan.example.employeeTrackingApplication;

import com.codeclan.example.employeeTrackingApplication.models.Employee;
import com.codeclan.example.employeeTrackingApplication.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test public void createEmployee(){
		Employee employee = new Employee("Carl", 25, "AZ345");
		employeeRepository.save(employee);
	}

}
