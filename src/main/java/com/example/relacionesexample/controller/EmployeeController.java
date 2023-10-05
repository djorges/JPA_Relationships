package com.example.relacionesexample.controller;

import com.example.relacionesexample.entity.EmployeeEntity;
import com.example.relacionesexample.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService service;

    @PutMapping("/{empId}/project/{projectId}")
    public EmployeeEntity assignProjectToEmployee(
        @PathVariable Long empId,
        @PathVariable Long projectId
    ){
        return service.assignProjectToEmployee(empId, projectId);
    }
}
