package com.employeeManagement.employeeManagement.service;

import com.employeeManagement.employeeManagement.model.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeService {

    // Save operation And Update Operation
    String upsertEmployee(Employee employee) throws IOException;

    // Read operation
    List<Employee> fetchEmployeeList() throws IOException;

    // Read operation by Id
    Object fetchEmployeeById(String employeeId) throws IOException;

    // Delete operation
    String deleteEmployeeById(String employeeId) throws IOException;
}