package com.votela.ds.employee.service;

import com.votela.ds.employee.model.Employee;

import java.util.Collection;

public interface IEmployeeService {
    Collection<Employee> findAll();
    Employee save(Employee employee);
}
