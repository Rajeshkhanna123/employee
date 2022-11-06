package com.org.cts.service;


import com.org.cts.model.Employee;
import com.org.cts.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService1 implements EmployeeService{
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }
}
