package com.codeclan.example.employeeTrackingApplication.repositories;

import com.codeclan.example.employeeTrackingApplication.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
