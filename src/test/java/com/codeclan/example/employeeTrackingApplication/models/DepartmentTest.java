package com.codeclan.example.employeeTrackingApplication.models;

import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentTest {
    Department department;

    @Test
    public void getName() {
        department = new Department("DIY");
        assertEquals("DIY", department.getName());

    }
}