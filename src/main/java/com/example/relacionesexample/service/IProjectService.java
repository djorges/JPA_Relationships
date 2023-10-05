package com.example.relacionesexample.service;

import com.example.relacionesexample.entity.ProjectEntity;

import java.util.List;

public interface IProjectService {
    ProjectEntity saveProject(ProjectEntity entity);
    List<ProjectEntity> getAllProjects();
    void deleteProject(Long id);
}
