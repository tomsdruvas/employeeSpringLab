package com.codeclan.example.employeeTrackingApplication.repositories;

import com.codeclan.example.employeeTrackingApplication.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
