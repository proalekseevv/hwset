package com.example.employeeapphw.exception;

import com.example.employeeapphw.model.Employee;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(Employee employee) {
        super("Сотрудник не найден: " + employee.toString());
    }
}
