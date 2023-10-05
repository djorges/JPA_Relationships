package com.example.relacionesexample.service;

import com.example.relacionesexample.entity.EmployeeEntity;

public interface IEmployeeService {
    EmployeeEntity assignProjectToEmployee(Long empId, Long projectId);
}
