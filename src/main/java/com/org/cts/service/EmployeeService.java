package com.org.cts.service;

import com.org.cts.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeService {
    public void addEmployee(Employee employee);
}
