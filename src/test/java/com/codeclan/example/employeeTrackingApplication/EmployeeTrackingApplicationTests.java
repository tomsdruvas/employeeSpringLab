package com.codeclan.example.employeeTrackingApplication;

import com.codeclan.example.employeeTrackingApplication.models.Department;
import com.codeclan.example.employeeTrackingApplication.models.Employee;
import com.codeclan.example.employeeTrackingApplication.models.Project;
import com.codeclan.example.employeeTrackingApplication.repositories.DepartmentRepository;
import com.codeclan.example.employeeTrackingApplication.repositories.EmployeeRepository;
import com.codeclan.example.employeeTrackingApplication.repositories.ProjectRepository;
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

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test public void createEmployee(){
		Department department = new Department("DIY");
		departmentRepository.save(department);

		Employee employee = new Employee("Carl", 25, "AZ345", department);
		employeeRepository.save(employee);

		Employee employee1 = new Employee("Dave", 27, "AZ3235345", department);
		employeeRepository.save(employee1);


	}

	@Test public void addEmployeeAndProject(){
		Department department = new Department("Gardening");
		departmentRepository.save(department);

		Employee employee = new Employee("Steve", 43, "AZ1", department);
		employeeRepository.save(employee);
		Employee employee2 = new Employee("Dave", 27, "AZ3235345", department);
		employeeRepository.save(employee2);

		Project project = new Project("Landscaping", 30);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);

		project.addEmployee(employee2);
		projectRepository.save(project);

	}


}
