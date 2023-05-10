package com.example.employeeapphw.exception;

import com.example.employeeapphw.model.Employee;

public class EmployeeStorageIsFullException extends RuntimeException{
    public EmployeeStorageIsFullException(Employee employee) {
        super("Хранилище сотрудников заполнено");
    }

}
