package com.example.demo.rest;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //
@GetMapping("/employees")
    public List<Employee> getEmployees()
{
    return employeeService.geEmployees();
}

@GetMapping("/employees/{id}")
    public Employee getEmployeebyId(@PathVariable int id)
{
Employee theEmployee=employeeService.findEmployeebyId(id);
if(theEmployee==null)
    throw new RuntimeException("Employee ID not Found: "+id);

return theEmployee;

}
    @PostMapping("/employees/")
    public Employee saveEmployee(@RequestBody Employee employee)
    {
//        Just in case they send an ID in json
        employee.setId(0);
        employeeService.saveEmployee(employee);
        return employee;
    }
    @PutMapping("/employees/")
    public Employee upDateEmployee(@RequestBody Employee employee)
    {

        employeeService.saveEmployee(employee);
        return employee;
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        Employee temp= employeeService.findEmployeebyId(id);
        if(temp==null)
            throw new RuntimeException("The Employee does not exist in our database: "+id);
        employeeService.deleteEmployee(id);
    return "Deleted employee with id: "+id;
    }




}
