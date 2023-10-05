package com.example.relacionesexample.mappers;

import com.example.relacionesexample.entity.EmployeeEntity;
import com.example.relacionesexample.model.Employee;

import java.util.stream.Collectors;

public class EmployeeMapper {
    public static EmployeeEntity toEntity(Employee employee){
        return new EmployeeEntity(
            employee.getId(),
            employee.getName(),
            employee.getSurname(),
            employee.getProjectSet().stream().map(ProjectMapper::toEntity).collect(Collectors.toSet())
        );
    }

    public static Employee toModel(EmployeeEntity employee){
        return new Employee(
                employee.getId(),
                employee.getName(),
                employee.getSurname(),
                employee.getProjectSet().stream().map(ProjectMapper::toModel).collect(Collectors.toSet())
        );
    }
}
