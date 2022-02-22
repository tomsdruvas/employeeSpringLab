package com.codeclan.example.employeeTrackingApplication;

import com.codeclan.example.employeeTrackingApplication.models.Department;
import com.codeclan.example.employeeTrackingApplication.models.Employee;
import com.codeclan.example.employeeTrackingApplication.repositories.DepartmentRepository;
import com.codeclan.example.employeeTrackingApplication.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test public void createEmployee(){
		Department department = new Department("DIY");
		departmentRepository.save(department);

		Employee employee = new Employee("Carl", 25, "AZ345", department);
		employeeRepository.save(employee);
	}


}
