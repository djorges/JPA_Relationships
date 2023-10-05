package com.example.relacionesexample.model;

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
public class Project{
    private Long id;

    private String name;

    private String description;

    private Set<Employee> employeeSet = new HashSet<>();
}