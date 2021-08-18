package com.votela.ds.employee.rest;

import com.votela.ds.employee.model.Employee;
import com.votela.ds.employee.service.IEmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class EmployeeController {

    private final IEmployeeService service;

    public EmployeeController(IEmployeeService service) {
        this.service = service;
    }

    @GetMapping("/employees")
    public Collection<Employee> getEmployees(){
        return service.findAll();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.save(employee);
    }
}
