package com.codeclan.example.employeeTrackingApplication.repositories;

import com.codeclan.example.employeeTrackingApplication.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
