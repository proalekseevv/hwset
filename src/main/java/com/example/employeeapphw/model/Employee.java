package com.example.employeeapphw.model;

import java.util.Objects;

public class Employee {

    private final String firstName;

    private final String lastName;


    // Конструктор
    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }


    // Геттеры

    public String getLastName() {
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
