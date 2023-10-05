package com.example.relacionesexample.mappers;

import com.example.relacionesexample.entity.ProjectEntity;
import com.example.relacionesexample.model.Project;

import java.util.stream.Collectors;

public class ProjectMapper {
    public static ProjectEntity toEntity(Project project){
        return new ProjectEntity(
                project.getId(),
                project.getName(),
                project.getDescription(),
                project.getEmployeeSet().stream().map(EmployeeMapper::toEntity).collect(Collectors.toSet())
        );
    }
    public static Project toModel(ProjectEntity project){
        return new Project(
                project.getId(),
                project.getName(),
                project.getDescription(),
                project.getEmployeeSet().stream().map(EmployeeMapper::toModel).collect(Collectors.toSet())
        );
    }
}
