package com.example.relacionesexample.controller;

import com.example.relacionesexample.entity.EmployeeEntity;
import com.example.relacionesexample.entity.ProjectEntity;
import com.example.relacionesexample.service.IProjectService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/project")
public class ProjectController {
    @Autowired
    private IProjectService projectService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ProjectEntity saveProject(
        @RequestBody ProjectEntity project
    ){
        return projectService.saveProject(project);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<ProjectEntity> getAllProjects(){
        return projectService.getAllProjects();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void removeProject(
        @PathVariable Long id
    ){
        projectService.deleteProject(id);
    }
}
