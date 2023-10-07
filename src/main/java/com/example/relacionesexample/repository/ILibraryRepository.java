package com.example.relacionesexample.repository;

import com.example.relacionesexample.entity.DomainType;
import com.example.relacionesexample.entity.LibraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILibraryRepository extends JpaRepository<LibraryEntity, Long> {
    List<LibraryEntity> findByName(String name);
    List<LibraryEntity> findByDomainType(DomainType domainType);
}