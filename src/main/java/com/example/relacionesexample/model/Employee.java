package com.example.relacionesexample.model;

import com.example.relacionesexample.entity.ProjectEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;

    private String name;

    private String surname;

    private Set<Project> projectSet = new HashSet<>();

}
