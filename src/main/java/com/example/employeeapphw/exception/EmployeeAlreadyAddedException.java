package com.example.employeeapphw.exception;

import com.example.employeeapphw.model.Employee;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException(Employee employee) {
        super("Такой сотрудник уже существует: " + employee.toString());
    }
}
