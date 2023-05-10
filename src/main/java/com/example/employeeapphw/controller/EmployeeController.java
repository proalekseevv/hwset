package com.example.employeeapphw.controller;


import com.example.employeeapphw.model.Employee;
import com.example.employeeapphw.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class  EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/add")
    public Employee add(@RequestParam String firstName , @RequestParam String lastName) {
        return employeeService.add(firstName, lastName);

    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam String firstName , @RequestParam String lastName) {
        return employeeService.remove(firstName, lastName);

    }

    @GetMapping("/find")
    public Employee find(@RequestParam String firstName , @RequestParam String lastName) {
        return employeeService.remove(firstName, lastName);

    }

    @GetMapping
    public Collection<Employee> findAll() {
        return employeeService.findAll();

    }








}
