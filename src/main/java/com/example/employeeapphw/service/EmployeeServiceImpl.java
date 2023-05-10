package com.example.employeeapphw.service;

import com.example.employeeapphw.exception.EmployeeNotFoundException;
import com.example.employeeapphw.exception.EmployeeStorageIsFullException;
import com.example.employeeapphw.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final int EMPLOYEES_MAX_COUNT = 5 ;

    private final Set<Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new HashSet<>();
    }




    @Override
    public Employee add(String lastName, String firstName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)){
            throw new EmployeeNotFoundException(employee);
        }
        if (employees.size() == EMPLOYEES_MAX_COUNT ) {
            throw new EmployeeStorageIsFullException(employee);
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String lastName, String firstName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException(employee) ;
        }
        employees.remove(employee);

        return employee;
    }

    @Override
    public Employee find(String lastName, String firstName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException(employee) ;
        }

        return employee;
    }

    @Override
    public Collection<Employee> findAll() {

        return employees;
    }
}
