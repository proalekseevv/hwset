package com.example.employeeapphw.service;

import com.example.employeeapphw.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String lastName, String  firstName);
    Employee remove(String lastName, String firstName);
    Employee find(String lastName, String firstName);
    Collection<Employee> findAll();
}
