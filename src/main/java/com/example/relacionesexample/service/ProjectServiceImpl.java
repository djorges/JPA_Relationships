package com.example.relacionesexample.service;

import com.example.relacionesexample.entity.ProjectEntity;
import com.example.relacionesexample.exception.ProjectNotFoundException;
import com.example.relacionesexample.repository.IProjectRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements IProjectService{
    @Autowired
    private IProjectRepository repository;

    @Override
    public ProjectEntity saveProject(ProjectEntity entity) {
        return repository.save(entity);
    }

    @Override
    public List<ProjectEntity> getAllProjects() {
        return repository.findAll();
    }

    @Override
    public void deleteProject(Long id) {
        val project = repository.findById(id).orElseThrow(() -> new ProjectNotFoundException("Project not found"));

        repository.delete(project);
    }
}
