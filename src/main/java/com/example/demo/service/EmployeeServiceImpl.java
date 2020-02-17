package com.example.demo.service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }




    @Override

    public List<Employee> geEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeebyId(int theid) {
        Optional<Employee> employee= employeeRepository.findById(theid);
        Employee temp=null;
        if(employee.isPresent())
        {
            temp=employee.get();
        }
        else
            throw new RuntimeException("Sorry Couldnt find the Employee: "+theid);
        return temp;

    }

    @Override
    public void saveEmployee(Employee employee) {
    employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int eid) {

        employeeRepository.deleteById(eid);
    }
}
