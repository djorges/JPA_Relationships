package com.example.relacionesexample.repository;

import com.example.relacionesexample.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectRepository extends JpaRepository<ProjectEntity, Long> {
}
