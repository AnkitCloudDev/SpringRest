package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> geEmployees();
    public Employee findEmployeebyId(int theid);
    public void saveEmployee(Employee employee);
    public void deleteEmployee(int eid);
}
