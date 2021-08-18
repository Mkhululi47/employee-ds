package com.votela.ds.employee.service;

import com.votela.ds.employee.model.Employee;
import com.votela.ds.employee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeService implements IEmployeeService {
    private final EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Employee> findAll() {
        Collection<Employee> employees = repository.findAll();
        return employees;
    }

    @Override
    public Employee save(Employee employee) {
        return repository.save(employee);
    }
}
