package com.example.relacionesexample.service;

import com.example.relacionesexample.entity.EmployeeEntity;
import com.example.relacionesexample.entity.ProjectEntity;
import com.example.relacionesexample.repository.IEmployeeRepository;
import com.example.relacionesexample.repository.IProjectRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
    private IProjectRepository projectRepository;

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity assignProjectToEmployee(Long empId, Long projectId) {
        val employee = employeeRepository.findById(empId).get();
        val project = projectRepository.findById(projectId).get();

        Set<ProjectEntity> projectSet = employee.getProjectSet();
        projectSet.add(project);
        employee.setProjectSet(projectSet);

        return employeeRepository.save(employee);
    }
}
